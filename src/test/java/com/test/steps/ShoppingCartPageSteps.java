package com.test.steps;

import com.test.endusersteps.EndUserSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * This class defines shopping cart page steps specified in the feature file.
 * 
 * @author Ruben Markalkar
 *
 */
public class ShoppingCartPageSteps {

	@Steps
	EndUserSteps endUserSteps;

	@When("^user removes given (.*) from the cart$")
	public void removeProductFromTheCart(String product) throws Exception {
		endUserSteps.removeProductFromTheCart(product);
	}

	@Then("^user sees an empty cart (.*)$")
	public void verifyEmptyCartMessage(String message) throws Exception {
		endUserSteps.verifyEmptyCartMessage(message);
	}

}
