package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_ZeroBankHeader {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");
        String actualHeader = driver.findElement(By.tagName("h3")).getText();

        String expectedHeader = "Log in to ZeroBank";
        if (actualHeader.equals(expectedHeader)) {
            System.out.println("Header Verification Passed: " + actualHeader);
        } else {
            System.out.println("Header Verification Failed");
        }

        driver.close();
    }
}
