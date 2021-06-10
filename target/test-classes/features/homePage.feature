Feature: HomePage
@HomeTest
Scenario: Checking user is on home page after successful login
Given user should be on application login page "http://demo.guru99.com/V1/index.php"
When user should enter the username and password
And click on login button
And click on any button from menu
 |Menu        |
 |Manager     |
 |New Customer|
Then appropiate page should get open and get title of the page

   
