package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {

        // 1- set uo web browser
        WebDriverManager.chromedriver().setup();

        // 2 - create the instance of chromedriver
        // this line opens a browser
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //will work for mac only
      //  driver.manage().window().fullscreen();

        // 3-test if the driver is working
        driver.get("https://www.tesla.com");
        System.out.println("current title - " + driver.getTitle());
        String currentURl = driver.getCurrentUrl();
        System.out.println(currentURl);

        //Going back using navigation
        Thread.sleep(3000);
        driver.navigate().back();

        //going forward using navigation
        Thread.sleep(3000);
        driver.navigate().forward();

        //refreshing the page using navigation
        driver.navigate().refresh();

        //going to another url using navigation. to() method
        driver.navigate().to("https://www.google.com");

        System.out.println("current title - " + driver.getTitle());

        System.out.println(driver.getCurrentUrl());



    }
}
