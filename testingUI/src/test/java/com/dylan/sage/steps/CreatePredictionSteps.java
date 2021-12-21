package com.dylan.sage.steps;

import com.dylan.sage.pages.CustomPrediction;
import com.dylan.sage.runners.SageRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class CreatePredictionSteps {

    public static CustomPrediction customPredictionPage = SageRunner.customPredictionPage;
    public static WebDriver driver = SageRunner.driver;

    @Given("User is on the landing view")
    public void user_is_on_the_landing_view() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User navigates to the create a prediction view")
    public void user_navigates_to_the_create_a_prediction_view() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Enters in prediction information")
    public void enters_in_prediction_information() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Presses the Predict button")
    public void presses_the_predict_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("A popup appears saying your prediction has been created")
    public void a_popup_appears_saying_your_prediction_has_been_created() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User is back at the landing page")
    public void user_is_back_at_the_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Created prediction is displayed on landing page")
    public void created_prediction_is_displayed_on_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
