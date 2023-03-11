package Pages;

import io.appium.java_client.AppiumDriver;
import org.CommonActions;
import org.Locators.CustomTitleLocators;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;

public class CustomTitlePage extends CommonActions {

    public CustomTitlePage(AppiumDriver appiumDriver){
        super(appiumDriver);
    }

    public void navBarTextControl(@NotNull String position) {
        switch (position) {
            case "all":
                verifyTextEquals(CustomTitleLocators.LeftNavBar, "Left is best");
                verifyTextEquals(CustomTitleLocators.RightNavBar, "Right is always right");
                System.out.println("Right and left navbar is checked.");
                break;
            case "left":
                verifyTextEquals(CustomTitleLocators.LeftNavBar, "Left is best");
                System.out.println("Left navbar is checked.");
                break;
            case "right":
                verifyTextEquals(CustomTitleLocators.RightNavBar, "Right is always right");
                System.out.println("Right navbar is checked.");
                break;
            default:
                System.out.println("Invalid position parameter");
                break;
        }
    }
    public void textBoxTextControl(@NotNull String position) {
        if (position.equals("left")) {
            verifyTextEquals(CustomTitleLocators.LeftTextBox, "Left is best");
        } else if (position.equals("right")) {
            verifyTextEquals(CustomTitleLocators.RightTextBox, "Right is always right");
        } else {
            System.out.println("Invalid position parameter");
        }
    }

    public void changeTextBoxValue(String textBox, String newValue) {
        By textBoxLocator;
        By changeButtonLocator;
        By navBarLocator;

        switch (textBox) {
            case "left":
                textBoxLocator = CustomTitleLocators.LeftTextBox;
                changeButtonLocator = CustomTitleLocators.LeftChangeButton;
                navBarLocator = CustomTitleLocators.LeftNavBar;
                break;
            case "right":
                textBoxLocator = CustomTitleLocators.RightTextBox;
                changeButtonLocator = CustomTitleLocators.RightChangeButton;
                navBarLocator = CustomTitleLocators.RightNavBar;
                break;
            default:
                throw new IllegalArgumentException("Invalid textbox value: " + textBox);
        }

        click(textBoxLocator);
        clear(textBoxLocator);
        fillText(textBoxLocator, newValue);
        click(changeButtonLocator);
        verifyTextEquals(navBarLocator, newValue);
    }



}
