package org.jose.bdd.steps;

import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Cuando;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Steps {


    @Before
    public void setUp() {
      baseURI = "https://rickandmortyapi.com";
    }

    @After
    public void afterScenario() {
    }

    @Dado("^que el ID del personaje es (\\d+)$")
    public void que_el_ID_del_personaje_es(int arg1) throws Throwable {
    }

    @Cuando("^invoco al API de personajes de Rick y Morty$")
    public void invoco_al_API_de_personajes_de_Rick_y_Morty() throws Throwable {
      given().
        pathParam("Id", "1").
      when().
        get("/api/character/{Id}").
      then().
        assertThat().statusCode(200).
        body("name", equalTo("Rick Sanchez"));
    }

    @Entonces("^el API de personajes de Rick y Morty debe mostrar el nombre 'Rick Sanchez'$")
    public void el_API_de_personajes_de_Rick_y_Morty_debe_mostrar_el_nombre_Rick_Sanchez() throws Throwable {
    }
}
