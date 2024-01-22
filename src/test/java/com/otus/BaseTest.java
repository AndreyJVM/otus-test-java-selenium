package com.otus;

import com.otus.anotations.Driver;
import com.otus.extensions.DriverManagerExtensions;
import com.otus.pages.MainPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

@ExtendWith(DriverManagerExtensions.class)
public class BaseTest {
    @Driver
    private WebDriver driver;

    private MainPage mainPage;

    @BeforeEach
    public void setUp() {
        mainPage = new MainPage(driver);
        driver.get(System.getProperty("webdriver.base.url"));
    }
}