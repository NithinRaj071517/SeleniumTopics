Feature: Leaftaps Login page automation

Background:
Given Open the Chrome browser 
And Load the application URL as 'http://leaftaps.com/opentaps/control/login'

@Regression
Scenario: TC001 Positive Login flow
And Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
When Click on submit button
Then Verify the Welcome message in the homepage
And Close the browser


@Smoke
Scenario: TC002 Negative Login flow
And Enter the username as 'DemoSalesManager'
And Enter the password as 'weww'
When Click on submit button
But Verify the error message in the homepage
And Close the browser

@Smoke @Rock
Scenario Outline: TC003 Positive Login- MultipleUsers
And Enter the username as "<username>"
And Enter the password as "<password>"
When Click on submit button
Then Verify the Welcome message in the homepage
And Close the browser
Examples:
|'username'|'password'|
|'DemoSalesManager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

@Rock
Scenario: TC004 Positive message verification flow
And Enter the username as 'DemoSalesManager' and password as 'crmsfa'
When Click on submit button
Then Get Welcome message
And Verify Welcome message
