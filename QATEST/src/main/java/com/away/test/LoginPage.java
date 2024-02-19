package com.away.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.TestApp;

public class LoginPage {
    WebDriver driver = TestApp.getInstance().getDriver();

    public void enterEmail(String Email ){
        TestApp.getInstance().waitUntilNextElementAppears(By.id("login-email"),10);
        driver.findElement(By.id("login-email")).sendKeys(Email);
    }

    public void enterPassword(String Password){
        TestApp.getInstance().waitUntilNextElementAppears(By.id("login-password"),10);
        driver.findElement(By.id("login-password")).sendKeys(Password);
    }

    public void clickSubmit(){
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath("//*[@id=\"main-content\"]/div/form/button"),10);
        driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/form/button")).click();
    }
}
