@regression @smoke-test @gift 
Feature: Gift Certificates 

Background: 
	Given I go to BB Home page 
	
	
Scenario Outline: Gift Certificates 

	When I click on Gift Certificates link 
	And I enter Recipient's Name as "<RName>" 
	And I enter Recipient's Email as "<REmail>" 
	And I enter Your Name as "<Name>" 
	And I enter Your Email as "<Email>" 
	And I enter Your Message as "<Message>" 
	And I enter Amount as "<Amount>" 
	And I click on the check box 
	And I click on Gift Certificate Theme button 
	And I click on Preview Button 
	Then I should see a "<dialog_Box>"
	And I click on Close Button 
	And I click on Add Gift Certificate To Cart button 
	Then I should get the "<Expected_Page>" 
	
	Examples: 
		|RName  |REmail       |Name	 |Email	      |Message		 |Amount|dialog_Box |Expected_Page      |
		|Sathish|sat@gmail.com|Pushpa|ps@gmail.com|Happy Birthday|50    |bumpandbabes|Your Shopping Cart |
