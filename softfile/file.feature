
Feature: Automate Free CRM Application
Background: 
Given user is on login page
When user enter valid username and password
Then user is on home page

Scenario: Perfrom Regression testing on contact page

And user click on contact link
Then user goes to create page and enter fname and last name

Scenario: Perfrom Regression testing on deals page

And user click on deal link
Then user goes to deals page and click on other link
