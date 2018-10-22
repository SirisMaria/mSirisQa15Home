package com.telRan.addressbook;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Gran1 on 11/10/2018.
 */
public class GroupCreationTests extends TestBase{

    @Test
    public void testGroupCreation() {
        app.openGroupsPage();

        int before = app.getGroupsCount();

        app.initGroupCreation();
        app.fillGroupForm(new Group()
                .setGroupName("name test")
                .setGroupHeader("lalalala")
                .setGroupFooter("tratatatata"));
        app.submitGroupCreation(By.name("submit"));
        app.returnToTheGroupPage();

        int after = app.getGroupsCount();
        Assert.assertEquals(after,before+1);


    }
}
