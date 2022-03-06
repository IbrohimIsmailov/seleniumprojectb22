package com.cybertek.tests.day8_window_javafaker;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class multipleWindowsPractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");
    }

    @Test
    public void test1() {
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        for (String each : driver.getWindowHandles()) {
            driver.switchTo().window(each);
            System.out.println("Current title in the page is = " + driver.getTitle());

            if (driver.getTitle().contains("Etsy")) {
                break;
            }

        }
    }
}
