package com.cybertek.tests.day14_pom_synchronization;

import com.cybertek.Utilities.BrowserUtils;
import com.cybertek.Utilities.Driver;
import com.cybertek.pages.DynamicLoad1Page;
import com.cybertek.pages.DynamicLoad7Page;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class WebDriverWaitPractice {

    @Test
    public void dynamic_loading_7_test() {
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/7");
        DynamicLoad7Page dynamicLoad7Page = new DynamicLoad7Page();
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), 10);
        webDriverWait.until(ExpectedConditions.titleIs("Dynamic title"));
        Assert.assertTrue(dynamicLoad7Page.doneMessage.isDisplayed());
        Assert.assertTrue(dynamicLoad7Page.image.isDisplayed());

    }

    @Test
    public void dynamic_loading_1_test() {
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");

        DynamicLoad1Page dynamicLoad1Page = new DynamicLoad1Page();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        dynamicLoad1Page.startButton.click();
        wait.until(ExpectedConditions.invisibilityOf(dynamicLoad1Page.loadingBar));
        Assert.assertTrue(dynamicLoad1Page.inputUsername.isDisplayed());
        dynamicLoad1Page.inputUsername.sendKeys("tomsmith");
        dynamicLoad1Page.inputPassword.sendKeys("Abcd1234");
        BrowserUtils.sleep(5);
        dynamicLoad1Page.submitButton.click();
        Assert.assertTrue(dynamicLoad1Page.errorMessage.isDisplayed());
    }
    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }

}
