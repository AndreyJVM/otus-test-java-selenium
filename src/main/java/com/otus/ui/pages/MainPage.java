package com.otus.ui.pages;

import com.otus.ui.anotations.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.Optional;
@URL("/")
public class MainPage extends AbsBasePage<MainPage> {

  public MainPage(WebDriver driver) {
    super(driver);
  }

  //Локаторы Xpath
  //Раздел популярные курсы: первый курс
  @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/main/div/section[1]/div/div[1]")
  WebElement popularFirstCourse;

  //Раздел специализация: первый курс
  @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/main/div/section[2]/div/div[1]")
  WebElement specializationSectionFirstCourse;


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