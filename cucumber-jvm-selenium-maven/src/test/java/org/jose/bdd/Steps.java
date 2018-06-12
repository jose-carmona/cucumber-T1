package org.jose.bdd.steps;

import org.jose.bdd.App;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Steps {

    private App calculator;

    @Before
    public void setUp() {
        calculator = new App();
    }

    @Given("^el usuario navega a la página de Google$")
    public void el_usuario_navega_a_la_página_de_Google() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
