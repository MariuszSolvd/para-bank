package com.solvd.parabank;

import com.solvd.configurations.WaiterWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class HomePage extends Page {

    private By latestNews = By.xpath("//h4[contains(text(), \"Latest News\")]");

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isHopePageDisplayed() {
        WaiterWrapper.waitForElementVisible(webDriver, 5, latestNews);
        return webDriver.findElement(latestNews).isDisplayed();
    }
}
