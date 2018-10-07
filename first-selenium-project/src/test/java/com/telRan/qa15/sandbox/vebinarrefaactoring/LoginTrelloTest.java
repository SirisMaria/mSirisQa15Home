package com.telRan.qa15.sandbox.vebinarrefaactoring;

import com.telRan.qa15.sandbox.lesson2wikipedia.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTrelloTest extends TestBase{

    WebDriver wd;

    @Test
    public void testLoginToTheTrello() {
        //clickOnLoginButton
        clickOnLoginButton();
        //fillLoginForm
        fillLoginForm();
        //clickOnTheLoginButton
        clickOnTheLoginButton();

    }

    public void clickOnTheLoginButton() {
        wd.findElement(By.id("login")).click();
    }

    public void fillLoginForm() {
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys("siris230188@gmail.com");
        wd.findElement(By.name("password")).click();
        wd.findElement(By.name("password")).clear();
        wd.findElement(By.name("password")).sendKeys("1vot322vot");
    }

    public void clickOnLoginButton() {
        wd.findElement(By.cssSelector("[href=\"/login?returnUrl=%2F']")).click();
    }

}
