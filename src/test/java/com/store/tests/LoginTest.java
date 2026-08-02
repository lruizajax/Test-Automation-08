package com.store.tests;

import com.store.utils.BaseTest;
import com.store.utils.DataProviders;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(dataProvider = "dpFromCsv", dataProviderClass = DataProviders.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that the user can login successfully with valid credentials")
    @Epic("Ecommerce App")
    @Feature("Login")
    @Story("Verify that the user can login successfully with valid credentials")
    public void doLoginTestWithDataProvider(String username, String password) {
        homePage.clickLogin();
        loginPage.fillOutFormWithDataProvider(username, password);
        loginPage.clickLogin();
        //assertion segun sea el caso,
        //pending
    }

    @Test
    @Severity(SeverityLevel.TRIVIAL)
    @Description("Verify that the login button is displayed on the login page")
    @Epic("Ecommerce App")
    @Feature("Login")
    @Story("Verify that the login button is displayed on the login page")
    public void verifyLoginButtonIsDisplayed() {
        homePage.clickLogin();
        Assert.assertTrue(loginPage.verifyLoginButtonIsDisplayed());
    }

    @Test
    @Severity(SeverityLevel.TRIVIAL)
    @Description("Verify that the forgot password link is displayed on the login page")
    @Epic("Ecommerce App")
    @Feature("Login")
    @Story("Verify that the forgot password link is displayed on the login page")
    public void verifyForgotPasswordLink() {
        homePage.clickLogin();
        Assert.assertTrue(loginPage.verifyForgotPasswordLinkIsDisplayed());
    }

    @Test
    @Severity(SeverityLevel.TRIVIAL)
    @Description("Verify that the remember me checkbox is displayed on the login page")
    @Epic("Ecommerce App")
    @Feature("Login")
    @Story("Verify that the remember me checkbox is displayed on the login page")
    public void verifyRememberMeCheckbox() {
        homePage.clickLogin();
        Assert.assertTrue(loginPage.verifyRememberMeCheckboxIsDisplayed());
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Verify that login with invalid credentials shows an error message")
    @Epic("Ecommerce App")
    @Feature("Login")
    @Story("Verify that login with invalid credentials shows an error message")
    public void verifyLoginWithInvalidCredentials() {
        homePage.clickLogin();
        loginPage.fillOutFormWithDataProvider("invalid@email.com", "wrongpass");
        loginPage.clickLogin();
        Assert.assertFalse(loginPage.getLoginErrorMessage().isEmpty());
    }
}
