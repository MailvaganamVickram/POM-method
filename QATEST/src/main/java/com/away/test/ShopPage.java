package com.away.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.TestApp;

public class ShopPage {

    WebDriver driver = TestApp.getInstance().getDriver();

    public void clickOnShop(){

        driver.get("https://www.awaytravel.com/shop");
    }

    public void selectItem(){
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath("//*[@id=\"products\"]/div/div/div/div[1]"),10);
        driver.findElement(By.xpath("//*[@id=\"products\"]/div/div/div/div[1]")).click();
    }

    public void clickOnAddToCart() {
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath("//*[@id=\"main-content\"]/section/div[1]/div[3]/section[2]/div[4]"),10);
        driver.findElement(By.xpath
                ("//*[@id=\"main-content\"]/section/div[1]/div[3]/section[2]/div[4]")).click();
    }

    public void viewCart(){
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath("//button[@class='component button-component cart_item_cta__aHNxa button_component__de_gB button_secondary__85N6u']"),10);
        driver.findElement(By.xpath
                ("//button[@class='component button-component cart_item_cta__aHNxa button_component__de_gB button_secondary__85N6u']")).click();
    }
}
