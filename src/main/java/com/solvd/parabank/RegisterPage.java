package com.solvd.parabank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RegisterPage extends Page {

    @FindBy(xpath = "//tbody/tr")
    private List<WebElement> registerTable;

    public RegisterPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void registerUser(List<String> userData) {
        userData.forEach(string -> registerTable.forEach(webElement -> webElement.sendKeys(string)));
    }
}
