package pages;

import io.appium.java_client.AppiumDriver;
import org.CommonActions;
import locators.ActionsBarTabsLocators;
import org.openqa.selenium.By;
import org.testng.Assert;

// android:id/action_bar
public class ActionsBarTabsPage extends CommonActions {

    public ActionsBarTabsPage(AppiumDriver appiumDriver){
        super(appiumDriver);
    }

    public void makePassiveToggleTabModeButton(){
        click(ActionsBarTabsLocators.ToggleTabModeButton);
    }

    public void passiveTitle(){
        String actionBarContainerText = appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.HorizontalScrollView")).getAttribute("text");
        if (actionBarContainerText.isEmpty()) {
            System.out.println("action bar container is empty");
        } else {
            Assert.fail("action bar container is not empty");
        }
    }

    public void addNewTab(){
        click(ActionsBarTabsLocators.AddNewTab);
    }

    public void addNewTabMultipleTimes(int count){
        for(int i=0; i<count; i++){
            addNewTab();
        }
    }

    public void lastTabCheck(){
        click(ActionsBarTabsLocators.LastTab);
        verifyTextEquals(ActionsBarTabsLocators.LastTabTextView, "Tab 2");
        click(ActionsBarTabsLocators.RemoveLastTab);
        verifyTextEquals(ActionsBarTabsLocators.LastTabTextView, "Tab 1");
    }

    public void removeAllTabs(){
        click(ActionsBarTabsLocators.RemoveAllTabs);
    }
    public void actionTabsControl(){
        String actionBarContainerText = appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout")).getAttribute("text");
        if (actionBarContainerText.isEmpty()) {
            System.out.println("action bar container is empty");
        } else {
            Assert.fail("action bar container is not empty");
        }
    }

}
