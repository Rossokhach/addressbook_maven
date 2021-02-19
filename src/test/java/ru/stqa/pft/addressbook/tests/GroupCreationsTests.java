package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationsTests extends TestBase {

  @Test
  public void testGroupCreations() throws Exception {

    app.gotoGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("test3", "test3", "test3"));
    app.submitGroupCreation();
    app.returnToGroupPage();

  }

}
