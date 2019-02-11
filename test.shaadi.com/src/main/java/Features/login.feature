Feature: Shaadi Login Feature
Scenario Outline: Shaadi.com Login Test Scenario

# parameterization using scenario outline and Examples key word, regular expression has to be used.

Given user is already on Login Page
When user clicks on the Login Button
Then user enters "<userName>" and "<password>"
Then user clicks on Signin button
Then user is on Home Page

Examples:
	| userName | password  |
	| msingh1  | password1 |
	| msingh2  | password2 |
	| msingh3  | password3 |
	| msingh4  | password4 |