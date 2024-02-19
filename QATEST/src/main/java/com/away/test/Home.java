package com.away.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.TestApp;


public class Home {
    WebDriver driver = TestApp.getInstance().getDriver();
    public void clickOnLoginLink(){
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath("//*[@id='header']/header/ul[2]/li/a/span"),10);
        driver.findElement(By.xpath
                ("//*[@id='header']/header/ul[2]/li/a/span")).click();
    }


}
