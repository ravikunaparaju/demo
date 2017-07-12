Feature: As a user I shoudl be able to login to my registered account

	Scenario: Verify user can login with valid credentials
	
		Given user navigated to login screen
		When user enter valid "test@example.com", "12345678"
		And clicks on Sign in button
		Then user is logged into the application