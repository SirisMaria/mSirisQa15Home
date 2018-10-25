package com.telRan.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Gran1 on 15/10/2018.
 */
public class GroupDeletionTest extends TestBase{

    @BeforeMethod
    public void preconditions() {
        app.getGroupHelper().openGroupsPage();
        if (!app.getGroupHelper().isGroupPresent()) {
            app.getGroupHelper().createGroup();
        }
    }
    @Test
    public void testGroupDeletion(){
        app.getGroupHelper().openGroupsPage();
        int before = app.getGroupHelper().getGroupsCount();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteGroup();
        app.getGroupHelper().returnToTheGroupPage();
        int after = app.getGroupHelper().getGroupsCount();
        Assert.assertEquals(after,before-1);

    }

}
