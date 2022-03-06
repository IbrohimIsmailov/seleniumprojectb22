package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3NavigationAndTitleVerification {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        Thread.sleep(2000);
        driver.findElement(By.linkText("Gmail")).click();

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Verified:" + actualTitle);
        } else {
            System.out.println("Failed:");
        }
        Thread.sleep(2000);
        driver.navigate().back();
        String expectedTitle2 = "Google";
        String actualtitile2 = driver.getTitle();

        if (actualtitile2.equalsIgnoreCase(expectedTitle2)) {
            System.out.println("Verified:" + actualtitile2);
        } else {
            System.out.println("Failed:");
        }

    }
}
