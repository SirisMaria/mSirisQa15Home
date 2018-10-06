package com.telRan.homework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenEdgeTest {
    WebDriver driver;


    @BeforeMethod
    public void setUp(){
        driver = new EdgeDriver();

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
