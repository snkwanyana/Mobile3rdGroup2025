package Stepsdefs;

import Utils.MobileBase;
import io.cucumber.java.en.*;

public class StepDefinition extends MobileBase {

    @Given("I am on the animation test page")
    public void i_am_on_the_animation_test_page() {
        initDriver();
        apiDemosScreen1.clickOnAnimationOption();
    }
    @When("I click the Event option")
    public void i_click_the_event_option() {

    }
    @Then("the animation should start playing")
    public void the_animation_should_start_playing() {

    }

}
