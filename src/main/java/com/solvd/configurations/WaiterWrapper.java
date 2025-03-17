package com.solvd.configurations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaiterWrapper {

    private static WebDriverWait getWait(WebDriver webDriver, int timeoutSec) {
        return new WebDriverWait(webDriver, Duration.ofSeconds(timeoutSec));
    }

    public static WebElement waitForElementVisible(WebDriver driver, int timeoutSec, By locator) {
        return getWait(driver, timeoutSec).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
