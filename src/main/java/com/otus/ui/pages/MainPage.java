package com.otus.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.Optional;

public class MainPage extends AbsBasePage {

  public MainPage(WebDriver driver) {
    super(driver);
  }

  public static final String BASE_URL = System.getProperty("webdriver.base.url");

  //Локаторы Xpath
  //Раздел популярные курсы: первый курс
  @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/main/div/section[1]/div/div[1]")
  private WebElement popularFirstCourse;

  //Раздел специализация: первый курс
  @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/main/div/section[2]/div/div[1]")
  private WebElement specializationSectionFirstCourse;


  public void popularFirstCourseClick() {
    popularFirstCourse.click();
  }

  public void specializationFirstCourseClick() {
    specializationSectionFirstCourse.click();
  }

  public Optional<WebElement> findCourseByNameSpecialization(String findNameCourse) {
    return driver.findElements(By.cssSelector(".fgNPoG"))
            .stream()
            .filter(element -> element.getText().contains(findNameCourse))
            .findFirst();
  }
}