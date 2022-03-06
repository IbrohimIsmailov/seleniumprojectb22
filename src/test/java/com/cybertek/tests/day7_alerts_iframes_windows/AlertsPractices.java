package com.cybertek.tests.day7_alerts_iframes_windows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertsPractices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

    }

    @Test
    public void informationAlert() {
        WebElement alertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        alertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
        String actualText = resultText.getText();
        String expectedText = "You successfuly clicked an alert";
        Assert.assertEquals(actualText, expectedText);
        Assert.assertTrue(resultText.isDisplayed());
        
    }

}
