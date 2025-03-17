package com.solvd.parabank;

import com.solvd.driver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {

    protected WebDriver webDriver;

    @BeforeClass
    public void setup() {
        webDriver = WebDriverFactory.createDriver();
        webDriver.manage().window().maximize();
    }

    @AfterClass
    public void quit() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
