import pages.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.PermissionsController;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public AppiumDriver appiumDriver;
    public AndroidDriver<MobileElement> androidDriver;
    protected HomePage homePage;
    protected PermissionsController permissionsController;
    protected AppPage appPage;
    protected ActivityPage activityPage;
    protected FragmentPage fragmentPage;
    protected CustomTitlePage customTitlePage;
    protected AlertDialogsPage alertDialogsPage;
    protected ContextMenuPage contextMenuPage;
    protected HideAndShowPage hideAndShowPage;
    protected NotificationPage notificationPage;
    protected IncomingMessagePage incomingMessagePage;
    protected ViewsPage viewsPage;
    protected TabsPage tabsPage;

    protected ActionsBarTabsPage actionsBarTabsPage;
    protected ActionsBarPage actionsBarPage;

    public void AndroidSetup(HashMap<String, Boolean> setupConfig) throws MalformedURLException {
        DesiredCapabilities androidCaps = new DesiredCapabilities();
        androidCaps.setCapability("udid","emulator-5554");
        androidCaps.setCapability("platformName", "Android");
        androidCaps.setCapability("appPackage", "com.hmh.api");
        androidCaps.setCapability("appActivity", ".ApiDemos");
        androidCaps.setCapability("noReset", setupConfig.get("noReset"));
        appiumDriver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), androidCaps);
        appiumDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        setupPages();
        if (setupConfig.get("noReset")== false){
            permissionsController.defaultPermissions();
            homePage.popupOkButton();
            homePage.appNameVerify();
        }
    }


    @AfterMethod
    public void TearDown(){
       appiumDriver.quit();
       System.out.println("Test is finished");
    }

    public void setupPages(){
        homePage = new HomePage(appiumDriver);
        permissionsController = new PermissionsController(appiumDriver);
        appPage = new AppPage(appiumDriver);
        activityPage = new ActivityPage(appiumDriver);
        fragmentPage = new FragmentPage(appiumDriver);
        actionsBarTabsPage = new ActionsBarTabsPage(appiumDriver);
        customTitlePage = new CustomTitlePage(appiumDriver);
        alertDialogsPage = new AlertDialogsPage(appiumDriver);
        contextMenuPage = new ContextMenuPage(appiumDriver);
        hideAndShowPage = new HideAndShowPage(appiumDriver);
        notificationPage = new NotificationPage(appiumDriver);
        incomingMessagePage = new IncomingMessagePage(appiumDriver);
        viewsPage = new ViewsPage(appiumDriver);
        tabsPage = new TabsPage(appiumDriver);
        actionsBarPage = new ActionsBarPage(appiumDriver);

    }
}
