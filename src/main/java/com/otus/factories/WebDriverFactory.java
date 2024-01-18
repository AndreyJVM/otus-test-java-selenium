package com.otus.factories;

import com.otus.exceptions.BrowserNotSupportedException;
import com.otus.factories.ipml.configurators.browsers.ChromeConfigure;
import com.otus.factories.ipml.configurators.browsers.FirefoxConfigure;
import com.otus.factories.ipml.configurators.browsers.OperaConfigure;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class WebDriverFactory implements IFactory<EventFiringWebDriver> {
    private String browserName = System.getProperty("browser", "chrome");

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