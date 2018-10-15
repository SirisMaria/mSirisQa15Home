package com.telRan.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Gran1 on 15/10/2018.
 */
public class DeleteGroupTests extends TestBase{

    @Test
    public void testGroupDeletion(){
        openGroupsPage();
        selectGroup();
        deleteGroup();
        returnToTheGroupPage();
    }

}
