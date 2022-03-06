package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P0_FindElements_Practice {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));

        for (WebElement eahc : listOfLinks) {
            System.out.println(eahc.getText());
        }

        System.out.println("listOfLinks.size() = " + listOfLinks.size());

        driver.close();

    }
}
