package org.jose.bdd.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.jose.bdd.pageobjects.GoogleSearchPage;

public class Steps {

    private GoogleSearchPage page;

    @Before
    public void setUp() {
      // Create a new instance of a driver
      RemoteWebDriver driver = new RemoteWebDriver(DesiredCapabilities.firefox());

      // Navigate to the right place
      driver.get("http://www.google.com/");

      // Create a new instance of the search page class
      // and initialise any WebElement fields in it.
      page = PageFactory.initElements(driver, GoogleSearchPage.class);

    }

    @Given("^el usuario navega a la página de Google$")
    public void el_usuario_navega_a_la_página_de_Google() throws Throwable {
      // And now do the search.
      page.searchFor("Cheese");
    }

}
