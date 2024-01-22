package com.otus.ui.factories.ipml.configurators.browsers;

import com.otus.ui.factories.ipml.configurators.IBrowserConfigure;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeConfigure implements IBrowserConfigure {

  @Override
  public WebDriver configure() {

    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("start-maximized");

    WebDriverManager.chromedriver().setup();

    return new ChromeDriver(chromeOptions);
  }
}