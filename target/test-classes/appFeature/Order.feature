Feature: Home Page
	In order to check my order details
	As a register user
	I want to specify the features of order details page
	
	Background: 
	Given a register user exist
	Given User is on Amazon login page
	And User enters username
	And User enters password
	And User click on login buttion
	Then User navigate to order page
	
	Scenario: Check previous Order details
	When User clicks on Orders link
	Then User checks the previous Order details
	
	Scenario: Check previous Open order details
	When User clicks on Open orders link
	Then User checks the Open order details
	
	Scenario: Check previous Cancelled order details
	When User clicks on Cancelled orders link
	Then User checks the Cancelled order details
	