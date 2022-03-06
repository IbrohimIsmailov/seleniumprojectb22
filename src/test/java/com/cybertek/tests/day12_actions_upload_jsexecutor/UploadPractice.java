package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.Utilities.BrowserUtils;
import com.cybertek.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadPractice {

    @Test
    public void upload_test() throws InterruptedException {
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");

        String path = "C:\\Users\\Name\\Desktop\\HTML Class\\sunshine.jpg";

        WebElement chooseFile = Driver.getDriver().findElement(By.id("file-upload"));
        WebElement upload = Driver.getDriver().findElement(By.id("file-submit"));

        BrowserUtils.sleep(2);
        chooseFile.sendKeys(path);
        upload.click();

        WebElement text = Driver.getDriver().findElement(By.tagName("h3"));

        Assert.assertTrue(text.isDisplayed());

        Driver.closeDriver();
    }

}
