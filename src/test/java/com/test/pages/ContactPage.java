package com.test.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

/**
 * This class contains all locators and methods of Contact page.
 * 
 * @author Ruben Markalkar
 *
 */
public class ContactPage extends PageObject {

	public ContactPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "id_contact")
	private WebElement subjectDropdown;

	@FindBy(id = "email")
	private WebElement emailTextbox;

	@FindBy(id = "id_order")
	private WebElement orderIdTextbox;

	@FindBy(id = "message")
	private WebElement messageTextbox;

	@FindBy(id = "submitMessage")
	private WebElement sendButton;

	@FindBy(css = ".alert")
	private WebElement successfullMessage;

	/**
	 * Selects subject heading for the message. @
	 * 
	 * @param subject
	 */
	public void selectMessageSubject(String subject) {
		Select dropdown = new Select(subjectDropdown);
		dropdown.selectByVisibleText(subject);
	}

	/**
	 * Enters email ID. @
	 * 
	 * @param email
	 */
	public void enterEmail(String email) {
		emailTextbox.sendKeys(email);
	}

	/**
	 * Enters order ID. @
	 * 
	 * @param orderID
	 */
	public void enterOrderId(String orderID) {
		orderIdTextbox.sendKeys(orderID);
	}

	/**
	 * Enters the message. @
	 * 
	 * @param message
	 */
	public void enterMessage(String message) {
		messageTextbox.sendKeys(message);
	}

	/**
	 * Clicks on send button to send the message. @
	 */
	public void clickSend() {
		sendButton.click();
	}

	/**
	 * Verifies the successful message submission message. @
	 */
	public void verifySuccessfulSubmissionMessage(String messageSentSuccess) {
		Assert.assertEquals(messageSentSuccess, successfullMessage.getText());
	}

}
