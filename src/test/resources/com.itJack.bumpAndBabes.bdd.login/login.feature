@regression @smoke-test @test 
Feature: Login 

Background: 
	Given I go to BB Home page
	When I click on Sign in or Create an account link 
	
Scenario Outline: Login 
	And I enter my Email Address as "<ID>" 
	And I enter my Password as "<PASS>" 
	And I click on Sign In button 
	Then I should see "<Expected_Result>" 
	
	Examples: 
		|ID            |PASS       |Expected_Result					|
		|sowmyn@gmail.com|magnet123|My Account         				|
		#|sowmyn@gmail.com|magent1234|Your email address or password is incorrect  	|
