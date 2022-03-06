package com.cybertek.tests.day13_actions_pom_design;

import com.cybertek.Utilities.Driver;
import com.cybertek.pages.LibraryLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageObjectModelPractices {

    @Test
    public void negative_login_to_library_test() {

        Driver.getDriver().get("https://library2.cybertekschool.com/login.html");

        LibraryLoginPage loginPage = new LibraryLoginPage();
        loginPage.inputemail.sendKeys("ibroh@im1234.com");
        loginPage.inputPassword.sendKeys("ismailov1234");
        loginPage.signInButton.click();
        Assert.assertTrue(loginPage.incorrectEmailORPasswordError.isDisplayed(), "Failed!!!");


    }


}
