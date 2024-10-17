
@login
Feature: Sauce Demo login

Scenario: Valid Login
When user enters a valid username
And user enters a valid password
And click on the login button
Then I validate that user loged in


Scenario: Empty password
When user enters a valid username
And user leave password empty
And click on the login button
Then I validate that "Epic sadface: Password is required..." message is displayed

Scenario: Invalid Login
When user enters invalid username "random_username"
And user enters invalid password "random_password"
And click on the login button
Then I validate that "Epic sadface: Username and password do not match any user in this service" message is displayed

