package org.jose.bdd.steps;

import java.util.List;

import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.DataTable;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.jose.bdd.pageobjects.PagoAbonaresPage;

public class PagoAbonaresSteps {

    private PagoAbonaresPage page;
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

    @Given("^que el usuario navega a la página de pago de abonarés$")
    public void el_usuario_navega_a_la_página_de_Google() throws Throwable {
      // Sede electrónica de Hacienda Local -> Pago de Abonarés
      driver.get("https://sede.haciendalocal.es/pagoAbonares");
      Thread.sleep(4000);

      // creamos instacia de la página. Buscamos todo los elementos de la misma
      page = PageFactory.initElements(driver, PagoAbonaresPage.class);
    }

    @Given("^que el usuario introduce los siguientes datos el formulario de pago de abonarés$")
    public void que_el_usuario_introduce_los_siguientes_datos_el_formulario_de_pago_de_abonarés(DataTable arg1) throws Throwable {
      // completamos formulario con los datos de la tabla
      List<List<String>> data = arg1.raw();
      page.completarFormulario(
        data.get(1).get(0),
        data.get(1).get(1),
        data.get(1).get(2),
        data.get(1).get(3),
        data.get(1).get(4),
        data.get(1).get(5)
      );
      Thread.sleep(500);
    }

    @When("^pulsa el botón pagar$")
    public void pulsa_el_botón_pagar() throws Throwable {
        page.pagar();
        Thread.sleep(500);
        page = PageFactory.initElements(driver, PagoAbonaresPage.class);
    }

    @Then("^Debe ver el error \"([^\"]*)\"$")
    public void debe_ver_el_error(String err) throws Throwable {
      assertEquals(page.getTextoError(), err);
    }

}
