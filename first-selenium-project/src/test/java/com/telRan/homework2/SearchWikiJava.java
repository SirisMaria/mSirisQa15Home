package com.telRan.homework2;

import com.telRan.qa15.sandbox.lesson2wikipedia.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchWikiJava extends TestBases {

    @Test
    public void searchJavaInWiki(){
        wd.navigate().to("https://www.wikipedia.org/");
        wd.findElement(By.name("search")).sendKeys("Java");
        wd.findElement(By.cssSelector("i.sprite.svg-search-icon")).click();


        String currentUrl = wd.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://en.wikipedia.org/wiki/Java");
    }
}

