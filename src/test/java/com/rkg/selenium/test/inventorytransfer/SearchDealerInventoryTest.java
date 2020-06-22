/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rkg.selenium.test.inventorytransfer;

import com.rkg.selenium.test.driver.AbstractWebDriver;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author ravikumar.gowri
 */
public class SearchDealerInventoryTest extends AbstractWebDriver {

    @Before
    public void setup() {
        populateChromDriver();
        driver.manage().window().maximize();
        driver.get("http://10.129.146.71:8080/login.action");
        authenticate();
    }

    @After
    public void close() {
//        driver.quit();
    }

    @Test
    public void searchDealerInventory() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("homeLoginAlerts")));
        driver.findElement(By.cssSelector(".dijitDialogCloseIcon")).click();

        driver.findElement(By.id("inventory_wrapper")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("PreDefinedDealerInventorySearch")));
        driver.findElement(By.id("PreDefinedDealerInventorySearch")).click();
        driver.switchTo().frame(1);
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("dealerInventorySearchForm")));
        driver.findElement(By.id("productFamilyMACHINE")).click();
        driver.findElement(By.id("productAutoCompleter")).sendKeys("COMPACT EXCAVATORS");
        driver.findElement(By.id("productAutoCompleter")).click();
        driver.findElement(By.cssSelector(".dijitDownArrowButtonHover > .dijitReset")).click();
    }

    public void authenticate() {
        driver.findElement(By.id("userName")).sendKeys("david.bost");
        driver.findElement(By.id("password")).sendKeys("david.bosttavant");
        driver.findElement(By.id("logMeInButton")).click();

    }
}
