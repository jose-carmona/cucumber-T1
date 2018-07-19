package org.jose.bdd.steps;

import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Cuando;

import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Steps {

  RequestSpecification rs;
  Response response;

  @Before
  public void setUp() {
    baseURI = "https://rickandmortyapi.com";
    rs = given();
  }

  @After
  public void afterScenario() {
  }

  @Dado("^que el ID del personaje es (\\d+)$")
  public void que_el_ID_del_personaje_es(int Id) throws Throwable {
    rs = rs.pathParam("Id", Id);
  }

  @Dado("^que el nombre del personaje a buscar es \"([^\"]*)\"$")
  public void que_el_nombre_del_personaje_a_buscar_es(String name) throws Throwable {
    rs = rs.param("name", name);
  }

  @Dado("^que el estado del personaje a buscar es \"([^\"]*)\"$")
  public void que_el_estado_del_personaje_a_buscar_es(String status) throws Throwable {
    rs = rs.param("status", status);
  }

  @Cuando("^invoco al API de personajes de Rick y Morty por Id$")
  public void invoco_al_API_de_personajes_de_Rick_y_Morty_Id() throws Throwable {
    response = rs.when().get("/api/character/{Id}");
    response.then().assertThat().statusCode(200);
  }

  @Cuando("^invoco al API de personajes de Rick y Morty filtrando por nombre$")
  public void invoco_al_API_de_personajes_de_Rick_y_Morty_filtrando_por_nombre() throws Throwable {
    response = rs.when().get("/api/character");
  }

  @Entonces("^el API debe devolver un statusCode (\\d+)$")
  public void el_API_debe_devolver_un_statusCode(int code) throws Throwable {
    response.then().assertThat().statusCode(code);
  }

  @Entonces("^el API de personajes de Rick y Morty debe mostrar el nombre \"([^\"]*)\"$")
  public void el_API_de_personajes_de_Rick_y_Morty_debe_mostrar_el_nombre(String name) throws Throwable {
    response.then().body("name", equalTo(name));
  }

  @Entonces("^el API de personajes de Rick y Morty debe mostrar la especia \"([^\"]*)\"$")
  public void el_API_de_personajes_de_Rick_y_Morty_debe_mostrar_la_especia(String specie) throws Throwable {
    response.then().body("species", equalTo(specie));
  }

  @Entonces("^el resultado debe contener (\\d+) personajes$")
  public void el_resultado_debe_contener_personajes(int n) throws Throwable {
    response.then().body("info.count", equalTo(n));
  }

  @Entonces("^el API debe arrojar el error \"([^\"]*)\"$")
  public void el_API_debe_arrojar_el_error(String error) throws Throwable {
    response.then().body("error", equalTo(error));
  }

}
