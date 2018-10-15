package com.telRan.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Gran1 on 15/10/2018.
 */
public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification(){

        openGroupsPage();
        selectGroup();
        initGroupModification();
        fillGroupForm("modifyed","new","Changed");
        submitGroupModification();
        returnToTheGroupPage();


    }

}
