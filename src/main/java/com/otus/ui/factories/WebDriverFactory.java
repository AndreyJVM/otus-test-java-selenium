package com.otus.ui.factories;

import com.otus.ui.exceptions.BrowserNotSupportedException;
import com.otus.ui.factories.ipml.configurators.browsers.ChromeConfigure;
import com.otus.ui.factories.ipml.configurators.browsers.FirefoxConfigure;
import com.otus.ui.factories.ipml.configurators.browsers.OperaConfigure;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.Locale;

public class WebDriverFactory implements IFactory<EventFiringWebDriver> {
  private String browserName = System.getProperty("browser").toLowerCase(Locale.ROOT);

  @Override
  public EventFiringWebDriver create() {

    switch (browserName) {
      case "chrome": {
        return new EventFiringWebDriver(new ChromeConfigure().configure());
      }
      case "firefox": {
        return new EventFiringWebDriver(new FirefoxConfigure().configure());
      }
      case "opera": {
        return new EventFiringWebDriver(new OperaConfigure().configure());
      }
      default: {
        throw new BrowserNotSupportedException(browserName);
      }
    }
  }
}