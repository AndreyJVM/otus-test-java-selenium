package com.otus.pages;

import com.otus.utils.AbsBaseUtils;
import org.openqa.selenium.WebDriver;

public abstract class AbsBasePage<T> extends AbsBaseUtils {

    public AbsBasePage(WebDriver driver) {
        super(driver);
    }

    public T open(){
        return (T)this;
    }
}