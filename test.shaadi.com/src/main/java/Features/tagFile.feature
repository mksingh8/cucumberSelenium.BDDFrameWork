@FunctionalTest
Feature: Tagging in Cucumber
@SmokeTest @RegressionTest
Scenario: checking signup function
Given user hit the url of xxx site
When user clicks on the signup button
And user provides its data
Then user clicks on the save button on signup page
@SmokeTest @RegressionTest @E2ETest
Scenario: checking login function
Given user hit the url of xxx site
Then user clicks on the signin button
And user provides its credentials
Then user click on next button And home page is displayed
@SmokeTest
Scenario: checking balance
Given user is on the Home page
Then user clicks on the Show Balance Button
@SmokeTest @RegressionTest @E2ETest
Scenario: checking transfer balance
Given user is on the Home page
Then user clicks on the transfer fund option
Then user selects the transfer method
And selects the receipient
Then enters the amount to be transferred
And hit the transfer button
Then user provides the OTP on the transaction completion page
Then hit ok button
@SmokeTest @RegressionTest
Scenario: checking mobile recharge
Given user is on the Home page
Then user selects the recharge mobile option
Then enters its mobile number
And selects the plan
Then user hit the ok button
@RegressionTest @E2ETest
Scenario: checking adding third party
Given user is on the Home page
Then user clixks on the add third party
And user provides bank account number and IFSC code of the account holder
Then user clicks on the Add third party
