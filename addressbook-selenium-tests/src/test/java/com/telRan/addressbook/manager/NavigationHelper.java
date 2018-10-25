package com.telRan.addressbook.manager;

import org.openqa.selenium.WebDriver;

/**
 * Created by Gran1 on 25/10/2018.
 */
public class NavigationHelper extends HelperBase{

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }
    public void openSite(String url) {
        wd.get(url);
    }
}
