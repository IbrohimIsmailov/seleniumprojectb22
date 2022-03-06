package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.Utilities.BrowserUtils;
import com.cybertek.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExecutorPractices {

    @Test
    public void scroll_using_jsexecutor_test() throws InterruptedException {

        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");
        BrowserUtils.sleep(2);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        for (int i = 0; i < 10; i++) {

            BrowserUtils.sleep(2);
             js.executeScript("window.scrollBy(0, 750)");

        }
    }

    @Test
    public void scroll_using_jsExecutor_test2() throws InterruptedException {
        Driver.getDriver().get("http://practice.cybertekschool.com/large");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        WebElement link = Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homelink = Driver.getDriver().findElement(By.linkText("Home"));

        js.executeScript("arguments[0].scrollIntoView(true)", link);

        BrowserUtils.sleep(2);

        js.executeScript("arguments[0].scrollIntoView(true)", homelink);

    }

}
