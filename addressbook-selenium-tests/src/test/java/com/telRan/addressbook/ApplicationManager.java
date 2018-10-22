package com.telRan.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Gran1 on 22/10/2018.
 */
public class ApplicationManager {

    private GroupHelper groupHelper;
    WebDriver wd;


    public void start() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.get("http://localhost:8080/addressbook/");


        login("admin", "secret");

        groupHelper = new GroupHelper();

    }

    public void login(String userName, String password) {
        groupHelper.type(By.name("user"), userName);
        groupHelper.type(By.name("pass"), password);
        groupHelper.click(By.cssSelector("[type=submit]"));
    }

    public void stop() {
        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }
}
