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

    public AppiumDriverFactory(String appPath,String appActivity) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("appPackage", appPath);
//        capabilities.setCapability("appPackage", "com.android.chrome");
//        capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        capabilities.setCapability("appActivity", appActivity);

        capabilities.setCapability("noReset", true);

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static AppiumDriverFactory getInstanceOfAppiumFactory(String appPath,String appActivity) {
        if (instanceOfAppiumFactory == null)
            instanceOfAppiumFactory = new AppiumDriverFactory(appPath,appActivity);
        return instanceOfAppiumFactory;
    }

    public static AndroidDriver getDriver() {
        return (AndroidDriver) driver;
    }

}
