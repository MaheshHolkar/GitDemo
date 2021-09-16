Feature: Application Login

Scenario: Positive test validation login
Given Initialize the browser with chrome
And navigate to Site "https://rahulshettyacademy.com/"
And click on Login link in home page to land secure sign in Page 
When User Enter <username> and <password> and logs in
Then Verify that user is successfully logged in 

Examples:
|username			|password	|
|test99@gmail.com	|123456		|
|test123@gmail.com	|12345      |
