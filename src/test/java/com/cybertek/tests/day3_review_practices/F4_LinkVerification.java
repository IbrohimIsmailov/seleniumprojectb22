package com.cybertek.tests.day3_review_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F4_LinkVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        WebElement linktext = driver.findElement(By.linkText("Create a Page"));
        String actualLinkText = linktext.getAttribute("href");
        String expectedLinkText = "registration_form";

        if (actualLinkText.contains(expectedLinkText)) {
            System.out.println("Attribute Verification Passed: " + actualLinkText);
        } else {
            System.out.println("Attribute Verification Failed");
        }


    }
}
