package com.itJack.bumpAndBabes.bdd.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubscriptionPage extends BasePage {
	
	@FindBy(css = ".TitleHeading")
	private WebElement titleText;
	
	public void verifyTitleText(String expectedText) {
		assertTextOnWebElement(titleText,"Thanks for Subscribing!");
	}

}
