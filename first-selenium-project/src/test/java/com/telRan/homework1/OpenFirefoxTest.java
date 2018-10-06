package com.telRan.homework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OpenFirefoxTest {
    WebDriver wd;

    @BeforeMethod
    public void setUp() {
        wd = new FirefoxDriver();

    }
    @Test
    public void testOpenWikipedia(){
        wd.navigate().to("https://www.wikipedia.org/");
    }
    @AfterMethod
    public void tearDown(){
        wd.quit();

    }


    }

