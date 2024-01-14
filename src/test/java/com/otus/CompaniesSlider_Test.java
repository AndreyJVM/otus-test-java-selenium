package com.otus;

import com.otus.anotations.Driver;
import com.otus.anotations.Page;
import com.otus.extensions.DriverManagerExtensions;
import com.otus.pages.MainPage;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

@ExtendWith(DriverManagerExtensions.class)
public class CompaniesSlider_Test {

    @Driver
    private WebDriver driver;

    @Page
    private MainPage mainPage;

}