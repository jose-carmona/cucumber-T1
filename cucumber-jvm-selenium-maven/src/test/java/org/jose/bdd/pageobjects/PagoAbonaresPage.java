package org.jose.bdd.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import org.jose.bdd.pageobjects.BasePage;

public class PagoAbonaresPage extends BasePage {

  @FindBy(how = How.NAME, using = "pagotasas")
  private WebElement formulario;

  @FindBy(how = How.NAME, using = "entidad")
  private WebElement emisora;

  @FindBy(how = How.NAME, using = "sufijo")
  private WebElement sufijo;

  @FindBy(how = How.NAME, using = "numero_abonare")
  private WebElement abonare;

  @FindBy(how = How.NAME, using = "dc")
  private WebElement dc;

  @FindBy(how = How.NAME, using = "fecha_control")
  private WebElement control;

  @FindBy(how = How.NAME, using = "importe")
  private WebElement importe;

  public PagoAbonaresPage(WebDriver driver) {
    super(driver);
  }

  public void completarFormulario(String p_emisora, String p_sufijo, String p_abonare, String p_dc, String p_control, String p_importe) {
    // rellenamos los datos del formulario
    emisora.sendKeys(p_emisora);
    sufijo.sendKeys(p_sufijo);
    abonare.sendKeys(p_abonare);
    dc.sendKeys(p_dc);
    control.sendKeys(p_control);
    importe.sendKeys(p_importe);
  }

  public void pagar() {
    formulario.submit();
  }
}
