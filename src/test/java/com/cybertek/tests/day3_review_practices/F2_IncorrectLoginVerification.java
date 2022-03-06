package com.cybertek.tests.day3_review_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_IncorrectLoginVerification {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        driver.findElement(By.name("email")).sendKeys("mailov1234@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("pass")).sendKeys("Abcde1234" + Keys.ENTER);
        Thread.sleep(2000);
        String expectedTitle = "Log into Facebook";
        Thread.sleep(5000);
        String actualttile = driver.getTitle();

        if (actualttile.equals(expectedTitle)) {
            System.out.println("Verification Passed " + actualttile);
        } else {
            System.out.println("Verification Failed");
        }

    }
}
