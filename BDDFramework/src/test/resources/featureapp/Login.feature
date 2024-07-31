Feature: Login functionality
Scenario: Login to application
Given I am in login page 
When I enter credential
And i click on login button
Then I should be able to login

Scenario: login to application with incorrect credential
Given I am in login page
When I enter incorrect credential
And I enter incorrect credential
Then I should not able to login it will show error

Scenario: user should enter dashboardpage
Given i am in dashboard page
When iam checking dashboard page is apeared or not
And user checking other module is apeared on not
Then user must be check dashboard is working or not