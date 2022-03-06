package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_ZeroBankVerification {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");
        WebElement actualLinkText = driver.findElement(By.className("brand"));
        String actualText = actualLinkText.getText();
        String expectedLinkText = "Zero Bank";

        if (actualText.equals(expectedLinkText)) {
            System.out.println("Verification Passed: " + actualText);
        } else {
            System.out.println("Verification Failed");
        }

        WebElement linkHref = driver.findElement(By.tagName("a"));
        String actualAttribute = linkHref.getAttribute("href");
        String expectedAttribute = "index.html";

        if (actualAttribute.contains(expectedAttribute)) {
            System.out.println("They both have the same attribute value: " + actualAttribute);
        } else {
            System.out.println("They do not have the same attribute value");
        }

        Thread.sleep(2000);
        driver.close();
    }
}
