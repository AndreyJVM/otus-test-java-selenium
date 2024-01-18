package com.otus.extensions;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class PageManagerExtensions implements BeforeEachCallback, AfterEachCallback {

    @Override
    public void afterEach(ExtensionContext extensionContext) throws Exception {
    }

    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {
    }
}