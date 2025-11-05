package Utils;

import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;

public class TakeScreenshots {
    private static final String screenshotDir = System.getProperty("user.dir") + "/Screenshots";


    public static void takesSnapShot(AndroidDriver<WebElement> driver, String screenshotName) {

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File(screenshotDir, screenshotName + System.currentTimeMillis() + ".jpeg");
        try {
            FileUtils.copyFile(src, destination);
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
}
