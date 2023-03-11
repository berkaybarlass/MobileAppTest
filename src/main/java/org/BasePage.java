package org;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    AppiumDriver appiumDriver;

    public BasePage(AppiumDriver appiumDriver){
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
        appiumDriver = appiumDriver;
    }
    public void clickableForElement(MobileElement element){
        WebDriverWait wait = new WebDriverWait(appiumDriver, 50);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForVisibility(MobileElement element){
        WebDriverWait wait = new WebDriverWait(appiumDriver, 200);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void click(MobileElement element){
        clickableForElement(element);
        element.click();
    }
}
