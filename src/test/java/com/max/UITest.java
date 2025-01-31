package com.max;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UITest extends BaseTest {

    @Test
    void testGBNotEmailLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.enterLogin("login");
        loginPage.enterPassword("password");
        loginPage.submit();

        Assertions.assertTrue(loginPage.isEmailErrorDisplayed(), "Email error should be displayed");
    }

    @Test
    void testGBWithoutPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.enterLogin("login@login.ru");
        loginPage.submit();

        Assertions.assertTrue(loginPage.isPasswordErrorDisplayed(), "Password error should be displayed");
    }
}
