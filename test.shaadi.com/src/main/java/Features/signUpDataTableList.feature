Feature: dataTable Signup on Shaadi.com
Scenario: Signup scenario using datTable List function

#implementing dataTable List<List<String>>

Given User is already on shaadiDotcom website
When User clicks on the SignUp button
Then User provides emailId and password and OnBehalf details as Daughter
| abc@gmail.com | password | Daughter |
Then User clicks on the Next button
Then Great! Now some basic details are displayed of your Daughter
And User provides daughters firstname and lastname and other details
| Rinku | Patil |
Then User clciks on the SignUp button
Then User close the browser