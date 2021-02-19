package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class GroupCreationsTests extends TestBase {

  @Test
  public void testGroupCreations() throws Exception {

    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test3", "test3", "test3"));
    submitGroupCreation();
    returnToGroupPage();

  }

}
