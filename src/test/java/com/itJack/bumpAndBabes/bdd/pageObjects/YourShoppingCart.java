package com.itJack.bumpAndBabes.bdd.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourShoppingCart extends BasePage{
	

	@FindBy(css = ".TitleHeading")
	private WebElement titleText;
	
	public void verifyTitleText(String expectedText) {
		assertTextOnWebElement(titleText,"Your Shopping Cart");
	}
	

}
