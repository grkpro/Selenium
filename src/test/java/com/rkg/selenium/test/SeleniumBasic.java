package com.rkg.selenium.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.rkg.selenium.test.driver.AbstractWebDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

/**
 *
 * @author ravikumar.gowri
 */
public class SeleniumBasic extends AbstractWebDriver {

    @Before
    public void setup() {
        populateChromDriver();
        driver.manage().window().maximize();
    }

    @After
    public void close() {
        driver.quit();
    }

    public void openURL() {
        driver.navigate().to("https://www.google.com/");
        System.out.println("Title of browser :" + driver.getTitle());
        System.out.println("Current URL :" + driver.getCurrentUrl());
    }

    @Test
    public void searchTextInGoogle() {
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Covid 19 tracker");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }
}
