/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rkg.selenium.test;

import com.rkg.selenium.test.driver.AbstractWebDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author ravikumar.gowri
 */
public class ElementTest extends AbstractWebDriver {

    @Before
    public void setup() {
        populateChromDriver();
        driver.manage().window().maximize();
        driver.get("http://gmail.com");
    }

    @After
    public void close() {
        driver.quit();
    }

    /**
     * Method run test using element Id. Get Element Id from browser by
     * Inspecting Element.
     */
    @Test
    @Ignore
    public void testIdElement() {
        driver.findElement(By.id("identifierId")).sendKeys("testuser");
        driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
    }

    /**
     * Method run test using element name. Get Element Name from browser by
     * Inspecting Element.
     */
    @Test
    @Ignore
    public void testNameElement() {
        driver.findElement(By.name("identifier")).sendKeys("testuser");
        driver.findElement(By.name("identifier")).sendKeys(Keys.ENTER);
    }

    /**
     * Method run test using XPath. Get Element Xpath from browser by
     * <li> Inspect Element</li>
     * <li>Right click on console</li>
     * <li>Copy then Copy XPath </li>
     * <li>Convert double quotes into single quotes</li>
     */
    @Test
    @Ignore
    public void testXPathElement() {
        driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("testuser");
        driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(Keys.ENTER);
    }

    /**
     * Method run test using XPath. Get Element CSS Selector from browser by
     * <li>Inspect Element</li>
     * <li>Right click on console</li>
     * <li>Copy then Copy Selector </li>
     * <li>Convert double quotes into single quotes</li>
     */
    @Test
    @Ignore
    public void testCSSSelectorElement() {
        driver.findElement(By.cssSelector("#identifierId")).sendKeys("testuser");
        driver.findElement(By.cssSelector("#identifierId")).sendKeys(Keys.ENTER);
    }

    @Test
    @Ignore
    public void testLinkElement() {
        driver.findElement(By.linkText("Learn more")).click();
    }

    @Test
    public void testCaptureMessages() {
//        driver.findElement(By.cssSelector("#identifierId")).sendKeys("testuser");
//        driver.findElement(By.cssSelector("#identifierId")).sendKeys(Keys.ENTER);
        System.out.println(driver.findElement(By.cssSelector("div#PrDSKc")).getText());
    }
}
