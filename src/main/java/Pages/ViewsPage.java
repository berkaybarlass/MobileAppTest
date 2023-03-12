package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.CommonActions;
import locators.ViewsLocators;

public class ViewsPage extends CommonActions {
    public ViewsPage(AppiumDriver appiumDriver){
        super(appiumDriver);
    }
    public void scrollToTabsAndChoose(){
        MobileElement element = (MobileElement) appiumDriver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))"
                        + ".scrollToEnd(1).scrollIntoView(new UiSelector().text(\"Tabs\"))"));
        click(ViewsLocators.Tabs);
    }

}
