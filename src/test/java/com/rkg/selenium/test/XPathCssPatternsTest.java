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

/**
 *
 * @author ravikumar.gowri
 */
public class XPathCssPatternsTest extends AbstractWebDriver {

    @Before
    public void setup() {
        populateChromDriver();
        driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/authwall");
    }

    @After
    public void close() {
        driver.quit();
    }

    @Test
    @Ignore
    public void formElementsXPath() {
        // Enter first name into input type tag with id 'first-name'
        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Test");
        // Enter lasst name into any type of tag with id is 'last-name'
        driver.findElement(By.xpath("//*[@id='last-name']")).sendKeys("Test LastName");
        // Enterr email of phone into any type of tag with name is 'emeail-or-phone'
        driver.findElement(By.xpath("//*[@name='email-or-phone']")).sendKeys("1111111");
        // Click on button type tag with id 'join-form-submit'
        driver.findElement(By.xpath("//button[@id='join-form-submit']")).click();
        System.out.println("########### Error Messages #############");
        System.out.println(driver.findElement(By.cssSelector("p.alert-content")).getText());
    }

    @Test
    @Ignore
    public void formElementsCSS() {
        // Enter first name into input type tag with id 'first-name'
        driver.findElement(By.cssSelector("input[id='first-name']")).sendKeys("Test");
        // Enter last name into any type of tag with id is 'last-name'
        driver.findElement(By.cssSelector("[id='last-name']")).sendKeys("Test LastName");
        // Enterr email of phone into any type of tag with name is 'emeail-or-phone'
        driver.findElement(By.cssSelector("[name='email-or-phone']")).sendKeys("1111111");
        // Click on button type tag with id 'join-form-submit'
        driver.findElement(By.cssSelector("button[id='join-form-submit']")).click();
        System.out.println("########### Error Messages #############");
        System.out.println(driver.findElement(By.cssSelector("p.alert-content")).getText());
    }

    /**
     *  If attribute is too long, then we will use regular expression
     */
    @Test
    public void regExpression() {
        // Enter first name into input type tag with id 'first-name'
        driver.findElement(By.xpath("//input[contains(@id,'first-name')]")).sendKeys("Test");
        // Enter lasst name into any type of tag with id is 'last-name'
        driver.findElement(By.cssSelector("input[id*='last-name']")).sendKeys("Test LastName");
        // Enterr email of phone into any type of tag with name is 'emeail-or-phone'
        driver.findElement(By.cssSelector("input[name*='email-or-phone']")).sendKeys("1111111");
        // Click on button type tag with id 'join-form-submit'
        driver.findElement(By.xpath("//button[@id='join-form-submit']")).click();
        System.out.println("########### Error Messages #############");
        System.out.println(driver.findElement(By.cssSelector("p.alert-content")).getText());
    }
}
