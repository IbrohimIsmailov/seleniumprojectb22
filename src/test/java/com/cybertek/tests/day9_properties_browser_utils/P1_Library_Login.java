package com.cybertek.tests.day9_properties_browser_utils;

import com.cybertek.Utilities.BrowserUtils;
import com.cybertek.Utilities.LibraryUtils;
import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P1_Library_Login {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {


        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://library2.cybertekschool.com/login.html");
    }


    @Test
    public void login() throws InterruptedException {

        LibraryUtils.loginToLibrary(driver);

        BrowserUtils.sleep(2);
        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
        System.out.println("AllLinks.size() = " + allLinks.size());

        for (WebElement each : allLinks) {
            System.out.println(each.getText());
        }

    }
}
