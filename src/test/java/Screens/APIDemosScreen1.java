package Screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class APIDemosScreen1 {

    private AndroidDriver driver;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Accessibility']")
    private WebElement accessibilityOption;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Animation']")
    private WebElement animationOption;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='App']")
    private WebElement appOption;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Content']")
    private WebElement contentOption;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Graphics']")
    private WebElement graphicsOption;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Media']")
    private WebElement mediaOption;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='NFC']")
    private WebElement nfcOption;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='OS']")
    private WebElement osOption;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Preference']")
    private WebElement preferenceOption;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Text']")
    private WebElement textOption;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Views']")
    private WebElement viewsOption;

    public APIDemosScreen1(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnAccessibilityOption() {
        accessibilityOption.click();
    }

    public void clickOnAnimationOption() {
        animationOption.click();
    }

    public void clickOnAppOption() {
        appOption.click();
    }

    public void clickOnContentOption() {
        contentOption.click();
    }

    public void clickOnGraphicsOption() {
        graphicsOption.click();
    }

    public void clickOnMediaOption() {
        mediaOption.click();
    }

    public void clickOnNfcOption() {
        nfcOption.click();
    }

    public void clickOnOsOption() {
        osOption.click();
    }

    public void clickOnPreferenceOption() {
        preferenceOption.click();
    }

    public void clickOnTextOption() {
        textOption.click();
    }

    public void clickOnViewsOption() {
        viewsOption.click();
    }
}
