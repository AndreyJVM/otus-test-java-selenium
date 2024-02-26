package com.otus.ui.components;

import com.otus.ui.anotations.Component;
import com.otus.ui.pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component("//h2[contains(text(),'Специализации')]/ancestor::section")
public class SpecializationSectorsComponent extends AbsComponent{

  public SpecializationSectorsComponent(WebDriver driver) {
    super(driver);
  }

  private String startCourseLocator = "//span[contains(text(),'С')]"; //Xpath позволяющий извлекать строку с датой

  /**
   * На главной странице в разделе специализация, потск курса стартуещего раньше всех
   * */
  public MainPage getEarliestStartCourse() {

    List<WebElement> dateInfoElements = waiterDefault
            .waitingForElements(By.xpath(
                    getFullXPathWithAComponent(startCourseLocator)));

    Map<LocalDate, WebElement> coursesMap = new HashMap<>();
    LocalDate startCourseDate;

    for (WebElement element : dateInfoElements) {

      startCourseDate = parseDate(element.getText());

      if (startCourseDate != null)
        coursesMap.put(startCourseDate, element);
    }

    startCourseDate = coursesMap.keySet().stream()
            .reduce((first, current) -> current.isBefore(first) ? current : first)
            .get();

    actions
            .click(coursesMap.get(startCourseDate))
            .click()
            .perform();

    return new MainPage(driver);
  }

  /**
   * На главной странице в разделе специализация, потск курса стартуещего позже всех
   * */
  public MainPage getLatestStartCourse() {

    List<WebElement> dateInfoElements = waiterDefault
            .waitingForElements(By.xpath(
                    getFullXPathWithAComponent(startCourseLocator)));

    Map<LocalDate, WebElement> coursesMap = new HashMap<>();
    LocalDate startCourseDate;

    for (WebElement element : dateInfoElements) {

      startCourseDate = parseDate(element.getText());

      if (startCourseDate != null)
        coursesMap.put(startCourseDate, element);
    }

    startCourseDate = coursesMap.keySet().stream()
            .reduce((last, current) -> current.isAfter(last) ? current : last)
            .get();

    actions
            .click(coursesMap.get(startCourseDate))
            .click()
            .perform();

    return new MainPage(driver);
  }

  /**
   * Метод формирует новый XPath на основе:
   * первая часть значения аннотации @Component(value =)
   * второй части исходя из условий задачи
   * */
  private String getFullXPathWithAComponent(String addSecondPath) {
    return baseComponentLocator + addSecondPath;
  }
}