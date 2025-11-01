package Utils;

import com.sun.source.tree.TryTree;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumDriverFactory {
    private static AppiumDriver driver;
    public static AppiumDriverFactory instanceOfAppiumFactory;

    public AppiumDriverFactory(String appPath) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("app", appPath);
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("appPackage", appPath);
        capabilities.setCapability("appium:appActivity", "com.google.android.apps.chrome.Main");
//        capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

        capabilities.setCapability("noReset", true);

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static AppiumDriverFactory getInstanceOfAppiumFactory(String appPath) {
        if (instanceOfAppiumFactory == null)
            instanceOfAppiumFactory = new AppiumDriverFactory(appPath);
        return instanceOfAppiumFactory;
    }

    public static AndroidDriver getDriver() {
        return (AndroidDriver) driver;
    }

}
