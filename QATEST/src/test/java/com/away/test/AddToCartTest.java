package com.away.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class AddToCartTest {

    Home home;
    ShopPage shopPage;

    @BeforeMethod
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();
        shopPage=new ShopPage();
        shopPage.clickOnShop();

    }

    @Test
    public void testAddToCart() {
        shopPage=new ShopPage();
        shopPage.selectItem();
        shopPage.clickOnAddToCart();
        shopPage.viewCart();

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        TestApp.getInstance().closeBrowser();
    }
}
