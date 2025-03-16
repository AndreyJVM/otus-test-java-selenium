package com.otus.ui.factories.ipml.configurators.browsers;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public interface IBrowserConfigure {
  WebDriver configure() throws MalformedURLException;
}
