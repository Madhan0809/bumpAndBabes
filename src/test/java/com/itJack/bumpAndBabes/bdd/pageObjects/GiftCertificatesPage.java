package com.itJack.bumpAndBabes.bdd.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftCertificatesPage extends BasePage {

	@FindBy(css = "#to_name")
	private WebElement recipientName;

	@FindBy(css = "#to_email")
	private WebElement recipientEmail;

	@FindBy(css = "#from_name")
	private WebElement fromName;

	@FindBy(css = "#from_email")
	private WebElement fromEmail;

	@FindBy(css = "#message")
	private WebElement message;

	@FindBy(css = "#certificate_amount")
	private WebElement certificateAmount;

	@FindBy(css = "#uniform-agree2")
	private WebElement giftCertificateCheckBox;

	@FindBy(xpath = ".//*[@id='frmGiftCertificate']/div/dl/dd[11]/div[1]/label[1]/div/span")
	private WebElement giftCertificateTheme;
	
	@FindBy(css = ".btn.alt")
	private WebElement previewButton;
	
	@FindBy(css = "#SaveCertificate")
	private WebElement addToCartButton;
	
	@FindBy(css = ".Logo1stWord")
	private WebElement dialogBoxHeading;
	
	@FindBy(css = ".modalClose")
	private WebElement dialogBoxCloseButton;

	public void enterRecipientName(String name) {
		clickOnCookie();
		enterText(recipientName, name);
	}

	public void enterRecipientEmail(String email) {
		enterText(recipientEmail, email);
	}

	public void enterFromName(String fmName) {
		enterText(fromName, fmName);
	}

	public void enterFromEmail(String fmEmail) {
		enterText(fromEmail, fmEmail);
	}

	public void enterMessage(String msg) {
		enterText(message, msg);
	}

	public void enterGiftAmount(String amount) {
		enterText(certificateAmount, amount);
	}

	public void clickOnGiftCertificateCheckBox() {
		clickOnWebElement(giftCertificateCheckBox);
	}

	public void clickOnGiftCertificateTheme() {
		clickOnWebElement(giftCertificateTheme);
	}
	public void clickOnPreviewButton() {
		clickOnWebElement(previewButton);
	}
	public void verifyTitleText(String expectedText) {
		timeUnitWait(3);
		switchToActiveElement();
		switchToFrame(0);
		assertTextOnWebElement(dialogBoxHeading,"bumpandbabes");
	}
	public void clickOnDialogBoxCloseButton() {
		switchToDefaultContent();
		clickOnWebElement(dialogBoxCloseButton);
	}

	public void clickOnAddToCartButton() {
		clickOnWebElement(addToCartButton);
	}

}
