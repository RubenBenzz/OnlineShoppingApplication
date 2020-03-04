package com.test.steps;

import com.test.endusersteps.EndUserSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

/**
 * This class defines home page steps specified in the feature file.
 * 
 * @author Ruben Markalkar
 *
 */
public class HomePageSteps {

	@Steps
	EndUserSteps endUserSteps;

	@Given("^launch the shopping application$")
	public void launchTheApplication() throws Exception {
		endUserSteps.launchApplication();
	}

	@And("^user navigates to Contact us page$")
	public void clickOnContactUs() throws Exception {
		endUserSteps.clickContactUs();
	}

	@And("^user navigates to Sign in page$")
	public void clickOnSignIn() throws Exception {
		endUserSteps.clickSignIn();
	}

	@And("^user searches for a given (.*)$")
	public void searchForGivenProduct(String product) throws Exception {
		endUserSteps.searchForGivenProduct(product);
	}

	@And("^user selects the (.*)$")
	public void selectProduct(String product) throws Exception {
		endUserSteps.selectProduct(product);
	}

}
