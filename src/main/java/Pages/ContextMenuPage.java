package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.CommonActions;
import org.openqa.selenium.By;
import org.testng.Assert;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class ContextMenuPage extends CommonActions {

    public ContextMenuPage(AppiumDriver appiumDriver){
        super(appiumDriver);
    }

    public void selectLongPressButton(){
        TouchAction action = new TouchAction(appiumDriver);
        MobileElement element = (MobileElement) appiumDriver.findElement(By.id("com.hmh.api:id/long_press"));
        action.longPress(longPressOptions().withElement(element(element))).release().perform();
    }

    public void longPressMenuControl(){
        MobileElement menuA = (MobileElement) appiumDriver.findElement(By.xpath("//*[@text='Menu A']"));
        MobileElement menuB = (MobileElement) appiumDriver.findElement(By.xpath("//*[@text='Menu B']"));

        if (menuA.isDisplayed() && menuB.isDisplayed()) {
            String menuAText = menuA.getText();
            String menuBText = menuB.getText();

            if (menuAText.equals("Menu A") && menuBText.equals("Menu B")) {
                System.out.println("Menu items are displayed correctly.");
            } else {
                Assert.fail("Menu items are not displayed correctly.");
            }
        } else {
            Assert.fail("Menu items are not displayed.");
        }
    }
}
