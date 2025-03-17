package com.solvd.parabank;

import com.solvd.configurations.WaiterWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends Page {

    @FindBy(xpath = "//h4[contains(text(), \"Latest News\")]")
    private WebElement latestNews;
    @FindBy(xpath = "//input[@name = \"username\"]")
    private WebElement usernameInput;
    @FindBy(xpath = "//input[@name = \"password\"]")
    private WebElement passwordInput;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isHopePageDisplayed() {
        WaiterWrapper.waitForElementVisible(webDriver, latestNews);
        return latestNews.isDisplayed();
    }

    private void inputUsername(String username) {

    }
}
