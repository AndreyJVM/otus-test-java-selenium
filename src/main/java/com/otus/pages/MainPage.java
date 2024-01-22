package com.otus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AbsBasePage {

  public MainPage(WebDriver driver) {
    super(driver);
  }

  //Локаторы Xpath
  //Кнопка Войти в аккаунт
  @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div[1]/div/section/div/button")
  WebElement enterAccountButton;

  //Специализация QA Automation Engineer
  @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/main/div/section[2]/div/div[1]/a/div/div/picture/img")
  WebElement specOfAQAEngineerButton;

  //Раздел популярные курсы: первый курс
  @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/main/div/section[1]/div/div[1]")
  WebElement popularFirstCourse;


  public void clickOn() {
    enterAccountButton.click();
  }

  public void pointingAtAnElementAndClick() {
    new Actions(driver)
            .moveToElement(specOfAQAEngineerButton)
            .pause(1000)
            .click()
            .perform();
  }

  public void popularFirstCourseClick() {
    popularFirstCourse.click();
  }
}