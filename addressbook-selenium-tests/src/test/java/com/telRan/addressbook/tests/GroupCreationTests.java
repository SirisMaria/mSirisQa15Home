package com.telRan.addressbook.tests;


import com.telRan.addressbook.model.Group;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Gran1 on 11/10/2018.
 */
public class GroupCreationTests extends TestBase{

    @Test
    public void testGroupCreation() {
        app.getGroupHelper().openGroupsPage();

        int before = app.getGroupHelper().getGroupsCount();

        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new Group()
                .setGroupName("name test")
                .setGroupHeader("lalalala")
                .setGroupFooter("tratatatata"));
        app.getGroupHelper().submitGroupCreation(By.name("submit"));
        app.getGroupHelper().returnToTheGroupPage();

        int after = app.getGroupHelper().getGroupsCount();
        Assert.assertEquals(after,before+1);


    }
}
