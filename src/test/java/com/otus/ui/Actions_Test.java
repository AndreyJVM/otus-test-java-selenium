package com.otus.ui;

import com.otus.ui.anotations.Driver;
import com.otus.ui.pages.MainPage;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import static com.otus.ui.pages.MainPage.BASE_URL;

/**
 * Задание №4
 * Реализовать движение мыши и выбор курса при помощи библиотеки Actions
 */

public class Actions_Test {
  @Driver
  private WebDriver driver;
  private MainPage mainPage;

  @BeforeEach
  public void setUp() {
    mainPage = new MainPage(driver);
    driver.get(BASE_URL);
  }
}
