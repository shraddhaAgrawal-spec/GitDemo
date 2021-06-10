Feature: Application login

@LoginTest
Scenario Outline: Checking able to logging into application
Given user should be on application login page "http://demo.guru99.com/V1/index.php"
When user should enter the <Username> and <Password>
And click on login button
And user should be successfully logged and get the title of page 
Examples:
|Username   | Password |
|mngr331788 | tYvEjAv  |

