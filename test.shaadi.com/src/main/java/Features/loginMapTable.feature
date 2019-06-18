Feature: Shaadi Login Feature 

Scenario: Shaadi.com Login Test scenario 
# parameterization using scenario outline and Examples key word, regular expression has to be used.
	Given User is already on Login Page 
	When User clicks on the Login Button 
	Then User enters userName and password on signin page 
		| userName | password  |
		| msingh1  | password1 |
		| msingh2  | password2 |
		| msingh3  | password3 |
		| msingh4  | password4 |
		
	Then User clicks on Signin button on signin page 
	Then User is moved to Home Page 
	
