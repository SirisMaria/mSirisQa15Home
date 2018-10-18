package com.telRan.addressbook;


import org.testng.annotations.Test;

/**
 * Created by Gran1 on 11/10/2018.
 */
public class GroupCreationTests extends TestBase{

    @Test
    public void testGroupCreation() {
        openGroupsPage();
        initGroupCreation();
        fillGroupForm(new Group()
                .setGroupName("name test")
                .setGroupHeader("lalalala")
                .setGroupFooter("tratatatata"));
        submitGroupCreation();
        returnToTheGroupPage();


    }


}
