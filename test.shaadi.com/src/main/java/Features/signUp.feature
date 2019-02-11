Feature: Signup on Shaadi.com
Scenario: Signup functionality scenario

# parameterization without Examples key word, regular expression has to be used. 
#regular expression is used where dataTable is not used.

Given user is already on shaadiDotcom website
When user clicks on the SignUp button
Then user provides "abc@gmail.com" and "password1" and OnBehalf details as "Daughter"
Then user clicks on the Next button
Then Great! Now some basic details are displayed
And user provides daughters "Reema" and "Bera" and other details
Then clciks on the SignUp button
Then user close the browser
#Then Welcome to Shaadi.com displayed
#And user provide information some demographic and marital status of daughter
#Then user clicks on the Continue button

