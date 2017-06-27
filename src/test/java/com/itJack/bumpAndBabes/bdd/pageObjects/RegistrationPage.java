package com.itJack.bumpAndBabes.bdd.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
	@FindBy(css = "#FormField_1")
	private WebElement emailAddressTextField;

	@FindBy(css = "#FormField_2")
	private WebElement passwordTextField;

	@FindBy(css = "#FormField_3")
	private WebElement confirmPasswordTextField;

	@FindBy(css = "#FormField_4")
	private WebElement firstNameTextField;

	@FindBy(css = "#FormField_5")
	private WebElement lastNameTextField;

	@FindBy(css = "#FormField_6")
	private WebElement companyNameTextField;

	@FindBy(css = "#FormField_7")
	private WebElement phoneNumberTextField;

	@FindBy(css = "#FormField_8")
	private WebElement addressLine1TextField;

	@FindBy(css = "#FormField_9")
	private WebElement addressLine2TextField;

	@FindBy(css = "#FormField_10")
	private WebElement cityTextField;

	@FindBy(css = "#FormField_11")
	private WebElement countryDropDown;

	@FindBy(css = "#FormField_12")
	private WebElement stateTextField;

	@FindBy(css = "#FormField_13")
	private WebElement postcodeTextField;

	@FindBy(css = ".btn.alt")
	private WebElement createMyAccountButton;

	public void enterEmailAddress(String eMail) {
		enterText(emailAddressTextField, eMail);
	}

	public void enterPasswprd(String password) {
		enterText(passwordTextField, password);
	}

	public void enterConfirmPasswprd(String cPassword) {
		enterText(confirmPasswordTextField, cPassword);
	}

	public void enterFirstName(String fName) {
		enterText(firstNameTextField, fName);
	}

	public void enterLastName(String lName) {
		enterText(lastNameTextField, lName);
	}

	public void enterCompanyName(String cName) {
		enterText(companyNameTextField, cName);
	}

	public void enterPhoneNumber(String pNum) {
		enterText(phoneNumberTextField, pNum);
	}

	public void enterAddressLine1(String address1) {
		enterText(addressLine1TextField, address1);
	}

	public void enterAddressLine2(String address2) {
		enterText(addressLine2TextField, address2);
	}

	public void enterCity(String city) {
		enterText(cityTextField, city);
	}

	public void selectCountry(String country) {
		selectFromDropDown(countryDropDown, country);

	}

	public void enterState(String state) {
		enterText(stateTextField, state);
	}

	public void enterPostcode(String postcode) {
		enterText(postcodeTextField, postcode);
		clickOnCookie();
	}

	public void clickOnCreateMyAccountButton() {
		clickOnWebElement(createMyAccountButton);

	}

}
