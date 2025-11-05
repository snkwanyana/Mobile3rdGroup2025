package Utils;

import Screens.APIDemosAnimationScreen;
import Screens.APIDemosScreen1;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class MobileBase {

    public AndroidDriver<WebElement> driver;
    public APIDemosScreen1 apiDemosScreen1;
    public APIDemosAnimationScreen apiDemosAnimationScreen;

    public void initDriver() {
        String appPath = System.getProperty("appPath", System.getProperty("user.dir") + "/src/main/ApiDemos-debug.apk");
        AppiumDriverFactory.getInstanceOfAppiumFactory(appPath);
        this.driver = (AndroidDriver<WebElement>) AppiumDriverFactory.getDriver();
        apiDemosScreen1 = new APIDemosScreen1(driver);
        apiDemosAnimationScreen = new APIDemosAnimationScreen(driver);
        driver.resetApp();
    }


    public void addScreenshot(Scenario scenario) {
//        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "image");
//        }

    }
}
