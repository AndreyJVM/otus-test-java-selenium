package com.otus.extensions;

import com.otus.anotations.Driver;
import com.otus.factories.WebDriverFactory;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.openqa.selenium.WebDriver;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

public class DriverManagerExtensions implements BeforeEachCallback, AfterEachCallback {

  private WebDriver driver = null;

  @Override
  public void afterEach(ExtensionContext extensionContext) throws Exception {
    if (driver != null) {
      driver.close();
      driver.quit();
    }
  }

  private Set<Field> getFields(Class<? extends Annotation> annotation, ExtensionContext extensionContext) {
    Set<Field> fields = new HashSet<>();
    Class<?> testClass = extensionContext.getTestClass().get();
    for (Field field : testClass.getDeclaredFields()) {
      if (field.isAnnotationPresent(annotation)) {
        fields.add(field);
      }
    }
    return fields;
  }

  @Override
  public void beforeEach(ExtensionContext extensionContext) throws Exception {
    driver = new WebDriverFactory().create();

    var fieldsToInject = getFields(Driver.class, extensionContext);
    for (Field field : fieldsToInject) {
      if (field.getType().getName().equals(WebDriver.class.getName())) {
        field.setAccessible(true);
        field.set(extensionContext.getTestInstance().get(), driver);
      }
    }
  }
}