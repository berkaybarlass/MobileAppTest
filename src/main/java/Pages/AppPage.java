package Pages;

import io.appium.java_client.AppiumDriver;
import org.CommonActions;
import org.Locators.AppPageLocators;

public class AppPage extends CommonActions {

    public AppPage(AppiumDriver appiumDriver){
        super(appiumDriver);
    }

    public void goToActionsBar(){
        click(AppPageLocators.ActionsBar);
    }

    public void goToActivity(){
        click(AppPageLocators.Activity);
    }
}
