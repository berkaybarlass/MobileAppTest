package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.CommonActions;
import locators.TabsLocators;
import org.openqa.selenium.By;


public class TabsPage extends CommonActions {

    public TabsPage(AppiumDriver appiumDriver){
        super(appiumDriver);
    }

    public void selectScrollableMenu(){
        appiumDriver.findElement(By.xpath("//*[@text='5. Scrollable']")).click();
    }

    public void scrollToLastTab() {
        MobileElement element = (MobileElement) appiumDriver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0)).setAsHorizontalList().scrollToEnd(1).scrollIntoView(new UiSelector().text(\"TAB 30\"))"));
        click(TabsLocators.tab5);
    }

    public void checkedSelectedTab(){
        verifyTextEquals(TabsLocators.SelectedTabShowText, "Content for tab with tag Tab 30");
    }

}
