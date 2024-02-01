package com.otus.ui.hooks;

import com.google.inject.Inject;
import com.otus.ui.support.GuiceScoped;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;

public class Hooks {

  @Inject
  public GuiceScoped guiceScoped;
  @After
  public void close() {
    WebDriver driver = guiceScoped.getDriver();
    if (driver != null) {
      driver.close();
      driver.quit();
    }
  }
}