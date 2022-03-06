package com.cybertek.tests.day7_alerts_iframes_windows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WindowHandlePractice {
    WebDriver driver;

    @BeforeMethod
    public void methodSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/windows");
    }

    @Test
    public void window_test() {
        String currenttitle = driver.getTitle();
        String expectedTitle = "New Window";
        Assert.assertEquals(currenttitle, expectedTitle);
        String mainHandle = driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);

        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

        for (String each : driver.getWindowHandles() ) {
            driver.switchTo().window(each);
            System.out.println("Current title while switching "+driver.getTitle());
        }
        

    }
}
