package com.cybertek.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LibraryUtils {


    public static void loginToLibrary(WebDriver driver) {
        WebElement emailInput = driver.findElement(By.xpath("//input[@type='email']"));
        emailInput.sendKeys("student13@library");
        WebElement passwordInput = driver.findElement(By.xpath("//input[@type='password']"));
        passwordInput.sendKeys("zcVbvUWH");
        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        button.click();

    }
}
