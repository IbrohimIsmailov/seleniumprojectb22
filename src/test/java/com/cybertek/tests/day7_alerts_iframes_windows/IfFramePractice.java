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

public class IfFramePractice {
    WebDriver driver;

    @BeforeMethod
    public void methodSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/iframe");

    }

    @Test
    public void IframeTest() {
        WebElement iframeText = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframeText);
        WebElement contentText = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(contentText.isDisplayed(), "In case it failes show this text");
        driver.switchTo().parentFrame();
        WebElement outsideText = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(outsideText.isDisplayed());

    }
}
