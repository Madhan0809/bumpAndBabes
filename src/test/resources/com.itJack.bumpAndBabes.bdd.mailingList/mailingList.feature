@regression @smoke-test @mail
Feature: Mailing List

Background: 
	Given I go to BB Home page
	
Scenario: 
	And I enter my Name as "Pushpa"
	And I enter my EmailId as "sp@gmail.com"
	And I click on Submit Button
	Then I should see the message "Thanks for Subscribing!"
	

