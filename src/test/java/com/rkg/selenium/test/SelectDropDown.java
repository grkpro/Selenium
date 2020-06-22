/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rkg.selenium.test;

import com.rkg.selenium.test.driver.AbstractWebDriver;
import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author ravikumar.gowri
 */
public class SelectDropDown extends AbstractWebDriver {

    @Before
    public void setup() {
        populateChromDriver();
        driver.manage().window().maximize();

    }

    @After
    public void close() {
//        driver.quit();
    }

    @Test
    @Ignore
    public void dropDown() {
        driver.get("https://www.cleartrip.com/");
        Select adults = new Select(driver.findElement(By.id("Adults")));
        adults.selectByIndex(1);
        Select children = new Select(driver.findElement(By.id("Childrens")));
        children.selectByValue("3");
    }

    @Test
    public void dropDownTest() throws InterruptedException {
        driver.get("https://www.spicejet.com/");
        Thread.sleep(3000);
        //Click on From city
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        // Select Bangalore city in from dropdowwn
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(3000);
        //Select Chennai city in to dropdown. Here using index number as 2 because MAA value available in two places so we are trying to get only second one.
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        
        //Select Depart Date
        driver.findElement(By.cssSelector("div#ui-datepicker-div div.ui-datepicker-group.ui-datepicker-group-first > table > tbody > tr:nth-child(4) > td:nth-child(3) > a")).click();
        
        //Select 3 Adults
        driver.findElement(By.id("divpaxinfo")).click();
        Select adults = new Select (driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        adults.selectByValue("3");
        
        Select childs = new Select (driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
        childs.selectByValue("4");        
        driver.findElement(By.id("divpaxinfo")).click();
        
        //Select Search button
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
    }
}
