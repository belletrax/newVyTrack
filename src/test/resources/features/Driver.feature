Feature: 


	# As a truck driver I should be able to access Vehicle under Fleet module.

	# Acceptance Criteria
	#
	# 1.Verify that truck driver should be able to see all Vehicle information once navigate to Vehicle page.
	# 2.Verify that when user click on any car on the grid , system should display general information
	# about the car
	# 3.Verify that truck driver can add Event and it should display under Activity tab and General
	# information page as well .
	# 4.Verify that Truck driver can reset the Grid by click on Grid setting
	@EU2-187
	Scenario: Truck driver should be able to access Vehicle
		
		When user loged in as driver
		Then user should see following modules
		|Fleet|
		|Customers|
		|Activities|
		|System|
		Then user should access Vehicle module under Fleet module