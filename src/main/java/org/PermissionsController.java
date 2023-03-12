package org;

import io.appium.java_client.AppiumDriver;
import locators.AndroidNativeLocators;

public class PermissionsController extends CommonActions {

    public PermissionsController(AppiumDriver appiumDriver){
        super(appiumDriver);
    }

    public  void defaultPermissions(){
        click(AndroidNativeLocators.Continue);
    }

}
