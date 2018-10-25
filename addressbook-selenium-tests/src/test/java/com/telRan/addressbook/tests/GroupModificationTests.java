package com.telRan.addressbook.tests;

import com.telRan.addressbook.model.Group;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Gran1 on 15/10/2018.
 */


public class GroupModificationTests extends TestBase {
    @BeforeMethod
    public void preconditions() {
        app.getGroupHelper().openGroupsPage();
        if (!app.getGroupHelper().isGroupPresent()) {
            app.getGroupHelper().createGroup();
        }
    }

    @Test
    public void testGroupModification() {

        app.getGroupHelper().openGroupsPage();
        int before = app.getGroupHelper().getGroupsCount();
        app.getGroupHelper().selectGroupByIndex(before-1);
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new Group()
                .setGroupName("modifyed")
                .setGroupHeader("new")
                .setGroupFooter("Change"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToTheGroupPage();
        int after = app.getGroupHelper().getGroupsCount();
        Assert.assertEquals(after, before);


    }



}
