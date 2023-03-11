package Pages;

import io.appium.java_client.AppiumDriver;
import org.CommonActions;
import org.Locators.ActionsBarLocators;

public class ActionsBarPage extends CommonActions {

    public ActionsBarPage(AppiumDriver appiumDriver){
        super(appiumDriver);
    }

    public void goToActionBarTabs(){
        click(ActionsBarLocators.ActionBarTabs);
    }
}
