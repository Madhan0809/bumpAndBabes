@regression @smoke-test @footer 
Feature: Footer 

Background: 
	Given I go to BB Home page 
	
Scenario: Verify ContactUs Page
	When I click on Contact Us link 
	And I should navigate to "Contact Us" page 
	And I enter my Full Name as "Pushpa Sathish" 
	And I enter my email address as "sp@gmail.com" 
	And I enter the details "Hi Everyone" 
	And I click on SendForm Button 
	And I should navigate to "http://bumpandbabes.com/pages.php?action=sendContactForm" page 
	
Scenario Outline: Verify FooterLinks

	When I click on "<Footer_Link>" 
	Then I should navigate to "<Expected_Page>" 
	
	Examples: 
		|Footer_Link        |Expected_Page|
		|Delivery Info      |Delivery Info|
		|Returns Policy     |Returns Policy|
		|Price Match        |Price Match|
		|About Us           |About Us|
		|Our Showroom       |Our Showroom|
		|Privacy Policy     |Privacy Policy|
		|Terms & Conditions |Terms & Conditions|
		|Opening Hours      |Opening Hours|
		|Shop By Brand      |All Brands|
		|Sitemap            |Sitemap|
		|Easy Purchase Plan |Easy Purchase Plan|
		