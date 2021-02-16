Feature: Create Customer in Actitime

Scenario: Customer Creation
Given user is on login page
When user login with "admin" and "manager"
Then home page should be displayed
When user click on tasks link
Then tasks page should be displayed
When user click on create customer button 
And  click create customer by entering "Syn-BDD-Cu1" and "Syn-BDD-CdDes"
Then user validates the success message
And logout of the applicaiton
And close the browser