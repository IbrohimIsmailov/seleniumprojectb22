package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_CybertekTitleVerification {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/inputs");
        Thread.sleep(2000);
        driver.findElement(By.className("navbar-nav")).click();

        String expectedtitle = "Practice";
        String actualtitle = driver.getTitle();

        if (actualtitle.equalsIgnoreCase(expectedtitle)) {
            System.out.println("Verification Passed: " + actualtitle);
        } else {
            System.out.println("Verification Failed");
        }

        driver.close();

    }
}
