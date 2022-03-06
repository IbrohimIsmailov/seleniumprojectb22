package com.cybertek.tests.day4_css_selector_xpath;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_cssSelectorAmazonTask {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https:www.amazon.com");
        driver.manage().window().maximize();

        WebElement amazonSearchBar = driver.findElement(By.cssSelector("input[type=\"text\"]"));
        amazonSearchBar.sendKeys("wooden spoon" + Keys.ENTER);

        String expectedTitle = "Amazon.com : wooden spoon";
        String actualtitle = driver.getTitle();

        if (actualtitle.equals(expectedTitle)) {
            System.out.println("Title Verification Passed: " + actualtitle);
        } else {
            System.out.println("Title Verification Failed");
        }

        driver.close();

    }
}
