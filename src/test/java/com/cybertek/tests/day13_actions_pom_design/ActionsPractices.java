package com.cybertek.tests.day13_actions_pom_design;

import com.cybertek.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractices {

    @Test
    public void p2_double_click_test() {

        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");


        Driver.getDriver().switchTo().frame("iframeResult");

        WebElement element = Driver.getDriver().findElement(By.xpath("//p[@id='demo']"));

        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(element).perform();

        String expectedStyle = "red";
        String actualStyle = element.getAttribute("style");

        Assert.assertTrue(actualStyle.contains(expectedStyle), "Failed!!!");


    }

}
