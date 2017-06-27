package com.itJack.bumpAndBabes.bdd.stepDefs;

import org.openqa.selenium.support.PageFactory;

import com.itJack.bumpAndBabes.bdd.pageObjects.HomePage;
import com.itJack.bumpAndBabes.bdd.pageObjects.SearchResultsPage;
import com.itJack.bumpAndBabes.bdd.utils.WebConnector;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search {
	
	HomePage homePage = PageFactory.initElements(WebConnector.driver, HomePage.class);
	SearchResultsPage searchResultsPage = PageFactory.initElements(WebConnector.driver, SearchResultsPage.class);

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String keywords) {
		homePage.searchForProducts(keywords);
		homePage.clickOnSearchButton();
	}

	@Then("^I should see search results page$")
	public void i_should_see_search_results_page() {
		searchResultsPage.verifySearchResultsPage();
	}

}
