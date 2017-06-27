package com.itJack.bumpAndBabes.bdd.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	@FindBy(css = "#login_email")
	private WebElement emailAddressTextField;

	@FindBy(css = "#login_pass")
	private WebElement passwordTextField;

	@FindBy(css = "#LoginButton")
	private WebElement signInButton;

	public void typeEmail(String email) {
		enterText(emailAddressTextField, email);
	}

	public void typePasswprd(String password) {
		enterText(passwordTextField, password);
	}

	public void clickOnSignInButton() {
		clickOnWebElement(signInButton);
	}

}
