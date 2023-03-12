package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.CommonActions;
import org.Locators.IncomingMessageLocators;
import org.openqa.selenium.By;

import java.net.URL;
import java.util.List;

public class IncomingMessagePage extends CommonActions {

    public IncomingMessagePage(AppiumDriver appiumDriver){
        super(appiumDriver);
    }

    public void showNotification(){
        click(IncomingMessageLocators.ShowNotificationButton);
    }

    public void openNotificationBar(){
        ((AndroidDriver) appiumDriver).openNotifications();
        List<MobileElement> notifications = appiumDriver.findElements(By.id("android:id/notification_main_column"));
        notifications.get(0).click();

    }

}
