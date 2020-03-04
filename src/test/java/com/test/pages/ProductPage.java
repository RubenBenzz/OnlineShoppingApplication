package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

/**
 * This class contains all locators and methods of Product page. 
 * @author Ruben Markalkar
 *
 */
public class ProductPage extends PageObject{
	
	public ProductPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[contains(text(),'Add to cart')]")
	private WebElement addToCartButton;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceedToCheckoutButton;
	
	/**
	 * Clicks on add to cart button to get the product added to the cart.
	 * @throws Exception
	 */
	public void clickAddToCart() throws Exception {
		addToCartButton.click();
	}
	
	/**
	 * Clicks on proceed to checkout button to proceed to the cart.
	 * @throws Exception
	 */
	public void clickProceedToCheckout() throws Exception {
		proceedToCheckoutButton.click();
	}

}
