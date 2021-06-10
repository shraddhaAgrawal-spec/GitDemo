Feature: CustomerPage login 

Background: 
	Given user should be on application login page "http://demo.guru99.com/V1/index.php" 
	
@CucumberTest 
Scenario: Able to click on various options and page should get open 
	When user should enter the username and password 
	And click on login button 
	And user should be successfully logged and get the title of page 
	When user has clicked the New Customer button from the list 
	And Enter the below details 
	
		|CustomerName | Gender | DOB        | Address     | City   | State | PIN    | number     | emailId                    |
		|Shraddha     | Female | 08-05-1995 | Nehru Nagar | Kanpur | U.P.  | 208012 | 7841955422 | shraddha12agrawal@yahoo.in |
		
	And Click on submit button to create customer 
	Then new customer should get created successfully