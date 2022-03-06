package com.cybertek.tests.day6_testing_intro_dropdowns;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P03_Apple_Task {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.apple.com");
        List<WebElement> headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));
        System.out.println("headerLinks.size() = " + headerLinks.size());
        for (int eachLink = 2; eachLink < headerLinks.size() - 2; eachLink++) {
            System.out.println(headerLinks.get(eachLink).getText());
            Thread.sleep(2000);
            headerLinks.get(eachLink).click();
            Thread.sleep(2000);
            driver.navigate().back();
            headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));
            List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
            System.out.println("current number of links in the page: = " + allLinks.size());

            int linkWthNoText = 0;
            int linkWithText = 0;
            for (WebElement each : allLinks) {
                if (each.getText().isEmpty()) {
                    linkWthNoText++;

                } else {
                    linkWithText++;

                }

            }
            System.out.println("Link with text = " + linkWthNoText);

            System.out.println("linkWithText = " + linkWithText);
        }

    }
}
