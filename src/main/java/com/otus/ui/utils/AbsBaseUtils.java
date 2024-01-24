package com.otus.ui.utils;

import com.otus.ui.waiters.WaiterDefault;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbsBaseUtils {
  protected WebDriver driver;
  protected WaiterDefault waiterDefault;

  public AbsBaseUtils(WebDriver driver) {
    this.driver = driver;
    this.waiterDefault = new WaiterDefault(driver);
    PageFactory.initElements(driver, this);
  }
}