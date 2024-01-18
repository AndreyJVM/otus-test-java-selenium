package com.otus.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbsBaseUtils {
    protected WebDriver driver;

    public AbsBaseUtils(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}