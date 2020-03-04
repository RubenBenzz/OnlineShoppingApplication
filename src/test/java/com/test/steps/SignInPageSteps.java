package com.test.steps;

import com.test.endusersteps.EndUserSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * This class defines sign in page steps specified in the feature file.
 * 
 * @author Ruben Markalkar
 *
 */
public class SignInPageSteps {

	@Steps
	EndUserSteps endUserSteps;

	@When("^user enters (.*) and creates account$")
	public void enterEmailAndCreateAccount(String email) throws Exception {
		endUserSteps.enterEmailAndCreateAccount(email);
	}

	@Then("^user sees account creation (.*)$")
	public void createAccountErrorMessageDisplayed(String error) throws Exception {
		endUserSteps.verifyAccountCreationErrorMessage(error);
	}

}
