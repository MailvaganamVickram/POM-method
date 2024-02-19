package com.away.test;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class RegisterTest {

    Home home;

    SignUpPage signUpPage;

    SignUpSuccess signUpSuccess;

    @BeforeMethod
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();
        home = new Home();
        home.clickOnLoginLink();
    }

    @Test
    public void testRegister() {
        signUpPage = new SignUpPage();
        signUpPage.clickOnsignup();
        signUpPage.enterEmail("Test5@gmail.com");
        signUpPage.enterPassword("123456789");
        signUpPage.enterSubmit();
        signUpSuccess = new SignUpSuccess();
       String actualmsg = signUpSuccess.getSignupSuccess();
       Assert.assertEquals(actualmsg,"Edit Account Details");

    }

    @AfterMethod
    public void tearDown() {
       TestApp.getInstance().closeBrowser();
    }
}
