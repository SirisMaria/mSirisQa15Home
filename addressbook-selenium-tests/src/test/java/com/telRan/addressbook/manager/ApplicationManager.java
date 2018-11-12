package com.telRan.addressbook.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

/**
 * Created by Gran1 on 22/10/2018.
 */
public class ApplicationManager {
    WebDriver wd;
    private SessionHelper sessionHelper;
    private GroupHelper groupHelper;
    private NavigationHelper navigationHelper;
    private String browser;

    public ApplicationManager(String browser) {

        this.browser = browser;
    }


    public void start() {
        if(browser.equals(BrowserType.CHROME)){
            wd = new ChromeDriver();
        }else if(browser.equals(BrowserType.FIREFOX)){
            wd = new FirefoxDriver();
        }else if(browser.equals(BrowserType.CHROME )){
            wd = new EdgeDriver();
        }
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navigationHelper = new NavigationHelper(wd);

        navigationHelper.openSite("http://localhost:8081/addressbook");
        sessionHelper = new SessionHelper(wd);

        sessionHelper.login("admin", "secret");

        groupHelper = new GroupHelper(wd);



    }

    public void stop() {
        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }
    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
