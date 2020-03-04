package com.test.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

/**
 * This class contains all locators and methods of Sign In page.
 * 
 * @author Ruben Markalkar.
 *
 */
public class SignInPage extends PageObject {

	public SignInPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='email_create']")
	private WebElement emailAddressTextbox;

	@FindBy(xpath = "//button[@id='SubmitCreate']")
	private WebElement createAccountButton;

	@FindBy(xpath = "//div[@id='create_account_error']/ol/li")
	private WebElement accountCreationErrorMessage;

	/**
	 * Enters email id for account creation.
	 * 
	 * @param email
	 * @throws Exception
	 */
	public void enterEmailAddress(String email) throws Exception {
		emailAddressTextbox.sendKeys(email);
	}

	/**
	 * Clicks account creation button.
	 * 
	 * @throws Exception
	 */
	public void clickCreateAccount() throws Exception {
		createAccountButton.click();
	}

	/**
	 * Verifies account creation error message.
	 * 
	 * @throws Exception
	 */
	public void verifyAccountCreationErrorMessage(String message) throws Exception {
		Assert.assertEquals(message, accountCreationErrorMessage.getText());
	}

}
