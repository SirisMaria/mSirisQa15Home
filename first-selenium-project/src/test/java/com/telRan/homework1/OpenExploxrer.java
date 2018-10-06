package com.telRan.homework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenExploxrer {
    WebDriver driver;


    @BeforeMethod
    public void setUp(){
        driver = new InternetExplorerDriver();

    }
    @Test
    public void testOpenWikipedia(){
        driver.navigate().to("https://www.wikipedia.org/");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();

    }
}
