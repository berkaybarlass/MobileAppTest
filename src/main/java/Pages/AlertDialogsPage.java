package pages;

import io.appium.java_client.AppiumDriver;
import org.CommonActions;
import locators.AlertDialogsLocators;

public class AlertDialogsPage extends CommonActions {

    public AlertDialogsPage(AppiumDriver appiumDriver){
        super(appiumDriver);
    }

    public void selectListDialog(){
        click(AlertDialogsLocators.ListDialog);
    }

    public void selectCommand(){
        click(AlertDialogsLocators.CommondTwo);
    }

    public void selectedCommandVerifyMessage(){
        verifyTextEquals(AlertDialogsLocators.Message, "You selected: 1 , Command two");
    }
}
