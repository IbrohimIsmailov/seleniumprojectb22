package com.cybertek.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    //Creating the private constructor so this class object is not reachable from outside
    private Driver() {

    }

    //Making our "driver" instance private so it is not reachable from outside of the class
    //We make it static because we want it to run before everything else,and we will use it with static method
    private static WebDriver driver;

    //creating re-usable utility method that will return same driver instance everytime we call it
    public static WebDriver getDriver() {

        if (driver == null) {

            //We read our browser type from configuration.properties file using .getProperty method.
            String browserType = ConfigurationReader.getProperty("browser");

            // Depending on the browser type our switch statement will determine to open specific type of brwser
            switch (browserType) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.chromedriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }
        }
        //same driver instance will be returned every time we call Driver.getDriver(); method
        return driver;
    }

    // this method makes sure we have some form of driver session of driver id has
    // Either null or not null it must exist
    public static void closeDriver() {
        if(driver!= null){
            driver.quit();
            driver=null;
        }
    }


}
