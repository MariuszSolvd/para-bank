package com.solvd.parabank;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HomePageTest extends BaseTest {

    @Test
    public void test() {
        HomePage homePage = new HomePage(webDriver);
        assertTrue(homePage.isHopePageDisplayed());
    }
}
