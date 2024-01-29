package com.otus.ui.steps;

import com.google.inject.Inject;
import com.otus.ui.pages.MainPage;
import com.otus.ui.support.GuiceScoped;
import io.cucumber.java.ru.Пусть;

public class MainPageSteps {
  @Inject
  MainPage mainPage;

  @Пусть("Открыта главная страница")
  public void openMainPage() {
    mainPage.open();
  }
}
