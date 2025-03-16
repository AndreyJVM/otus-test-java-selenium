package com.otus.ui.factories.ipml.configurators.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;

public class RemoteBrowserConfigure implements  IBrowserConfigure{

    private DesiredCapabilities capabilities;

    private final String REMOTE_URL = System.getProperty("remote.webdriver.url");

    @Override
    public WebDriver configure() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
        capabilities.setCapability(CapabilityType.BROWSER_VERSION, "121.0");
        capabilities.setCapability("enableVNC", true);

        return new RemoteWebDriver(
                URI.create(REMOTE_URL).toURL(),
                capabilities
        );
    }
}
