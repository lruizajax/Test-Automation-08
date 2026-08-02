package com.store.tests;

import com.store.utils.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {

    @Test
    @Epic("Ecommerce App")
    @Feature("Home Page")
    @Story("Verify that the main logo is displayed on the home page")
    @Description("Verify that the main logo is displayed on the home page")
    @Severity(SeverityLevel.NORMAL)
    @Owner("John Doe")
    public void verifyMainLogo() {
        Assert.assertFalse(homePage.verifyLogoIsDisplayed());
    }

    @Test
    @Epic("Ecommerce App")
    @Feature("Home Page")
    @Story("Verify that the search input is displayed on the home page")
    @Description("Verify that the search input is displayed on the home page")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Jennifer Smith")
    public void verifyInputSearch() {
        homePage.verifyInputSearchIsDisplayed();
    }

    @Test (groups = "smoke")
    @Epic("Ecommerce App")
    @Feature("Home Page")
    @Story("Verify that the top header menu is displayed on the home page")
    @Description("Verify that the top header menu is displayed on the home page")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Michael Johnson")
    public void verifyTopHeaderMenu() {
        homePage.verifyMenuOptions();
    }

    @Test
    @Epic("Ecommerce App")
    @Feature("Home Page")
    @Story("Verify that the login functionality works as expected")
    @Description("Verify that the login functionality works as expected")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Sarah Davis")
    public void verifyLoginWithEvidence() {
        homePage.verifyLogoIsDisplayedWithScreenShot();
    }

    @Test
    @Epic("Ecommerce App")
    @Feature("Home Page")
    @Story("Verify that the footer copyright is displayed on the home page")
    @Description("Verify that the footer copyright is displayed on the home page")
    @Severity(SeverityLevel.TRIVIAL)
    @Owner("Test Automation Team")
    public void verifyFooterCopyright() {
        Assert.assertTrue(homePage.verifyFooterIsDisplayed());
    }

    @Test
    @Epic("Ecommerce App")
    @Feature("Home Page")
    @Story("Verify the home page title matches the expected value")
    @Description("Verify the home page title matches the expected value")
    @Severity(SeverityLevel.TRIVIAL)
    @Owner("Test Automation Team")
    public void verifyHomePageTitle() {
        Assert.assertEquals(driver.getTitle(), "Demo Web Shop");
    }

    @Test
    @Epic("Ecommerce App")
    @Feature("Home Page")
    @Story("Verify that featured products section is displayed on the home page")
    @Description("Verify that featured products section is displayed on the home page")
    @Severity(SeverityLevel.MINOR)
    @Owner("Test Automation Team")
    public void verifyFeaturedProducts() {
        Assert.assertTrue(homePage.verifyFeaturedProductsAreDisplayed());
    }
}


