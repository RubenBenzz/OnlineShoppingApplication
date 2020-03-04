package com.test.steps;

import com.test.endusersteps.EndUserSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * This class defines contact page steps specified in the feature file.
 * 
 * @author Ruben Markalkar
 *
 */
public class ContactPageSteps {

	@Steps
	EndUserSteps endUserSteps;

	@And("^user composes the message with (.*),(.*),(.*),(.*)$")
	public void composeTheMessage(String subject, String email, String orderID, String message) {
		endUserSteps.composeTheMessage(subject, email, orderID, message);
	}

	@When("^user sends the message$")
	public void sendMessage() throws Exception {
		endUserSteps.sendMessage();
	}

	@Then("^user sees a successful message (.*)$")
	public void messageSuccessfullySent(String messageSentSuccess) throws Exception {
		endUserSteps.verifySuccessfullSubmissionMessage(messageSentSuccess);
	}

}
