package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearchVerification {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        Thread.sleep(1000);
        driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);

        String expectedTitle = "apple";
        String actualTitle = driver.getTitle();

        if (actualTitle.startsWith(expectedTitle)) {
            System.out.println("Verification Title Passed.");
        } else {
            System.out.println("Verification Title Failed.");
        }

        driver.close();

    }
}
