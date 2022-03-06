package com.cybertek.tests.day3_review_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F3_HeaderVerification {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        WebElement headerText = driver.findElement(By.tagName("h2"));
        String actualHeader = headerText.getText();
        String expectedHeader = "Connect with friends and the world around you on Facebook.";

        if (actualHeader.equals(expectedHeader)) {
            System.out.println("Header Verification Passed: " + actualHeader);
        } else {
            System.out.println("Header Verification Failed ");
        }
        Thread.sleep(2000);
        driver.close();

    }
}
