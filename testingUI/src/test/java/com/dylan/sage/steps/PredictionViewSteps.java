package com.dylan.sage.steps;

import com.dylan.sage.pages.SageLanding;
import com.dylan.sage.runners.SageRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class PredictionViewSteps {

    public static SageLanding landingPage = SageRunner.landing;
    public static WebDriver driver = SageRunner.driver;

    @Given("User is on the landing page")
    public void user_is_on_the_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User selects a prediction to view")
    public void user_selects_a_prediction_to_view() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Information about that prediction is displayed")
    public void information_about_that_prediction_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User is viewing a prediction")
    public void user_is_viewing_a_prediction() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User enters a prediction result")
    public void user_enters_a_prediction_result() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User presses the enter button")
    public void user_presses_the_enter_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The result is entered and the prediction is resolved")
    public void the_result_is_entered_and_the_prediction_is_resolved() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}


