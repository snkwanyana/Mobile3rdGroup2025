package Screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class APIDemosAnimationScreen {

    private AndroidDriver driver;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Bouncing Balls']")
    private WebElement bouncingBallsOption;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Cloning']")
    private WebElement cloningOption;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Custom Evaluator']")
    private WebElement customEvaluatorOption;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Default Layout Animations']")
    private WebElement defaultLayoutAnimationsOption;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Events']")
    private WebElement eventsOption;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Hide-Show Animations']")
    private WebElement hideShowAnimationsOption;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Layout Animations']")
    private WebElement layoutAnimationsOption;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Loading']")
    private WebElement loadingOption;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Multiple Properties']")
    private WebElement multiplePropertiesOption;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Reversing']")
    private WebElement reversingOption;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Seeking']")
    private WebElement seekingOption;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='View Flip']")
    private WebElement viewFlipOption;

    public APIDemosAnimationScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnBouncingBallsOption() {
        bouncingBallsOption.click();
    }

    public void clickOnCloningOption() {
        cloningOption.click();
    }

    public void clickOnCustomEvaluatorOption() {
        customEvaluatorOption.click();
    }

    public void clickOnDefaultLayoutAnimationsOption() {
        defaultLayoutAnimationsOption.click();
    }

    public void clickOnEventsOption() {
        eventsOption.click();
    }

    public void clickOnHideShowAnimationsOption() {
        hideShowAnimationsOption.click();
    }

    public void clickOnLayoutAnimationsOption() {
        layoutAnimationsOption.click();
    }

    public void clickOnLoadingOption() {
        loadingOption.click();
    }

    public void clickOnMultiplePropertiesOption() {
        multiplePropertiesOption.click();
    }

    public void clickOnReversingOption() {
        reversingOption.click();
    }

    public void clickOnSeekingOption() {
        seekingOption.click();
    }

    public void clickOnViewFlipOption() {
        viewFlipOption.click();
    }

}