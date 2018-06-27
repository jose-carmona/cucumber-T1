package org.jose.bdd.pageobjects;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.apache.commons.io.FileUtils;

public class BasePage {

  protected WebDriver driver;

  public BasePage(WebDriver driver) {
    this.driver = driver;
  }

  public void screenShot() throws Throwable {

    // RemoteWebDriver does not implement the TakesScreenshot class
    // if the driver does have the Capabilities to take a screenshot
    // then Augmenter will add the TakesScreenshot methods to the instance
    WebDriver augmentedDriver = new Augmenter().augment(driver);
    File source = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
    String path = "./target/screenshots/" + source.getName();
    FileUtils.copyFile(source, new File(path));

  }

}
