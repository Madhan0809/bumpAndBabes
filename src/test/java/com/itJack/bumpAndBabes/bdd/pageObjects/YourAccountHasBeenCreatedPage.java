package com.itJack.bumpAndBabes.bdd.pageObjects;

public class YourAccountHasBeenCreatedPage extends BasePage{
	public static String accountCreatedTextCSS =  ".TitleHeading";
	
	public void verifyTitleText() {
		assertTextOnWebElement(accountCreatedTextCSS, "Your Account Has Been Created");

}
}
