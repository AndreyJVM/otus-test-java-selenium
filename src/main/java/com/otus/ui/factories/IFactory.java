package com.otus.ui.factories;

import com.otus.ui.exceptions.BrowserNotSupportedException;

import java.net.MalformedURLException;

public interface IFactory<T> {
  T create() throws BrowserNotSupportedException, MalformedURLException;
}