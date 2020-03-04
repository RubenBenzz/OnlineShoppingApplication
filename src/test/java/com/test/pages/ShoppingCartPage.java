package com.test.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

/**
 * This class contains all locators and methods of Shopping cart page.
 * 
 * @author Ruben Markalkar
 *
 */
public class ShoppingCartPage extends PageObject {

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = ".alert-warning")
	private WebElement cartEmptyMessage;

	@FindBy(xpath = "//table[@id='cart_summary']/tbody")
	private WebElement shoppingCartTable;

	/**
	 * Verifies cart is empty message.
	 * 
	 * @param message
	 * 
	 * @throws Exception
	 */
	public void verifyCartEmptyMessage(String message) throws Exception {

		WebDriverWait driverWait = new WebDriverWait(getDriver(), 30);

		driverWait.ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(cartEmptyMessage));

		Assert.assertEquals(message, cartEmptyMessage.getText());
	}

	/**
	 * Clicks delete button of a given product to remove the product from the
	 * cart.
	 * 
	 * @throws Exception
	 */
	public void removeProductFromCart(String product) throws Exception {
		List<WebElement> products = shoppingCartTable.findElements(By.tagName("tr"));

		for (int i = 1; i <= products.size(); i++) {
			WebElement productName = getDriver()
					.findElement(By.xpath("//table[@id='cart_summary']/tbody/tr[" + i + "]/td[2]/p/a"));
			if (product.equalsIgnoreCase(productName.getText())) {

				WebElement deleteButton = getDriver()
						.findElement(By.xpath("//table[@id='cart_summary']/tbody/tr[" + i + "]/td[7]/div/a"));
				deleteButton.click();
				break;
			}
		}
	}

}
