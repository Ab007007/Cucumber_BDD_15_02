Feature: Create Customer in Actitime

  Background: 
    Given user is on login page
    When user login with "admin" and "manager"
    Then home page should be displayed

	@underdevelopment
  Scenario Outline: Customer Creation
    When user click on tasks link
    Then tasks page should be displayed
    When user click on create customer button
    And click create customer by entering <bg_cust_name> and <bg_cust_desc>
    Then user validates the success message
    And logout of the applicaiton
    And close the browser
   
    Examples:
      | bg_cust_name | bg_cust_desc  |
      | BG_cust1     | BG_Cust1_Desc |
      | BG_cust2     | BG_Cust2_Desc |
