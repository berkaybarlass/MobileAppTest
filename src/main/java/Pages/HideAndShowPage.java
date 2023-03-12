package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.CommonActions;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.List;

public class HideAndShowPage extends CommonActions {

    public HideAndShowPage(AppiumDriver appiumDriver){
        super(appiumDriver);
    }

    public void controlElements() {
        List<MobileElement> hideButtons = appiumDriver.findElements(By.xpath("//android.widget.Button[contains(@resource-id, 'hide')]"));
        List<MobileElement> textBoxes = appiumDriver.findElements(By.id("com.hmh.api:id/saved"));

        if (hideButtons.size() ==2 && textBoxes.size()== 2) {
            System.out.println("Two" + hideButtons + " and " + textBoxes + "found" );
        } else {
            Assert.fail("Two hide buttons && textboxes not found.");
        }
    }

    public void showChange(){
        MobileElement showButton = (MobileElement) appiumDriver.findElement(By.id("com.hmh.api:id/frag2hide"));
        String buttonText = showButton.getText();
        if (buttonText.equals("Show")) {
            System.out.println("The hide button successfully changed to show.");
        } else {
            System.out.println("Error: The hide button did not change to show.");
        }
    }

    public void showButtonTurnHideVerify(){
        MobileElement fragment2 = (MobileElement) appiumDriver.findElement(By.id("com.hmh.api:id/msg"));
        String fragment2Text = fragment2.getText();

        if (fragment2Text.isEmpty()) {
            System.out.println("Error: Fragment 1 text is empty.");
        } else {
            System.out.println("Fragment 1 text is: " + fragment2Text);
        }
    }

    public void showHideButtonControl() {
        MobileElement hideButton = (MobileElement) appiumDriver.findElement(By.id("com.hmh.api:id/frag2hide"));
        String buttonText = hideButton.getText();

        if (buttonText.equals("Hide")) {
            hideButton.click();
            String newButtonText = hideButton.getText();

            if (newButtonText.equals("Show")) {
                System.out.println("The Hide button successfully changed to Show.");
            } else {
               Assert.fail("Error: The Hide button did not change to Show.");
            }
        } else if (buttonText.equals("Show")) {
            hideButton.click();
            String newButtonText = hideButton.getText();

            if (newButtonText.equals("Hide")) {
                System.out.println("The Show button successfully changed to Hide.");
            } else {
                Assert.fail("Error: The Show button did not change to Hide.");
            }
        } else {
            Assert.fail("Error: Button text is neither 'Show' nor 'Hide'.");
        }
    }

}
