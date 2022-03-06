package com.cybertek.tests.day4_css_selector_xpath;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P6_xpath_MultipleButtons {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        driver.manage().window().maximize();

        WebElement Button1 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        Button1.click();
        WebElement button1Text = driver.findElement(By.xpath("//p[.='Clicked on button one!']"));
        String actualbuttonText = button1Text.getText();
        String expectedText = "Clicked on button one!";

        if (actualbuttonText.equals(expectedText)) {
            System.out.println("They both have the same text :)");
        } else {
            System.out.println("They do not have the same text :(");
        }

        driver.close();
    }
}
