package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.Utilities.BrowserUtils;
import com.cybertek.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractices {

    @Test
    public void tc15_actions_hover() throws InterruptedException {
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[3]"));

        WebElement user1 = Driver.getDriver().findElement(By.xpath("(//h5)[1]"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("(//h5)[2]"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("(//h5)[3]"));


        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.sleep(2);
        actions.moveToElement(img1).perform();
        Assert.assertTrue(user1.isDisplayed(), "Failed!!!");

        BrowserUtils.sleep(2);
        actions.moveToElement(img2).perform();
        Assert.assertTrue(user2.isDisplayed(), "Failed!!!");

        BrowserUtils.sleep(2);
        actions.moveToElement(img3).perform();
        Assert.assertTrue(user3.isDisplayed(), "Failed!!!");

        Driver.closeDriver();
    }

    @Test
    public void scrolling_test() throws InterruptedException {

        Driver.getDriver().get("http://practice.cybertekschool.com/");

        Actions actions = new Actions(Driver.getDriver());
        WebElement link = Driver.getDriver().findElement(By.linkText("CYDEO"));

        BrowserUtils.sleep(2);
        actions.moveToElement(link).perform();

        //scrolling up using Keys.Page_Up button
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();

        
    }

}
