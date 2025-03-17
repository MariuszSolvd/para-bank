package com.solvd.parabank;

import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class HomePageTest extends BaseTest {

    @Test
    public void register() {
        HomePage homePage = new HomePage(webDriver);
        RegisterPage registerPage = homePage.clickRegister();
        List<String> test = List.of("Adam", "Smith", "trg", "trr");
        registerPage.registerUser(test);
    }
}
