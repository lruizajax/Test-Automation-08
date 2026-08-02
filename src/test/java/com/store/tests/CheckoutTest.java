package com.store.tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;

public class CheckoutTest {

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Epic("Ecommerce App")
    @Feature("Checkout")
    @Story("Verify that the checkout flow works correctly")
    @Description("Verify that the checkout flow works correctly")
    public void verifyCheckoutFlow(){

    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Epic("Ecommerce App")
    @Feature("Checkout")
    @Story("Verify that the checkout flow works correctly with missing data")
    @Description("Verify that the checkout flow works correctly with missing data")
    public void verifyCheckoutWithMissingData(){

    }

    @Test
    @Severity(SeverityLevel.TRIVIAL)
    @Epic("Ecommerce App")
    @Feature("Checkout")
    @Story("Verify that checkout page elements are displayed correctly")
    @Description("Verify that checkout page elements are displayed correctly")
    public void verifyCheckoutPageElements(){

    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @Epic("Ecommerce App")
    @Feature("Checkout")
    @Story("Verify that the guest checkout option is available")
    @Description("Verify that the guest checkout option is available")
    public void verifyGuestCheckoutOption(){

    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Epic("Ecommerce App")
    @Feature("Checkout")
    @Story("Verify that an order can be placed successfully")
    @Description("Verify that an order can be placed successfully")
    public void verifyPlaceOrder(){

    }
}
