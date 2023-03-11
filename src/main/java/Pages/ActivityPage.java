package Pages;

import io.appium.java_client.AppiumDriver;
import org.CommonActions;
import org.Locators.ActivityPageLocators;

public class ActivityPage extends CommonActions {

    public ActivityPage(AppiumDriver appiumDriver){
        super(appiumDriver);
    }

    public void goToCustomTitle(){
        click(ActivityPageLocators.CustomTitle);
    }
}
