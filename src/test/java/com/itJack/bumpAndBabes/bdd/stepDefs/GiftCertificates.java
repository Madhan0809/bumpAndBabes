package com.itJack.bumpAndBabes.bdd.stepDefs;

import org.openqa.selenium.support.PageFactory;

import com.itJack.bumpAndBabes.bdd.pageObjects.GiftCertificatesPage;
import com.itJack.bumpAndBabes.bdd.pageObjects.HomePage;
import com.itJack.bumpAndBabes.bdd.pageObjects.YourShoppingCart;
import com.itJack.bumpAndBabes.bdd.utils.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GiftCertificates {
	
	HomePage homePage = PageFactory.initElements(WebConnector.driver, HomePage.class);
	GiftCertificatesPage giftsPage = PageFactory.initElements(WebConnector.driver, GiftCertificatesPage.class);
	YourShoppingCart shoppingCartPage = PageFactory.initElements(WebConnector.driver, YourShoppingCart.class);
	

@When("^I click on Gift Certificates link$")
public void i_click_on_Gift_Certificates_link() {
	homePage.clickOnGiftCertificatesLink();
}

@And("^I enter Recipient's Name as \"([^\"]*)\"$")
public void i_enter_Recipient_s_Name_as(String name) {
	giftsPage.enterRecipientName(name);
}

@And("^I enter Recipient's Email as \"([^\"]*)\"$")
public void i_enter_Recipient_s_Email_as(String email) {
	giftsPage.enterRecipientEmail(email);
}

@And("^I enter Your Name as \"([^\"]*)\"$")
public void i_enter_Your_Name_as(String fmName) {
	giftsPage.enterFromName(fmName);
}

@And("^I enter Your Email as \"([^\"]*)\"$")
public void i_enter_Your_Email_as(String fmEmail) {
	giftsPage.enterFromEmail(fmEmail);
}

@And("^I enter Your Message as \"([^\"]*)\"$")
public void i_enter_Your_Message_as(String msg) {
	giftsPage.enterMessage(msg);
}

@And("^I enter Amount as \"([^\"]*)\"$")
public void i_enter_Amount_as(String amount) {
	giftsPage.enterGiftAmount(amount);
}

@And("^I click on the check box$")
public void i_click_on_the_check_box() {
	giftsPage.clickOnGiftCertificateCheckBox();
}

@And("^I click on Gift Certificate Theme button$")
public void i_click_on_Gift_Certificate_Theme_button() {
	giftsPage.clickOnGiftCertificateTheme();
}
@And("^I click on Preview Button$")
public void i_click_on_Preview_Button() {
	giftsPage.clickOnPreviewButton();
}
@Then("^I should see a \"([^\"]*)\"$")
public void i_should_see_a(String expectedText) {
	giftsPage.verifyTitleText(expectedText);
}

@And("^I click on Close Button$")
public void i_click_on_Close_Button() {
	giftsPage.clickOnDialogBoxCloseButton();
}
@And("^I click on Add Gift Certificate To Cart button$")
public void i_click_on_Add_Gift_Certificate_To_Cart_button(){
	giftsPage.clickOnAddToCartButton();
}

@Then("^I should get the \"([^\"]*)\"$")
public void i_should_get_the(String expectedText){	
	shoppingCartPage.verifyTitleText(expectedText);
}
}


