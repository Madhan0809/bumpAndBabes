package com.itJack.bumpAndBabes.bdd.stepDefs;

import org.openqa.selenium.support.PageFactory;

import com.itJack.bumpAndBabes.bdd.pageObjects.HomePage;
import com.itJack.bumpAndBabes.bdd.pageObjects.RegistrationPage;
import com.itJack.bumpAndBabes.bdd.pageObjects.YourAccountHasBeenCreatedPage;
import com.itJack.bumpAndBabes.bdd.utils.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class registration {
	RegistrationPage registrationPage = PageFactory.initElements(WebConnector.driver, RegistrationPage.class);
	HomePage homePage = PageFactory.initElements(WebConnector.driver, HomePage.class);
	YourAccountHasBeenCreatedPage accountCreatedPage = PageFactory.initElements(WebConnector.driver, YourAccountHasBeenCreatedPage.class);

	@When("^I click on Create an account link$")
	public void i_click_on_Sign_in_or_Create_an_account_link() {
		homePage.clickOnCreateAnAccountLink();
	}

	@And("^I enter my Email as \"([^\"]*)\"$")
	public void i_enter_my_Email_as(String eMail) {
		registrationPage.enterEmailAddress(eMail);
	}

	@And("^I enter my password as \"([^\"]*)\"$")
	public void i_enter_my_password_as(String password) {
		registrationPage.enterPasswprd(password);
	}

	@And("^I enter my Confirm Password as \"([^\"]*)\"$")
	public void i_enter_my_Confirm_Password_as_password(String cPassword) {
		registrationPage.enterConfirmPasswprd(cPassword);

	}

	@And("^I enter my First Name as \"([^\"]*)\"$")
	public void i_enter_my_First_Name_as(String fName) {
		registrationPage.enterFirstName(fName);

	}

	@And("^I enter my Last Name as \"([^\"]*)\"$")
	public void i_enter_my_Last_Name_as(String lName) {
		registrationPage.enterLastName(lName);

	}

	@And("^I enter my Company Name as \"([^\"]*)\"$")
	public void i_enter_my_Company_Name_as_It_Jack(String cName) {
		registrationPage.enterCompanyName(cName);

	}

	@And("^I enter my Phone number as \"([^\"]*)\"$")
	public void i_enter_my_Phone_number_as(String pNum) {
		registrationPage.enterPhoneNumber(pNum);

	}

	@And("^I enter my Address Line 1 as \"([^\"]*)\"$")
	public void i_enter_my_Address_Line1_as(String address1) {
		registrationPage.enterAddressLine1(address1);

	}

	@And("^I enter my Address Line 2 as \"([^\"]*)\"$")
	public void i_enter_my_Address_Line2_as(String address2) {
		registrationPage.enterAddressLine2(address2);

	}

	@And("^I enter my City as \"([^\"]*)\"$")
	public void i_enter_my_City_as(String city) {
		registrationPage.enterCity(city);

	}

	@And("^I select my Country as \"([^\"]*)\"$")
	public void i_select_my_Country_as(String country) {
		registrationPage.selectCountry(country);

	}

	@And("^I enter my State as \"([^\"]*)\"$")
	public void i_enter_my_State_as(String state) {
		registrationPage.enterState(state);

	}

	@And("^I enter my Postcode as \"([^\"]*)\"$")
	public void i_enter_my_Postcode_as_BD_PG(String postcode) {
		registrationPage.enterPostcode(postcode);

	}

	@And("^I click on Create My Account Button$")
	public void i_click_on_Create_My_Account_Button() {
		registrationPage.clickOnCreateMyAccountButton();

	}

	@Then("^I should see message as \"([^\"]*)\"$")
	public void i_should_see_message_as(String message) {
		accountCreatedPage.verifyTitleText();

	}

}
