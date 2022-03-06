package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.Utilities.ConfigurationReader;
import com.cybertek.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DriverUtilPractice {


    @Test
    public void simple_google_search_test() {

        Driver.getDriver().get(ConfigurationReader.getProperty("googleUrl"));

        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));
        String searchValue = ConfigurationReader.getProperty("searchValue");
        searchBox.sendKeys(searchValue + Keys.ENTER);
        String actualTitle = Driver.getDriver().getTitle();

        if (actualTitle.contains(searchValue)) {
            System.out.println("Verification Passed");
        } else {
            System.out.println("Verification Failed");
        }

        Driver.closeDriver();

        Driver.getDriver().get("https://www.etsy.com");
    }

}
