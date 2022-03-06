package com.cybertek.tests.day4_css_selector_xpath;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_CssSelector_Cybertek {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement homelink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement headerText = driver.findElement(By.tagName("h2"));
        WebElement emailText = driver.findElement(By.cssSelector("label[for='email']"));
        WebElement emailInputBox = driver.findElement(By.cssSelector("input[type='text']"));
        WebElement retrievePassword = driver.findElement(By.cssSelector("button[class='radius']"));
        WebElement cybertekText = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        System.out.println("homelink.isDisplayed() = " + homelink.isDisplayed());
        System.out.println("headerText.isDisplayed() = " + headerText.isDisplayed());
        System.out.println("emailText.isDisplayed() = " + emailText.isDisplayed());
        System.out.println("emailInputBox.isDisplayed() = " + emailInputBox.isDisplayed());
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());
        System.out.println("cybertekText.isDisplayed() = " + cybertekText.isDisplayed());


    }
}
