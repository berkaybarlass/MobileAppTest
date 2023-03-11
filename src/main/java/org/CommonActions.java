package org;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CommonActions  {
    public AppiumDriver appiumDriver;

    //public CommonActions(AppiumDriver appiumDriver){
        //PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
        //this.appiumDriver = appiumDriver;
    //}

    public CommonActions(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;

    }

    public void verifyTextEquals(By locator, String expectedText) {
        String actualText = appiumDriver.findElement(locator).getText();
        Assert.assertEquals(actualText, expectedText);
    }



    public void clickableForElement(MobileElement element){
        WebDriverWait wait = new WebDriverWait(appiumDriver, 50);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void click(By locator){
        appiumDriver.findElement(locator).click();
    }

    public void clear(By locator){
        appiumDriver.findElement(locator).clear();
    }

    public void fillText(By locator, String value){
        appiumDriver.findElement(locator).sendKeys(value);
    }





}
