package org.jose.bdd.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import org.jose.bdd.pageobjects.BasePage;

public class GoogleSearchPage extends BasePage {
    // The element is now looked up using the name attribute,
    // and we never look it up once it has been used the first time
    @FindBy(how = How.NAME, using = "q")
    @CacheLookup
    private WebElement searchBox;

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    public void searchFor(String text) {
        // We continue using the element just as before
        searchBox.sendKeys(text);
        searchBox.submit();
    }
}
