import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public AppiumDriver appiumDriver;
    public AndroidDriver<MobileElement> androidDriver;

    @BeforeMethod
    public void AndroidSetup() throws MalformedURLException {
        DesiredCapabilities androidCaps = new DesiredCapabilities();
        androidCaps.setCapability("udid","emulator-5554");
        androidCaps.setCapability("platformName", "Android");
        androidCaps.setCapability("appPackage", "com.hmh.api");
        androidCaps.setCapability("appActivity", ".ApiDemos");
        appiumDriver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), androidCaps);
        appiumDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }


    @AfterMethod
    public void TearDown(){
        appiumDriver.quit();
        System.out.println("Test is finished");
    }
}
