package com.otus.ui.factories;

import com.otus.ui.exceptions.BrowserNotSupportedException;

public interface IFactory<T> {
  T create() throws BrowserNotSupportedException;
}