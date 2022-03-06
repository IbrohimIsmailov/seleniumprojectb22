package com.cybertek.tests.day7_alerts_iframes_windows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {

    WebDriver driver;

    @BeforeClass
    public void setupClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test(priority = 1)
    public void tc1_simple_dropwon_test() {
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        WebElement option1 = simpleDropdown.getFirstSelectedOption();
        String actualOption = option1.getText();
        String expectedOption = "Please select an option";

        Assert.assertEquals(actualOption, expectedOption);
    }

    @Test(priority = 2)
    public void tc1_simple_dropdown_test2() {
        Select simpledropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        String actualOption = simpledropdown.getFirstSelectedOption().getText();
        String expectedOption = "Select a State";
        Assert.assertEquals(actualOption, expectedOption);
    }

    @Test(priority = 3)
    public void tc2_state_dropdown_test() {
        Select simpledropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        simpledropdown.selectByVisibleText("Illinois");
        simpledropdown.selectByVisibleText("Virginia");
        simpledropdown.selectByVisibleText("California");
        String actualText = simpledropdown.getFirstSelectedOption().getText();
        String expectedText = "California";
        Assert.assertEquals(actualText, expectedText);
    }


}
