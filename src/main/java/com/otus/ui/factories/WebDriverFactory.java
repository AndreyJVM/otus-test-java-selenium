package com.otus.ui.factories;

import com.otus.ui.exceptions.BrowserNotSupportedException;
import com.otus.ui.factories.ipml.configurators.browsers.ChromeConfigure;
import com.otus.ui.factories.ipml.configurators.browsers.FirefoxConfigure;
import com.otus.ui.factories.ipml.configurators.browsers.OperaConfigure;
import com.otus.ui.factories.ipml.configurators.browsers.RemoteBrowserConfigure;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.net.MalformedURLException;
import java.util.Locale;

public class WebDriverFactory implements IFactory<EventFiringWebDriver> {
  private final String browserName = System.getProperty("browser").toLowerCase(Locale.ROOT);

  @Override
  public EventFiringWebDriver create() throws MalformedURLException {

      return switch (browserName) {
          case "chrome" -> new EventFiringWebDriver(new ChromeConfigure().configure());
          case "firefox" -> new EventFiringWebDriver(new FirefoxConfigure().configure());
          case "opera" -> new EventFiringWebDriver(new OperaConfigure().configure());
          case "remote" -> new EventFiringWebDriver(new RemoteBrowserConfigure().configure());
          default -> throw new BrowserNotSupportedException(browserName);
      };
  }
}