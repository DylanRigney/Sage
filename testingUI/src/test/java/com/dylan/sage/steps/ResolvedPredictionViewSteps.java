package com.dylan.sage.steps;

import com.dylan.sage.pages.SageResolved;
import com.dylan.sage.runners.SageRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class ResolvedPredictionViewSteps {

    public static SageResolved resolvedPredictionPage = SageRunner.resolved;
    public static WebDriver driver = SageRunner.driver;

    @Given("User is at the Resolved Prediction View")
    public void user_is_at_the_resolved_prediction_view() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User selects a resolved prediction")
    public void user_selects_a_resolved_prediction() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Information about that resolved prediction is displayed")
    public void information_about_that_resolved_prediction_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
