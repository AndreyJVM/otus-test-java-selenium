package com.otus;

import com.otus.anotations.Driver;
import com.otus.pages.MainPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

/**
 * Задание №2
 * Реализовать подсветку элементов перед нажатием.
 *
 * В данном тестовом классе представлено несколько методов
 * демонстрирующих подсветку элементов перед методом click()
 * */
public class BacklightAnElement_Test extends BaseTest {

    @Driver
    private WebDriver driver;

    private String baseURL = System.getProperty("webdriver.base.url");

    private MainPage mainPage;

    @BeforeEach
    public void setUp() {
        mainPage = new MainPage(driver);
        driver.get(baseURL);
    }

    @Test
    void backlightAnElement_Test () {
        mainPage.popularFirstCourseClick();
    }
}
