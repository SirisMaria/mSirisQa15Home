package com.telRan.addressbook;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Gran1 on 15/10/2018.
 */


public class GroupModificationTests extends TestBase {
    @BeforeMethod
    public void preconditions() {
        openGroupsPage();
        if (!isGroupPresent()) {
            createGroup();
        }
    }

    @Test
    public void testGroupModification(){

        openGroupsPage();
        selectGroup();
        initGroupModification();
        fillGroupForm(new Group()
                .setGroupName("modifyed")
                .setGroupHeader("new")
                .setGroupFooter("Change"));
        submitGroupModification();
        returnToTheGroupPage();


    }

}
