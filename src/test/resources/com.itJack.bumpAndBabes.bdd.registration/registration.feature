@regression @smoke-test @registration @m
Feature: Create an Account 
	As a new user

Background: 
	Given I go to BB Home page 
	When I click on Create an account link 
	
Scenario Outline: Create an Account 

	And I enter my Email as "<Email>" 
	And I enter my password as "<Password>" 
	And I enter my Confirm Password as "<ConfirmPassword>" 
	And I enter my First Name as "<FirstName>" 
	And I enter my Last Name as "<LastName>" 
	And I enter my Company Name as "<CompanyName>" 
	And I enter my Phone number as "<Phone_Num>" 
	And I enter my Address Line 1 as "<Address1>" 
	And I enter my Address Line 2 as "<Address2>" 
	And I enter my City as "<City>" 
	And I select my Country as "<Country>" 
	And I enter my State as "<State>" 
	And I enter my Postcode as "<Postcode>" 
	And I click on Create My Account Button 
	Then I should see message as "<Expected_Message>" 
	
	Examples: 
		|Email           |Password   |ConfirmPassword|FirstName|LastName|CompanyName|Phone_Num |Address1|Address2| City   | Country       |State|Postcode|Expected_Message           |
		|spp@gmail.com|password123|password123    |Pushpa   |Sathish |ItJack     |3434655766|  61    |woodway |Keighley|United Kingdom |  WY |BD21 5PG|Your Account Has Been Created |
		#|sp@gmail.com |qwerty123  |qwerty123      |adsda    |dsdfds  |dfsfs      |342423424 |32      |dfdsd   |dfdegfg |United Kingdom |as   |dfsdfd  |Create An Account|
