package com.cybertek.pages;

import com.cybertek.Utilities.BrowserUtils;
import com.cybertek.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TelerikPage {

    public TelerikPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "draggable")
    public WebElement smallCircle;

    @FindBy(id = "droptarget")
    public WebElement bigCircle;

    @FindBy(id = "onetrust-accept-btn-handler")
    public WebElement acceptCookiesButton;

    public void dragAndDrop() {
        TelerikPage telerikPage = new TelerikPage();
        Actions actions = new Actions(Driver.getDriver());
        acceptCookiesButton.click();
        BrowserUtils.sleep(3);
        actions.dragAndDrop(telerikPage.smallCircle, telerikPage.bigCircle).perform();

    }

}
