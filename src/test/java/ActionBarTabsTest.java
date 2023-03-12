import Pages.*;
import org.Locators.TabsLocators;
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

    @Test
    public void AlertDialogs(){

        HomePage homePage = new HomePage(appiumDriver);
        PermissionsController permissionsController = new PermissionsController(appiumDriver);
        AppPage appPage = new AppPage(appiumDriver);
        ActivityPage activityPage = new ActivityPage(appiumDriver);
        AlertDialogsPage alertDialogsPage = new AlertDialogsPage(appiumDriver);
        permissionsController.defaultPermissions();
        homePage.popupOkButton();
        homePage.appNameVerify();
        homePage.goToAppPage();
        appPage.goToAlertDialogs();
        alertDialogsPage.selectListDialog();
        alertDialogsPage.selectCommand();
        alertDialogsPage.selectedCommandVerifyMessage();

    }

    @Test
    public void DeviceAdmin(){
        //Device Admin > General >Enable Admin açılmıyor testi yazılamadı !
    }

    @Test
    public void ContextMenu() throws InterruptedException {

        HomePage homePage = new HomePage(appiumDriver);
        PermissionsController permissionsController = new PermissionsController(appiumDriver);
        AppPage appPage = new AppPage(appiumDriver);
        ActivityPage activityPage = new ActivityPage(appiumDriver);
        FragmentPage fragmentPage = new FragmentPage(appiumDriver);
        ContextMenuPage contextMenuPage = new ContextMenuPage(appiumDriver);
        permissionsController.defaultPermissions();
        homePage.popupOkButton();
        homePage.appNameVerify();
        homePage.goToAppPage();
        appPage.goToFragment();
        fragmentPage.selectContextMenu();
        contextMenuPage.selectLongPressButton();
        contextMenuPage.longPressMenuControl();
    }

    @Test
    public void HideAndShow()  {

        HomePage homePage = new HomePage(appiumDriver);
        PermissionsController permissionsController = new PermissionsController(appiumDriver);
        AppPage appPage = new AppPage(appiumDriver);
        ActivityPage activityPage = new ActivityPage(appiumDriver);
        FragmentPage fragmentPage = new FragmentPage(appiumDriver);
        HideAndShowPage hideAndShowPage = new HideAndShowPage(appiumDriver);
        permissionsController.defaultPermissions();
        homePage.popupOkButton();
        homePage.appNameVerify();
        homePage.goToAppPage();
        appPage.goToFragment();
        fragmentPage.selectHideAndShowMenu();
        hideAndShowPage.controlElements();
        hideAndShowPage.showHideButtonControl();
        hideAndShowPage.showChange();
        hideAndShowPage.showHideButtonControl();
        hideAndShowPage.showButtonTurnHideVerify();
    }

    @Test
    public void IncomingMessage()  {

        HomePage homePage = new HomePage(appiumDriver);
        PermissionsController permissionsController = new PermissionsController(appiumDriver);
        AppPage appPage = new AppPage(appiumDriver);
        NotificationPage notificationPage = new NotificationPage(appiumDriver);
        IncomingMessagePage incomingMessagePage = new IncomingMessagePage(appiumDriver);
        permissionsController.defaultPermissions();
        homePage.popupOkButton();
        homePage.appNameVerify();
        homePage.goToAppPage();
        appPage.goToNotification();
        notificationPage.selectIncomingMessage();
        incomingMessagePage.showNotification();
        incomingMessagePage.openNotificationBar();
    }

    @Test
    public void Tabs()  {

        HomePage homePage = new HomePage(appiumDriver);
        PermissionsController permissionsController = new PermissionsController(appiumDriver);
        AppPage appPage = new AppPage(appiumDriver);
        ViewsPage viewsPage = new ViewsPage(appiumDriver);
        TabsPage tabsPage = new TabsPage(appiumDriver);

        permissionsController.defaultPermissions();
        homePage.popupOkButton();
        homePage.appNameVerify();
        homePage.goToViews();
        viewsPage.goToTabs();
        tabsPage.selectScrollable();
        tabsPage.lastTab();
        tabsPage.checkedSelectedTab();
    }



}
