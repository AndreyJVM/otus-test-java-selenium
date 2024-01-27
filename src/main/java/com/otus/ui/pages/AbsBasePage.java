package com.otus.ui.pages;

import com.otus.ui.support.GuiceScoped;
import com.otus.ui.utils.AbsBaseUtils;

public abstract class AbsBasePage<T> extends AbsBaseUtils<T> {

  public AbsBasePage(GuiceScoped guiceScoped) {
    super(guiceScoped);
  }

  public T open() {
    return (T) this;
  }
}