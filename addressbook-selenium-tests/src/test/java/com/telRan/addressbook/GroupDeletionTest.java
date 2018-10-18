package com.telRan.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Gran1 on 15/10/2018.
 */
public class GroupDeletionTest extends TestBase{

    @BeforeMethod
    public void preconditions() {
        openGroupsPage();
        if (!isGroupPresent()) {
            createGroup();
        }
    }
    @Test
    public void testGroupDeletion(){
        openGroupsPage();
        selectGroup();
        deleteGroup();
        returnToTheGroupPage();
    }

}
