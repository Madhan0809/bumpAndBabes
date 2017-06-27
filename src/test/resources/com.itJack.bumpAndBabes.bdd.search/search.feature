@regression @smoke-test @search
Feature: Search 

Scenario: Search
    Given I go to BB Home page
    When I search for "Toys"
	Then I should see search results page 