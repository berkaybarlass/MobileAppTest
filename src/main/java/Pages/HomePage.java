package pages;

import io.appium.java_client.AppiumDriver;
import org.CommonActions;
import locators.HomePageLocators;

public class HomePage extends CommonActions {


    public HomePage(AppiumDriver appiumDriver){
        super(appiumDriver);
    }

    public void appNameVerify(){
        verifyTextEquals(HomePageLocators.AppName, "API Demos");
    }

    public void popupOkButton(){
        click(HomePageLocators.APIDemosPopupOkButton);
    }



}
