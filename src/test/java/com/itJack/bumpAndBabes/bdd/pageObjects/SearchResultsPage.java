package com.itJack.bumpAndBabes.bdd.pageObjects;

public class SearchResultsPage extends BasePage{
	
	public static String searchResultsTextCSS = "#SearchPageHeader .txt24";
	
	public void verifySearchResultsPage(){
		assertTextOnWebElement(searchResultsTextCSS, "Search Results for");
	}

}
