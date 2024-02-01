package com.otus.ui.steps.pages;

import com.google.inject.Inject;
import com.otus.ui.pages.MainPage;
import com.otus.ui.support.GuiceScoped;
import io.cucumber.java.ru.Пусть;

public class MainPageSteps {
  @Inject
  MainPage mainPage;

  @Inject
  GuiceScoped guiceScoped;

  @Пусть("Я открываю браузер {string}")
  public void openMainPageWithBrowser(String browserName) {
    guiceScoped.setBrowserName(browserName);

  }
}