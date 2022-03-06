package com.cybertek.tests.day14_pom_synchronization;

import com.cybertek.Utilities.Driver;
import com.cybertek.pages.TelerikPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractices {

    @Test
    public void drag_and_drop_test() {
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        TelerikPage telerikPage = new TelerikPage();
        telerikPage.dragAndDrop();
        String expected = "You did great!";
        String actual = telerikPage.bigCircle.getText();

        Assert.assertEquals(actual, expected);

        

    }

}
