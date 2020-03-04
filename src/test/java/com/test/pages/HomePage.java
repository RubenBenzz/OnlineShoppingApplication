package com.test.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

/**
 * This class contains all locators and methods of Home page.
 * 
 * @author Ruben Markalkar
 *
 */
public class HomePage extends PageObject {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "contact-link")
	private WebElement contactUsLink;

	@FindBy(css = ".header_user_info")
	private WebElement signInLink;

	@FindBy(id = "search_query_top")
	private WebElement searchTextbox;

	@FindBy(name = "submit_search")
	private WebElement searchButton;

	@FindBy(xpath = "//ul[@class='product_list grid row']//a[@class='product-name']")
	private List<WebElement> productsList;

	/**
	 * Launches the application under test.
	 * 
	 * @param testCaseName
	 *            test case name in the excel sheet which is currently being
	 *            executed.
	 * @throws Exception
	 */
	public void launchApplication() {
		getDriver().manage().window().maximize();
		open();
	}

	/**
	 * Clicks contact us link.
	 * 
	 * @throws Exception
	 */
	public void clickContactUs() throws Exception {
		contactUsLink.click();
	}

	/**
	 * Clicks Sign in link.
	 * 
	 * @throws Exception
	 */
	public void clickSignInLink() throws Exception {
		signInLink.click();
	}

	/**
	 * Enters product name in the search textbox.
	 * 
	 * @param product
	 * 
	 * @throws Exception
	 */
	public void enterProductName(String product) throws Exception {
		searchTextbox.sendKeys(product);
	}

	/**
	 * Clicks search button.
	 * 
	 * @throws Exception
	 */
	public void clickSearch() throws Exception {
		searchButton.click();
	}

	/**
	 * Selects a given product from the list of products displayed after
	 * searching.
	 * 
	 * @throws Exception
	 */
	public void selectGivenProduct(String product) throws Exception {
		for (int i = 0; i < productsList.size(); i++) {
			if (product.equalsIgnoreCase(productsList.get(i).getText())) {
				productsList.get(i).click();
				break;
			}
		}
	}

}
