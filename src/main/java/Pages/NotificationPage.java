package pages;

import io.appium.java_client.AppiumDriver;
import org.CommonActions;
import locators.NotificationLocators;

public class NotificationPage extends CommonActions {

    public NotificationPage(AppiumDriver appiumDriver){
        super(appiumDriver);
    }

    public void selectIncomingMessage(){
        click(NotificationLocators.IncomingMessage);
    }
}
