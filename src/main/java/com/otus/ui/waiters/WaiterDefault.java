package com.otus.ui.waiters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class WaiterDefault {

  private WebDriver driver = null;

  public WaiterDefault(WebDriver driver) {
    this.driver = driver;
  }

  private final long second = 5;

  public boolean waitForCondition(ExpectedCondition condition) {
    WebDriverWait webDriverWait = new WebDriverWait(driver, second);
    try {
      webDriverWait.until(condition);
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  public WebElement waitingForElement(By by) {
    try {
      waitForElementVisible(by);
      waitForElementClickable(by);

      return driver.findElement(by);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return null;
  }

  public List<WebElement> waitingForElements(By by) {
    try {
      waitForElementVisible(by);

      return driver.findElements(by);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return null;
  }

  public boolean waitForElementVisible(By by) {
    return waitForCondition(ExpectedConditions
            .visibilityOfElementLocated(by));
  }

  public boolean waitForElementClickable(By by) {
    return waitForCondition(ExpectedConditions
            .elementToBeClickable(by));
  }
}