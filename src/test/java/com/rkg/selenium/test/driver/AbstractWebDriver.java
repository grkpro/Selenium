/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rkg.selenium.test.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author ravikumar.gowri
 */
public abstract class AbstractWebDriver {

    public WebDriver driver;

    public void populateChromDriver() {
        System.setProperty("webdriver.chrome.driver", "D:\\6-Jars\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

}
