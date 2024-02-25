package com.otus.ui;

import com.otus.ui.anotations.Driver;
import com.otus.ui.extensions.DriverManagerExtensions;
import com.otus.ui.pages.MainPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
    new MainPage(driver).open();
    actions = new Actions(driver);
  }

  @Test
  public void moveAndClickMouseToRecommendationsFirstCourse_Test() {
    WebElement firstElement = driver.findElement(By.cssSelector(".hSgdVZ .hATaOW"));

    final int defPause = 1000;

    actions
            .moveToElement(firstElement)
            .pause(defPause)
            .click()
            .perform();
  }
}
