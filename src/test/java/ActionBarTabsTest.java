import Pages.*;
import org.testng.annotations.Test;

public class ActionBarTabsTest extends BaseTest {


    @Test
    public void ActionBarTabs(){

        HomePage homePage = new HomePage(appiumDriver);
        PermissionsController permissionsController = new PermissionsController(appiumDriver);
        AppPage appPage = new AppPage(appiumDriver);
        ActionsBarPage actionsBarPage = new ActionsBarPage(appiumDriver);
        ActionsBarTabsPage actionsBarTabsPage = new ActionsBarTabsPage(appiumDriver);

        permissionsController.defaultPermissions();
        homePage.popupOkButton();
        homePage.appNameVerify();
        homePage.goToAppPage();
        appPage.goToActionsBar();
        actionsBarPage.goToActionBarTabs();
        actionsBarTabsPage.makePassiveToggleTabModeButton();
        actionsBarTabsPage.passiveTitle();
        actionsBarTabsPage.addNewTabMultipleTimes(3);
        actionsBarTabsPage.lastTabCheck();
        actionsBarTabsPage.removeAllTabs();
        actionsBarTabsPage.actionTabsControl();

    }

    @Test
    public void Activity(){

        HomePage homePage = new HomePage(appiumDriver);
        PermissionsController permissionsController = new PermissionsController(appiumDriver);
        AppPage appPage = new AppPage(appiumDriver);
        ActivityPage activityPage = new ActivityPage(appiumDriver);
        CustomTitlePage customTitlePage = new CustomTitlePage(appiumDriver);
        permissionsController.defaultPermissions();
        homePage.popupOkButton();
        homePage.appNameVerify();
        homePage.goToAppPage();
        appPage.goToActivity();
        activityPage.goToCustomTitle();
        customTitlePage.navBarTextControl("all"); //"all", "right", "left" positon değelerinden birisi ile çalışır. Boş bırakılamaz
        customTitlePage.textBoxTextControl("left");
        customTitlePage.textBoxTextControl("right");
        customTitlePage.changeTextBoxValue("left", "Berkay");
        customTitlePage.changeTextBoxValue("right", "Barlas");

    }


}
