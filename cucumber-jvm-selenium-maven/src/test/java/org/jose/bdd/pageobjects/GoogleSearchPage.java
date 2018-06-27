package org.jose.bdd.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import org.jose.bdd.pageobjects.BasePage;

public class GoogleSearchPage extends BasePage {

    @FindBy(how = How.NAME, using = "q")
    private WebElement searchBox;

    @FindBy(how = How.NAME, using = "btnK")
    private WebElement voyATenerSuerteButton;

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    public void searchFor(String text) {
        searchBox.sendKeys(text);
    }

    public void search() {
      voyATenerSuerteButton.submit();
    }
}
