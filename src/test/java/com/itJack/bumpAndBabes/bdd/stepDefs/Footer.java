package com.itJack.bumpAndBabes.bdd.stepDefs;

import org.openqa.selenium.support.PageFactory;

import com.itJack.bumpAndBabes.bdd.pageObjects.BasePage;
import com.itJack.bumpAndBabes.bdd.pageObjects.ContactUsPage;
import com.itJack.bumpAndBabes.bdd.pageObjects.FooterLinksPage;
import com.itJack.bumpAndBabes.bdd.pageObjects.HomePage;
import com.itJack.bumpAndBabes.bdd.utils.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Footer extends BasePage {

	HomePage homePage = PageFactory.initElements(WebConnector.driver, HomePage.class);
	FooterLinksPage footerLinksPage = PageFactory.initElements(WebConnector.driver, FooterLinksPage.class);
	ContactUsPage contactUsPage = PageFactory.initElements(WebConnector.driver, ContactUsPage.class);

	@When("^I click on Contact Us link$")
	public void i_click_on_Contact_Us_link() {
		homePage.clickOnContactUsLink();
	}

	@And("^I should navigate to \"([^\"]*)\" page$")
	public void i_should_navigate_to_contactus_page(String expectedText) {
		contactUsPage.verifyContactUsPage(expectedText);
	}

	@And("^I enter my Full Name as \"([^\"]*)\"$")
	public void i_enter_my_Full_Name_as(String fullNmae) {
		contactUsPage.enterContactFullNamel(fullNmae);
	}

	@And("^I enter my email address as \"([^\"]*)\"$")
	public void i_enter_my_email_address_as(String emailId) {
		contactUsPage.enterContactEmailId(emailId);
	}

	@And("^I enter the details \"([^\"]*)\"$")
	public void i_enter_the_details(String query) {
		contactUsPage.enterQuery(query);
	}

	@And("^I click on SendForm Button$")
	public void i_click_on_send_form() {
		contactUsPage.clickOnSendFormButton();
	}

	@And("^I should navigate to  \"([^\"]*)\" page$")
	public void i_should_navigate_to_(String actualURL, String expectedURL) {
		contactUsPage.assertURL(actualURL, expectedURL);
	}

	@When("^I click on \"([^\"]*)\"$")
	public void i_click_on(String link) {
		homePage.clickOnFooterLink(link);
	}

	@Then("^I should navigate to \"([^\"]*)\"$")
	public void i_should_navigate_to(String expectedPage) {
		footerLinksPage.verifyFooterLinkPage(expectedPage);
	}

}
