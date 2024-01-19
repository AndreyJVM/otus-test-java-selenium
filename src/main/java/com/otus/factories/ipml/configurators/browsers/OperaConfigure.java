package com.otus.factories.ipml.configurators.browsers;

import com.otus.factories.ipml.configurators.IBrowserConfigure;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class OperaConfigure implements IBrowserConfigure {

  private String browserVersion = System.getProperty("browser.version");

  @Override
  public WebDriver configure() {

    OperaOptions operaOptions = new OperaOptions();
    operaOptions.addArguments("start-maximized");

    WebDriverManager.operadriver().browserVersion(browserVersion).setup();

    return new OperaDriver(operaOptions);
  }
}