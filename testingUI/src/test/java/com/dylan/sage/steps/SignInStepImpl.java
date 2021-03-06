package com.dylan.sage.steps;

import com.dylan.sage.pages.SageSignIn;
import com.dylan.sage.runners.SageRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class SignInStepImpl {

    public static SageSignIn sageSignIn = SageRunner.signIn;
    public static WebDriver driver = SageRunner.driver;

    @Given("User is on the sign in page")
    public void user_is_on_the_sign_in_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User enters invalid login information")
    public void user_enters_invalid_login_information() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User types the correct username")
    public void user_types_the_correct_username() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User types in the correct password")
    public void user_types_in_the_correct_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User presses sign in")
    public void user_presses_sign_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("An error message is displayed")
    public void an_error_message_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User has successfully logged in")
    public void user_has_successfully_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
