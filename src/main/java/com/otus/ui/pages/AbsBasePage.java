package com.otus.ui.pages;

import com.otus.ui.anotations.URL;
import com.otus.ui.utils.AbsBaseUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public abstract class AbsBasePage<T> extends AbsBaseUtils<T> {

  public static final String BASE_URL = System.getProperty("webdriver.base.url");

  public AbsBasePage(WebDriver driver) {
    super(driver);
  }

  private String getBaseUrl() {
    return StringUtils.stripEnd(BASE_URL, "/");
  }

  private String getUrlPrefix() {
    URL urlAnnotation = getClass().getAnnotation(URL.class);
    if (urlAnnotation != null) {
      return urlAnnotation.value();
    }
    return "";
  }

  public T open() {
    driver.get(getBaseUrl() + getUrlPrefix());

    return (T) page(getClass());
  }

  public <T> T page(Class<T> clazz) {
    try {
      Constructor constructor = clazz.getConstructor(WebDriver.class);

      return convertInstanceOfObject(constructor.newInstance(driver), clazz);

    } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
      e.printStackTrace();
    }

    return null;
  }

  private static <T> T convertInstanceOfObject(Object o, Class<T> clazz) {
    try {
      return clazz.cast(o);
    } catch (ClassCastException e) {
      return null;
    }
  }
}