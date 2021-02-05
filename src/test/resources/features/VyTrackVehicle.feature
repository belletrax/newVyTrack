Feature: 

	#1.As a truck driver I should be able to access Vehicle under Fleet module.
	@EU2-186
	Scenario: user should be able to access Vehicle 
		
		Given  authorised user on login page
		When authorised user enter valid cridential
		Then user should be able to login
		Then user should be able to access Vehicle under Fleet module