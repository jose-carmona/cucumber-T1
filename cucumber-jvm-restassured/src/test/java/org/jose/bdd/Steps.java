package org.jose.bdd.steps;

import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Steps {


    @Before
    public void setUp() {
    }

    @After
    public void afterScenario() {
      // hemos terminado: quit
    }

    @Given("^que filtro en las Entidades Bancarias del Municipio 'BENAMEJI'$")
    public void que_filtro_en_las_Entidades_Bancarias_del_Municipio_BENAMEJI() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }

    @When("^invoco al API de Entidades Bancarias de un Municipio$")
    public void invoco_al_API_de_Entidades_Bancarias_de_un_Municipio() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        given().
          relaxedHTTPSValidation(). 
          param("id", "2270").
          param("page", "0").
          param("perPage", "10").
          param("widgetId", "7686").
        when().
          get("http://www.haciendalocal.es/api/banks-ichls").
        then().
          statusCode(200);
    }

    @Then("^debo obtener una Entidad Bancaria con código CSB '(\\d+)'$")
    public void debo_obtener_una_Entidad_Bancaria_con_código_CSB(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }
}
