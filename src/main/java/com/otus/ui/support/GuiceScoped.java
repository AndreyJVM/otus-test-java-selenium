package com.otus.ui.support;

import com.otus.ui.factories.WebDriverFactory;
import io.cucumber.guice.ScenarioScoped;
import org.openqa.selenium.WebDriver;

@ScenarioScoped
public class GuiceScoped {
  private WebDriver driver = new WebDriverFactory().create();

  public WebDriver getDriver() {
    return driver;
  }
}