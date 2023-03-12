package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.CommonActions;
import org.Locators.TabsLocators;
import org.openqa.selenium.By;

import java.util.List;

public class TabsPage extends CommonActions {

    public TabsPage(AppiumDriver appiumDriver){
        super(appiumDriver);
    }

    public void selectScrollable(){
        appiumDriver.findElement(By.xpath("//*[@text='5. Scrollable']")).click();
    }

    public void lastTab() {
        MobileElement element = (MobileElement) appiumDriver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).setAsVerticalList())"
                        + ".scrollToEnd(1).scrollIntoView(new UiSelector().resourceIdMatches(\".*id/tabhost\").childSelector(new UiSelector().className(\"android.widget.TabWidget\")).childSelector(new UiSelector().className(\"android.widget.LinearLayout\").index(5)).childSelector(new UiSelector().className(\"android.widget.TextView\").text(\"TAB 30\")))"));


        element.click();
    }

    }
