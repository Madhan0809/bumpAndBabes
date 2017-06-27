package com.itJack.bumpAndBabes.bdd.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	@FindBy(partialLinkText = "Sign in")
	private WebElement signInLink;

	@FindBy(partialLinkText = "Create an account")
	private WebElement createAnAccount;

	@FindBy(css = "#search_query")
	private WebElement searchField;

	@FindBy(css = ".Button")
	private WebElement searchButton;

	public void clickOnSignInLink() {
		clickOnCookie();
		clickOnWebElement(signInLink);
	}

	public void clickOnCreateAnAccountLink() {
		clickOnCookie();
		clickOnWebElement(createAnAccount);
	}

	public void searchForProducts(String keyword) {
		clickOnCookie();
		enterText(searchField, keyword);
	}

	public void clickOnSearchButton() {
		clickOnWebElement(searchButton);
	}

	@FindBy(css = "#nl_first_name")
	private WebElement mailingListName;

	@FindBy(css = "#nl_email")
	private WebElement mailingListEmail;

	@FindBy(css = ".grid .btn")
	private WebElement submitButton;

	public void enterName(String name) {
		clickOnCookie();
		enterText(mailingListName, name);
	}

	public void enterEmailId(String email) {
		timeUnitWait(2);
		enterText(mailingListEmail, email);
	}

	public void clickOnSubmitButton() {
		clickOnWebElement(submitButton);
	}
	
	@FindBy(linkText = "Contact Us")
	private WebElement contactUsLink;
	public void clickOnContactUsLink() {
		clickOnCookie();
		clickOnWebElement(contactUsLink);
	}
	

	// @FindBy(linkText= )
	// private String link;
	//@FindBy(partialLinkText = "Contact Us")
	//private WebElement contactUsLink;

	public void clickOnFooterLink(String link) {
		clickOnCookie();
		driver.findElement(By.partialLinkText(link)).click();

		// clickOnLinks(link);
	}
	
	@FindBy(partialLinkText = "Gift")
	private WebElement giftCertificates;
	public void clickOnGiftCertificatesLink() {
		clickOnCookie();
		clickOnWebElement(giftCertificates);
	}
}
