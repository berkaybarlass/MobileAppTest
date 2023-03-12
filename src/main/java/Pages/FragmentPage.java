package Pages;

import io.appium.java_client.AppiumDriver;
import org.CommonActions;
import org.Locators.FragmentLocators;

public class FragmentPage extends CommonActions {

    public FragmentPage(AppiumDriver appiumDriver){
        super(appiumDriver);
    }

    public void selectContextMenu(){
        click(FragmentLocators.ContextMenu);
    }

}
