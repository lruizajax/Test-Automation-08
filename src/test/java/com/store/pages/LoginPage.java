package com.store.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {

    WebDriver driver;

    /**
     * Web Elements
     *
     */

    By inputEmail = By.id("Email");
    By inputPassword = By.id("Password");
    By buttonLogin = By.cssSelector(".login-button");
    By divMessage = By.className("message-error");
    By linkForgotPassword = By.linkText("Forgot password?");
    By checkRememberMe = By.id("RememberMe");


    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @Step("Fill out the login form with valid data - happy path")
    public void fillOutForm() {
        type(inputEmail, "4rohaserrr@gmail.com");
        type(inputPassword, "SueprPass@#$@@");
    }

    @Step("Fill out the login form with data provider")
    public void fillOutFormWithDataProvider(String email, String password) {
        type(inputEmail, email);
        type(inputPassword, password);
    }

    public void fillOutFormWithInvalidEmail() {

    }

    @Step("Verify login button is displayed")
    public boolean verifyLoginButtonIsDisplayed() {
        return find(buttonLogin).isDisplayed();
    }

    @Step("Verify forgot password link is displayed")
    public boolean verifyForgotPasswordLinkIsDisplayed() {
        return find(linkForgotPassword).isDisplayed();
    }

    @Step("Verify remember me checkbox is displayed")
    public boolean verifyRememberMeCheckboxIsDisplayed() {
        return find(checkRememberMe).isDisplayed();
    }

    @Step("Click on the login button")
    public void clickLogin() {
        click(buttonLogin);
    }


    public String getLoginErrorMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        By divMessage = By.className("message-error");

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(divMessage)
        ).getText();
    }

}
