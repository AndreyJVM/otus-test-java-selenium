package com.otus.ui;

import com.otus.ui.anotations.Driver;
import com.otus.ui.extensions.DriverManagerExtensions;
import com.otus.ui.pages.MainPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * Задание №4
 * Реализовать движение мыши и выбор курса при помощи библиотеки Actions
 */
@ExtendWith(DriverManagerExtensions.class)
public class ActionsDemo_Test {

  @Driver
  private WebDriver driver;

  @FindBy(css = ".hSgdVZ .hATaOW")
  private WebElement firstElement;

  private Actions actions;

  private final int defPause = 1000;

  @BeforeEach
  public void setUp() {
    new MainPage(driver).open();
    actions = new Actions(driver);
  }

  @Test
  @Tag(value = "Тест_Не_Актуален_Данного_Раздела_Нет_На_Сайте")
  public void moveAndClickMouseToRecommendationsFirstCourse_Test() {
     actions
            .moveToElement(firstElement)
            .pause(defPause)
            .click()
            .perform();
  }
}