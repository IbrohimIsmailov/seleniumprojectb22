package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooPractice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com");
        String currentTitle = driver.getTitle();

        if (currentTitle.contains("Yahoo")) {
            System.out.println("It is verified - " + currentTitle);
        } else {
            System.out.println("It is not verified - " + currentTitle);
        }

        driver.close();

    }
}
