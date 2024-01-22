package com.otus.ui;

import com.otus.ui.anotations.Driver;
import com.otus.ui.extensions.DriverManagerExtensions;
import com.otus.ui.pages.MainPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import static com.otus.ui.pages.MainPage.BASE_URL;
@ExtendWith(DriverManagerExtensions.class)
public abstract class BaseTest {
  @Driver
  public WebDriver driver;
  public MainPage mainPage;

  @BeforeEach
  public void setUp() {
    mainPage = new MainPage(driver);
    driver.get(BASE_URL);
  }
}
