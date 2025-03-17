package com.solvd.parabank;

import org.openqa.selenium.WebDriver;

public abstract class Page {

    protected WebDriver webDriver;

    public Page(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
