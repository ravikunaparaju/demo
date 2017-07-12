Feature: As a user
		I can create lending account
		So I can start investing
		
	Scenario: Verify user can register for a lending account
	
		Given user clicked on Get started for free on home screen
		And clicked on get started button in Lending
		When user enters "name", "email@example.com", "password" 
		And enabled terms & clicked Apply button
		Then account should be created and user eligibility questionnaire should be displayed  