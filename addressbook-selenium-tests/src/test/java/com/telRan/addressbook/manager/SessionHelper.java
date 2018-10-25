package com.telRan.addressbook.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Gran1 on 25/10/2018.
 */
public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void login(String userName, String password) {
        type(By.name("user"), userName);
        type(By.name("pass"), password);
        click(By.cssSelector("[type=submit]"));
    }
}
