Feature: Login into account

Scenario: User should be able to login into account using correct credentials
Given User navigates to StackOverflow website
And User clicks on the login button
And User enters the valid username
And User enters the valid password
When User clicks the login button
Then User should be taken to successful login page