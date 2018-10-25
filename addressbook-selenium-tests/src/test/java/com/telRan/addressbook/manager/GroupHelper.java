package com.telRan.addressbook.manager;

import com.telRan.addressbook.model.Group;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Gran1 on 22/10/2018.
 */
public class GroupHelper extends HelperBase{


    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    public void returnToTheGroupPage() {
        click(By.cssSelector("i a[href='group.php']"));
    }

    public void submitGroupCreation(By locator) {
        click(locator);
    }

    public void fillGroupForm(Group group) {
        type(By.name("group_name"), group.getGroupName());
        type(By.name("group_header"), group.getGroupHeader());
        type(By.name("group_footer"), group.getGroupFooter());
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void openGroupsPage() {
        click(By.cssSelector("[href='group.php']"));
    }

    public void submitGroupModification() {
        click(By.name("update"));

    }

    public void initGroupModification() {
        click(By.cssSelector("[name=edit]:last-child"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void deleteGroup() {
        click(By.name("delete"));

    }

    public boolean isGroupPresent(){
        return isElementPresent(By.name("selected[]"));
    }

    public void createGroup() {
        initGroupCreation();
        fillGroupForm(new Group()
                .setGroupName("name test")
                .setGroupHeader("lalalala")
                .setGroupFooter("tratatatata"));
        submitGroupCreation(By.name("submit"));
        returnToTheGroupPage();

    }

    public int getGroupsCount() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public void selectGroupByIndex(int index) {
        wd.findElements(By.name("selected[]")).get(index).click();
    }
}
