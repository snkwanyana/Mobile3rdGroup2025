import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Basic {

    private AndroidDriver driver;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("platformVersion", "11.0"); // Replace with your emulator's version
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app",System.getProperty("user.dir") + "/src/main/ApiDemos-debug.apk"); // Replace with the path to your APK file
        capabilities.setCapability("automationName", "UiAutomator2");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), capabilities);
    }

    @Test
    public void launchApp() throws InterruptedException {

        //android.widget.TextView[@content-desc="App"]
        Thread.sleep(2000); // Wait for 2 seconds to ensure the app is fully loaded
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Accessibility']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Custom View']")).isDisplayed();

        System.out.println(System.getProperty("user.dir") + "/src/main/ApiDemos-debug.apk");
        System.out.println("App launched successfully!");
    }

//    @AfterClass
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}