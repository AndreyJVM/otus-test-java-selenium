package com.otus;

import com.otus.anotations.Driver;
import com.otus.extensions.DriverManagerExtensions;
import com.otus.pages.MainPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

@ExtendWith(DriverManagerExtensions.class)
public class CompaniesSliderTest {

  @Driver
  private WebDriver driver;

  private MainPage mainPage;

  @BeforeEach
  void setUp() {
    mainPage = new MainPage(driver);
    driver.get("https://otus.ru");
  }

  @Test
  public void logInTest() {
    mainPage.clickOn();
    try {
      sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  @Test
  void pointingAtAnElementAndClickTest() {
    mainPage.pointingAtAnElementAndClick();
  }

  @Test
  void webDriverEventClickBefore() {
    WebElement element = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div/section[1]/div/div[2]"));
    try {
      sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    element.click();
    try {
      sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}