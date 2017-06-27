package com.itJack.bumpAndBabes.bdd.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage {
	@FindBy(css = ".TitleHeading")
	private WebElement contactUsCss;

	@FindBy(css = "#contact_fullname")
	private WebElement contactFullName;

	@FindBy(css = "#contact_email")
	private WebElement contactEmail;

	@FindBy(css = "#contact_question")
	private WebElement contactQuery;

	@FindBy(css = ".Submit .btn")
	private WebElement sendFormButton;

	public void verifyContactUsPage(String expectedText) {
		assertTextOnWebElement(contactUsCss, "Contact Us");
	}

	public void enterContactFullNamel(String fullNmae) {
		enterText(contactFullName, fullNmae);
	}

	public void enterContactEmailId(String emailId) {
		enterText(contactEmail, emailId);
	}

	public void enterQuery(String query) {
		enterText(contactQuery, query);
	}

	public void clickOnSendFormButton() {
		clickOnWebElement(sendFormButton);
	}

	public void verifySendContactFormPage(String actualURL,String expectedURL) {
		assertURL(actualURL, expectedURL);
}
}
