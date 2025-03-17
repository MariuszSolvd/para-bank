package com.solvd.parabank;

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
    @FindBy(xpath = "//input[@type = \"submit\"]")
    private WebElement logInButton;
    @FindBy(xpath = "//a[text() = \"Register\"]")
    private WebElement registerButton;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void logIn(String username, String password) {
        inputUsername(username);
        inputPassword(password);
        logInButton.click();

    }

    public RegisterPage clickRegister() {
        registerButton.click();
        return new RegisterPage(webDriver);
    }

    private void inputUsername(String username) {
        usernameInput.sendKeys(username);
    }

    private void inputPassword(String password) {
        passwordInput.sendKeys(password);
    }
}
