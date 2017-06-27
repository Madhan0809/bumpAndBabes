package com.itJack.bumpAndBabes.bdd.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterLinksPage extends BasePage {

	@FindBy(css = ".TitleHeading")
	private WebElement footerLinkCss;

	public void verifyFooterLinkPage(String expectedPage) {
		assertTextOnWebElement(footerLinkCss, expectedPage);
	}

}
