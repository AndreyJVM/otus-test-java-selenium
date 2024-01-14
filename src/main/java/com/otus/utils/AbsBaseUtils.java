package com.otus.utils;

import org.openqa.selenium.WebDriver;

public abstract class AbsBaseUtils {
    protected WebDriver driver;

    public AbsBaseUtils(WebDriver driver) {
        this.driver = driver;
    }
}