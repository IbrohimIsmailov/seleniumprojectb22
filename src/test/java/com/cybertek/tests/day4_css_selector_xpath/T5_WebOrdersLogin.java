package com.cybertek.tests.day4_css_selector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_WebOrdersLogin {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title Verification Passed:" + actualTitle);
        } else {
            System.out.println("Title Verification Failed");
        }
        WebElement inputusername = driver.findElement(By.className("txt"));
        inputusername.sendKeys("Tester");
        Thread.sleep(1000);
        WebElement inputpassword = driver.findElement(By.id("ctl00_MainContent_password"));
        inputpassword.sendKeys("test");
        Thread.sleep(1000);
        WebElement loginButton = driver.findElement(By.className("button"));
        loginButton.click();

        String expectedTitleInside = "Web Orders";
        String actualtitleInside = driver.getTitle();

        if (actualtitleInside.equals(expectedTitleInside)) {
            System.out.println("Inside Page Verification Passed: " + actualtitleInside);
        } else {
            System.out.println("Inside Page Verification Failed:");
        }
        driver.close();
    }
}
