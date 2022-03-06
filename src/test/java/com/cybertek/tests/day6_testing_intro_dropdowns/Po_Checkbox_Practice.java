package com.cybertek.tests.day6_testing_intro_dropdowns;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Po_Checkbox_Practice {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/checkboxes");
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));

        boolean notSelected = checkbox1.isSelected();
        if (!notSelected == true) {
            System.out.println("Checkbox 1 = Not selected By default: Passed");
        } else {
            System.out.println("It is Selected By default: Failed");
        }

        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));
        boolean selected = checkbox2.isSelected();
        if (selected == true) {
            System.out.println("Checkbox 2 = Selected by default: Passed");
        } else {
            System.out.println("Not Selected By default: Failed");
        }
        Thread.sleep(2000);
        checkbox1.click();
        Thread.sleep(2000);
        checkbox2.click();

        if (checkbox1.isSelected()) {
            System.out.println("Checkbox 1 is selected.Verification Passed");
        } else {
            System.out.println("Checkbox 2 is not selected.Verification Failed");
        }

        if (!checkbox2.isSelected()) {
            System.out.println("Checkbox 2 is not selected:Verification Passed");
        } else {
            System.out.println("Checkbox 1 is selected.Verification Failed");
        }

        driver.close();
    }
}
