package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");

        String currentUrl = driver.getCurrentUrl();

        if (currentUrl.contains("cybertekschool")) {
            System.out.println("Passed: It contains cybertekschool");
        } else {
            System.out.println("The URl does not contain cybertekschool");
        }
        String currentTitle = driver.getTitle();

        if (currentTitle.equalsIgnoreCase("practice")) {
            System.out.println("Verified:" + currentTitle);
        } else {
            System.out.println("Failed: Something is wrong ");
        }

    }
}
