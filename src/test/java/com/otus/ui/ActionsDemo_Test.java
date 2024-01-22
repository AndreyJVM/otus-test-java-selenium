package com.otus.ui;

import com.otus.ui.anotations.Driver;
import com.otus.ui.extensions.DriverManagerExtensions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.otus.ui.pages.MainPage.BASE_URL;

/**
 * Задание №4
 * Реализовать движение мыши и выбор курса при помощи библиотеки Actions
 */
@ExtendWith(DriverManagerExtensions.class)
public class ActionsDemo_Test {
  @Driver
  private WebDriver driver;

  private Actions actions;

  @BeforeEach
  public void setUp() {
    driver.get(BASE_URL);
    actions = new Actions(driver);
  }

  @Test
  public void moveAndClickMouseToRecommendationsFirstCourse_Test() {
    WebElement firstElement = driver.findElement(By.cssSelector(".jnktxM .kbUYTE"));

    int defPause = 1000;

    actions
            .moveToElement(firstElement)
            .pause(defPause)
            .click()
            .pause(defPause)
            .perform();
  }
}
