package Utils;

import com.sun.source.tree.TryTree;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDriverFactory {
    private AndroidDriver driver;
    public static AppiumDriverFactory instanceOfAppiumFactory;

    public AppiumDriverFactory(String appPath) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", appPath);
        capabilities.setCapability("automationName", "UiAutomator2");

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static AppiumDriverFactory getInstanceOfAppiumFactory(String appPath) {
        if (instanceOfAppiumFactory == null)
            instanceOfAppiumFactory = new AppiumDriverFactory(appPath);
        return instanceOfAppiumFactory;
    }

    public AndroidDriver getDriver() {
        return driver;
    }

}
