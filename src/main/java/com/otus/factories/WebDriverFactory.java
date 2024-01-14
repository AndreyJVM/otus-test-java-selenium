package com.otus.factories;

import com.otus.exceptions.BrowserNotSupportedException;
import com.otus.factories.ipml.configurators.browsers.ChromeConfigure;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class WebDriverFactory implements IFactory<EventFiringWebDriver>{
    private String browserName = System.getProperty("browser").toLowerCase();
    @Override
    public EventFiringWebDriver create() {
        switch (browserName){
            case "chrome" -> {
                return new EventFiringWebDriver(new ChromeConfigure().configure());
            }
            default -> {
                throw new BrowserNotSupportedException(browserName);
            }
        }
    }
}
