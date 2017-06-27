package com.itJack.bumpAndBabes.bdd.stepDefs;

import org.openqa.selenium.support.PageFactory;

import com.itJack.bumpAndBabes.bdd.pageObjects.HomePage;
import com.itJack.bumpAndBabes.bdd.pageObjects.SubscriptionPage;
import com.itJack.bumpAndBabes.bdd.utils.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class MailingList {
	
	HomePage homePage = PageFactory.initElements(WebConnector.driver, HomePage.class);
	SubscriptionPage subscribepage = PageFactory.initElements(WebConnector.driver, SubscriptionPage.class);
	
	@And("^I enter my Name as \"([^\"]*)\"$")
	public void i_enter_my_Name(String name){
		homePage.enterName(name);
	}

	@And("^I enter my EmailId as \"([^\"]*)\"$")
	public void i_enter_my_Email(String email) {
		homePage.enterEmailId(email);
	}
	@And("^I click on Submit Button$")
	public void i_click_on_Submit_Button() {
		homePage.clickOnSubmitButton();
	}

	@Then("^I should see the message \"([^\"]*)\"$")
	public void i_should_see_the_message(String expectedText) {
		subscribepage.verifyTitleText(expectedText);
	    
	}

}
