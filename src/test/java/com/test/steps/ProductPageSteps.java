package com.test.steps;

import com.test.endusersteps.EndUserSteps;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

/**
 * This class defines product page steps specified in the feature file.
 * @author Ruben Markalkar
 *
 */
public class ProductPageSteps {
	
	@Steps
	EndUserSteps endUserSteps;
	
	@And("^user adds the product to the cart$")
	public void addProductToTheCart() throws Exception {
		endUserSteps.addProductToTheCart();
	}
	
	@And("^user proceeds to checkout$")
	public void proceedToCheckout() throws Exception {
		endUserSteps.proceedToCheckout();
	}

}
