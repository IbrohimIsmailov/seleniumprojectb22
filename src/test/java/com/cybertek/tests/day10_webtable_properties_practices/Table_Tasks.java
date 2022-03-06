package com.cybertek.tests.day10_webtable_properties_practices;

import com.cybertek.Utilities.ConfigurationReader;
import com.cybertek.Utilities.TableUtils;
import com.cybertek.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Table_Tasks extends TestBase {


    @Test
    public void test1() {
        String url = ConfigurationReader.getProperty("dataTablesUrl");
        driver.get(url);

        WebElement timsDueAmountCell = driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']/../td[4]"));
        System.out.println("timsDueAmountCell = " + timsDueAmountCell.getText());
        String actualTimREsult = timsDueAmountCell.getText();
        String expectedResult = "$50.00";
        Assert.assertEquals(actualTimREsult, expectedResult);

    }

    @Test
    public void test4() {

        TableUtils.verifyOrder(driver,"Tim");

    }
}
