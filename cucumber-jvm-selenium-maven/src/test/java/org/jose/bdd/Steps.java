package org.jose.bdd.steps;

import cucumber.api.java.Before;
import cucumber.api.java.After;
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
    private RemoteWebDriver driver;


    @Before
    public void setUp() {
      // Create a new instance of a driver
      driver = new RemoteWebDriver(DesiredCapabilities.firefox());
    }

    @After
    public void afterScenario() {
      // hemos terminado: quit
      driver.quit();
    }

    @Given("^I am on Google search page$")
    public void i_am_on_Google_search_page() throws Throwable {
      // navegamos a la página de Google
      driver.get("http://www.google.es");

      // creamos instacia de la página. Buscamos todo los elementos de la misma
      page = PageFactory.initElements(driver, GoogleSearchPage.class);
    }

    @When("^I enter \"([^\"]*)\" as search phrase$")
    public void i_enter_as_search_phrase(String phrase) throws Throwable {
      page.searchFor(phrase);
    }

    @When("^I click on search button$")
    public void i_click_on_search_button() throws Throwable {
      page.search();
    }

    @Then("^results are shown$")
    public void results_are_shown() throws Throwable {
      Thread.sleep(500);
      page.screenShot();
    }

}
