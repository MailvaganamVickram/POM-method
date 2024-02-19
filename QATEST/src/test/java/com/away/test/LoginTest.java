package com.away.test;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.TestApp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class LoginTest {
    Home home;
    LoginPage loginPage;

    LoginSuccess loginSuccess;


    @BeforeMethod
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();
        home = new Home();
        home.clickOnLoginLink();

    }

    @Test
    public void testName() {
        loginPage = new LoginPage();
        loginPage.enterEmail("Mailvaganamvickram@gmail.com");
        loginPage.enterPassword("Vickram@123");
        loginPage.clickSubmit();
        loginSuccess = new LoginSuccess();
        String actualMsg= loginSuccess.setHiThereMsg();
        Assert.assertEquals(actualMsg, "Edit Account Details");
    }

    @AfterMethod
    public void tearDown() {

        TestApp.getInstance().closeBrowser();
    }
  

}
