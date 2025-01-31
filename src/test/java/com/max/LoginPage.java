package com.max;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;

    // Локаторы
    private final By emailInput = By.id("user_email");
    private final By passwordInput = By.id("user_password");
    private final By submitButton = By.xpath("//*[@id='new_user']/div[4]/input");
    private final By emailErrorMessage = By.xpath("/html/body/div[2]/div[7]/div/form/div[1]/ul");
    private final By passwordErrorMessage = By.xpath("/html/body/div[2]/div[7]/div/form/div[2]/ul");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://gb.ru/login");
    }

    public void enterLogin(String login) {
        driver.findElement(emailInput).sendKeys(login);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void submit() {
        driver.findElement(submitButton).click();
    }

    public boolean isEmailErrorDisplayed() {
        return !driver.findElements(emailErrorMessage).isEmpty();
    }

    public boolean isPasswordErrorDisplayed() {
        return !driver.findElements(passwordErrorMessage).isEmpty();
    }
}
