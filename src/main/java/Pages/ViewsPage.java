package Pages;

import com.sun.org.apache.xpath.internal.operations.And;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import javafx.scene.control.Tab;
import org.CommonActions;
import org.Locators.ViewsLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

public class ViewsPage extends CommonActions {
    public ViewsPage(AppiumDriver appiumDriver){
        super(appiumDriver);
    }
    public void goToTabs(){
        MobileElement element = (MobileElement) appiumDriver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))"
                        + ".scrollToEnd(1).scrollIntoView(new UiSelector().text(\"Tabs\"))"));
        click(ViewsLocators.Tabs);
    }

}
