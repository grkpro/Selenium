/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rkg.selenium.test;

import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author ravikumar.gowri
 */
public class SeleniumIDE {

    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\6-Jars\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void searchJava8() {
//        driver.get("https://www.google.com/");
        driver.manage().window().setSize(new Dimension(1552, 840));
        driver.findElement(By.name("q")).sendKeys("java 8 examples");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector(".g:nth-child(1) .LC20lb")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".entry-categories > a"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
    }

    @Test
    public void goldRates() {
//        driver.get("https://www.google.com/");
        driver.manage().window().setSize(new Dimension(1552, 840));
        driver.findElement(By.name("q")).sendKeys("Today gold rates");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector(".g:nth-child(2) > .rc:nth-child(2) .LC20lb")).click();
        js.executeScript("window.scrollTo(0,95.19999694824219)");
        js.executeScript("window.scrollTo(0,200)");
        js.executeScript("window.scrollTo(0,300)");
        driver.findElement(By.cssSelector(".same-city-link > a")).click();
    }
}
