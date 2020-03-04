package com.test.endusersteps;

import com.test.pages.ContactPage;
import com.test.pages.HomePage;
import com.test.pages.ProductPage;
import com.test.pages.ShoppingCartPage;
import com.test.pages.SignInPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * This class is designed to take screenshots for every step specified.
 * 
 * @author Ruben Markalkar
 *
 */
public class EndUserSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	HomePage homePage;
	ContactPage contactPage;
	ProductPage productPage;
	ShoppingCartPage shoppingCartPage;
	SignInPage signInPage;

	@Step
	public void launchApplication() throws Exception {
		homePage.launchApplication();
	}

	@Step
	public void clickContactUs() throws Exception {
		homePage.clickContactUs();
	}

	@Step
	public void composeTheMessage(String subject, String email, String orderID, String message) {
		contactPage.selectMessageSubject(subject);
		contactPage.enterEmail(email);
		contactPage.enterOrderId(orderID);
		contactPage.enterMessage(message);
	}

	@Step
	public void sendMessage() throws Exception {
		contactPage.clickSend();
	}

	@Step
	public void verifySuccessfullSubmissionMessage(String messageSentSuccess) throws Exception {
		contactPage.verifySuccessfulSubmissionMessage(messageSentSuccess);
	}

	@Step
	public void clickSignIn() throws Exception {
		homePage.clickSignInLink();
	}

	@Step
	public void enterEmailAndCreateAccount(String email) throws Exception {
		signInPage.enterEmailAddress(email);
		signInPage.clickCreateAccount();
	}

	@Step
	public void verifyAccountCreationErrorMessage(String error) throws Exception {
		signInPage.verifyAccountCreationErrorMessage(error);
	}

	@Step
	public void searchForGivenProduct(String product) throws Exception {
		homePage.enterProductName(product);
		homePage.clickSearch();
	}

	@Step
	public void addProductToTheCart() throws Exception {
		productPage.clickAddToCart();
	}

	@Step
	public void proceedToCheckout() throws Exception {
		productPage.clickProceedToCheckout();
	}

	@Step
	public void removeProductFromTheCart(String product) throws Exception {
		shoppingCartPage.removeProductFromCart(product);
	}

	@Step
	public void verifyEmptyCartMessage(String message) throws Exception {
		shoppingCartPage.verifyCartEmptyMessage(message);
	}

	@Step
	public void selectProduct(String product) throws Exception {
		homePage.selectGivenProduct(product);
	}
}
