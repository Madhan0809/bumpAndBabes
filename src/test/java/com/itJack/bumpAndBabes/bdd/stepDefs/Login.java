package com.itJack.bumpAndBabes.bdd.stepDefs;

import org.openqa.selenium.support.PageFactory;

import com.itJack.bumpAndBabes.bdd.pageObjects.HomePage;
import com.itJack.bumpAndBabes.bdd.pageObjects.LoginPage;
import com.itJack.bumpAndBabes.bdd.pageObjects.MyAccountPage;
import com.itJack.bumpAndBabes.bdd.utils.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	HomePage homePage = PageFactory.initElements(WebConnector.driver, HomePage.class);
	LoginPage loginPage = PageFactory.initElements(WebConnector.driver, LoginPage.class);
	MyAccountPage myAccountPage = PageFactory.initElements(WebConnector.driver, MyAccountPage.class);

	@Given("^I go to BB Home page$")
	public void i_go_to_BB_Home_page() {
		homePage.navigateToHomePage();
	}

	@When("^I click on Sign in or Create an account link$")
	public void i_click_on_Sign_in_or_Create_an_account_link() {
		homePage.clickOnSignInLink();
	}

	@And("^I enter my Email Address as \"([^\"]*)\"$")
	public void i_enter_my_Email_Address_as(String email) {
		loginPage.typeEmail(email);
	}

	@And("^I enter my Password as \"([^\"]*)\"$")
	public void i_enter_my_Password_as(String password) {
		loginPage.typePasswprd(password);
	}

	@And("^I click on Sign In button$")
	public void i_click_on_Sign_In_button() {
		loginPage.clickOnSignInButton();
	}

	@Then("^I should see \"([^\"]*)\"$")
	public void i_should_see(String expectedText) {
		myAccountPage.verifyTitleText(expectedText);
	}
}
