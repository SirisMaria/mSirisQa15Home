package com.telRan.addressbook.tests;

import com.telRan.addressbook.manager.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Created by Gran1 on 15/10/2018.
 */
public class TestBase {

    protected ApplicationManager app = new ApplicationManager();

    @BeforeClass


    public void setUp() {
        app.start();
    }


    //------------------------------------------------------------------------------
    @AfterClass
    public void tearDown() {
        app.stop();
    }

}

