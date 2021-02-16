Feature: Create Multiple Customer in Actitime

	@actitime
  Scenario Outline: Customer Creation
    Given user is on login page
    When user login with "admin" and "manager"
    Then home page should be displayed
    When user click on tasks link
    Then tasks page should be displayed
    When user click on create customer button
    And click create customer by entering <customer_name> and <customer_desc>
    Then user validates the success message
    And logout of the applicaiton
    And close the browser

    Examples: 
      | customer_name     | customer_desc          |
      | Sync_Feb15_Cust1 | Sync_Feb15_Cust_Desc1 |
      | Sync_Feb15_Cust2 | Sync_Feb15_Cust_Desc2 |
