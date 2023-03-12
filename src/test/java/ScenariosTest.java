import org.CommonActions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;

public class ScenariosTest extends BaseTest {
    HashMap<String, Boolean> setupConfig;

    public ScenariosTest(){
        setupConfig = new HashMap<>();
        setupConfig.put("noReset", true);
    }

    @Test
    public void ActionBarTabs() throws MalformedURLException {
        setupConfig.put("noReset", false);
        AndroidSetup(setupConfig);
        homePage.goToSelectedPage("App");
        appPage.goToSelectedPage("Action Bar");
        actionsBarPage.goToSelectedPage("Action Bar Tabs");
        actionsBarTabsPage.makePassiveToggleTabModeButton();
        actionsBarTabsPage.passiveTitle();
        actionsBarTabsPage.addNewTabMultipleTimes(3);
        actionsBarTabsPage.lastTabCheck();
        actionsBarTabsPage.removeAllTabs();
        actionsBarTabsPage.actionTabsControl();
    }

    @Test
    public void Activity() throws MalformedURLException {
        AndroidSetup(setupConfig);
        homePage.goToSelectedPage("App");
        appPage.goToSelectedPage("Activity");
        activityPage.goToSelectedPage("Custom Title");
        customTitlePage.navBarTextControl("all"); //Works with one of the "all", "right", "left" position values. Cannot be blank
        customTitlePage.textBoxTextControl("left");
        customTitlePage.textBoxTextControl("right");
        customTitlePage.changeTextBoxValue("left", "Berkay");
        customTitlePage.changeTextBoxValue("right", "Barlas");
    }

    @Test
    public void AlertDialogs() throws MalformedURLException {
        AndroidSetup(setupConfig);
        homePage.goToSelectedPage("App");
        appPage.goToSelectedPage("Alert Dialogs");
        alertDialogsPage.selectListDialog();
        alertDialogsPage.selectCommand();
        alertDialogsPage.selectedCommandVerifyMessage();
    }

    @Test
    public void DeviceAdmin(){
        //Device Admin > General >Enable Admin açılmıyor testi yazılamadı !
    }

    @Test
    public void ContextMenu() throws InterruptedException, MalformedURLException {
        AndroidSetup(setupConfig);
        homePage.goToSelectedPage("App");
        appPage.goToSelectedPage("Fragment");
        fragmentPage.selectContextMenu();
        contextMenuPage.selectLongPressButton();
        contextMenuPage.longPressMenuControl();
    }

    @Test
    public void HideAndShow() throws MalformedURLException {
        AndroidSetup(setupConfig);
        homePage.goToSelectedPage("App");
        appPage.goToSelectedPage("Fragment");
        fragmentPage.selectHideAndShowMenu();
        hideAndShowPage.controlElements();
        hideAndShowPage.showHideButtonControl();
        hideAndShowPage.showChange();
        hideAndShowPage.showHideButtonControl();
        hideAndShowPage.showButtonTurnHideVerify();
    }

    @Test
    public void IncomingMessage() throws MalformedURLException {
        AndroidSetup(setupConfig);
        homePage.goToSelectedPage("App");
        appPage.goToSelectedPage("Notification");
        notificationPage.selectIncomingMessage();
        incomingMessagePage.showNotification();
    }

    @Test
    public void Tabs() throws MalformedURLException {
        setupConfig.put("noReset", false);
        AndroidSetup(setupConfig);
        homePage.goToSelectedPage("Views");
        viewsPage.scrollToTabsAndChoose();
        tabsPage.selectScrollableMenu();
        tabsPage.scrollToLastTab();
        tabsPage.checkedSelectedTab();
    }



}
