package Pages;

import com.sun.org.apache.xpath.internal.operations.And;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.CommonActions;
import org.Locators.AndroidNativeLocators;
import org.Locators.AppPageLocators;
import org.Locators.HomePageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

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

    public void goToAppPage(){
        click(HomePageLocators.App);
    }



}
