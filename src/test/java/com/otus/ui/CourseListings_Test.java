package com.otus.ui;

import com.otus.ui.anotations.Driver;
import com.otus.ui.extensions.DriverManagerExtensions;
import com.otus.ui.pages.MainPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Задание №3
 * На главно странице Otus'a снизу найти список курсов(популярные курсы, специализации, рекомендации) и реализовать:
 * - Метод фильтр по названию курса;
 * - Метод выбора курса, стартующего раньше всех/позже всех (при совпадении дат - выбрать любой) при помощи reduce;
 */
@ExtendWith(DriverManagerExtensions.class)
public class CourseListings_Test {

  @Driver
  public WebDriver driver;
  public MainPage mainPage;

  @BeforeEach
  public void setUp() {
    mainPage = new MainPage(driver);
    driver.get(MainPage.BASE_URL);
  }

  @Test
  public void findCourseByName_Test() {
    WebElement webElement = mainPage
            .findCourseByNameSpecialization("Java")
            .get();
    webElement.click();
  }
}