package com.solvd.parabank;

import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void test() {
        HomePage homePage = new HomePage(webDriver);
        homePage.isHopePageDisplayed();
    }
}
