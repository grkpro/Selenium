/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rkg.selenium.test.inventorytransfer;

import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author ravikumar.gowri
 */
public class InventoryTransferTest {

    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\6-Jars\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void inventoryTransferRequestTransfer() throws InterruptedException {
        driver.get("http://10.129.146.71:8080/login.action");
        driver.manage().window().setSize(new Dimension(1552, 840));
        driver.findElement(By.id("userName")).click();
        driver.findElement(By.id("userName")).sendKeys("david.bost");
        driver.findElement(By.id("password")).sendKeys("david.bosttavant");
        driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
//        driver.wait(5000);
//        WebElement myDynamicElement = driver.findElement(By.id("homeLoginAlerts"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement homeLoginAlertsElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("homeLoginAlerts")));
       
        driver.findElement(By.cssSelector(".dijitDialogCloseIcon")).click();
        driver.findElement(By.id("inventory_button")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("PreDefinedDealerInventorySearch")));
        driver.findElement(By.id("PreDefinedDealerInventorySearch")).click();
        driver.switchTo().frame(1);
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("dealerInventorySearchForm")));
        
        driver.findElement(By.id("productFamilyMACHINE")).click();
        driver.findElement(By.id("productAutoCompleter_popup1")).click();
        driver.findElement(By.cssSelector(".dijitDownArrowButtonHover > .dijitReset")).click();
        driver.findElement(By.id("modelAutoCompleter_popup1")).click();
        driver.findElement(By.cssSelector(".buttonGeneric:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".row:nth-child(3) > .colapsableColumn:nth-child(3)")).click();
        driver.findElement(By.cssSelector("#\\_summaryTable_button_transferButton_label > .new_warranty_registration_button")).click();
        driver.switchTo().defaultContent();
        driver.findElement(By.cssSelector(".dijitTabCloseButtonHover")).click();
        driver.switchTo().frame(1);
        driver.findElement(By.cssSelector(".row:nth-child(9) > .colapsableColumn:nth-child(2)")).click();
        driver.findElement(By.cssSelector("#\\_summaryTable_button_transferButton_label .inboxButtonText")).click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame(2);
        driver.findElement(By.cssSelector("tr:nth-child(5) > td:nth-child(2)")).click();
        driver.findElement(By.id("transferForRetailStock")).click();
        driver.findElement(By.id("inventoryTransferRequest_commentsToOwningDealer")).click();
        driver.findElement(By.id("inventoryTransferRequest_commentsToOwningDealer")).sendKeys("test");
        driver.findElement(By.id("inventoryTransferRequest_commentsToAccountingManager")).click();
        driver.findElement(By.id("inventoryTransferRequest_commentsToAccountingManager")).sendKeys("test");
        driver.findElement(By.cssSelector("td:nth-child(2) > .buttonGeneric")).click();
        driver.switchTo().defaultContent();
        driver.findElement(By.cssSelector(".dijitTabCloseButtonHover")).click();

    }
}
