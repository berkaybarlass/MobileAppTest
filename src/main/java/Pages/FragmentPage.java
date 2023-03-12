package pages;

import io.appium.java_client.AppiumDriver;
import org.CommonActions;
import locators.FragmentLocators;

public class FragmentPage extends CommonActions {

    public FragmentPage(AppiumDriver appiumDriver){
        super(appiumDriver);
    }

    public void selectContextMenu(){
        click(FragmentLocators.ContextMenu);
    }
    public void selectHideAndShowMenu(){
        click(FragmentLocators.HideAndShow);
    }
}
