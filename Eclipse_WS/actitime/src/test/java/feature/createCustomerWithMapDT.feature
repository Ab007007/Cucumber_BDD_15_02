Feature: Create Multiple Customer in Actitime
	
	@dev1
  Scenario: Customer Creation
    Given user is on login page
    When user login with "admin" and "manager"
    Then home page should be displayed
    When user click on tasks link
    Then tasks page should be displayed
    When click create customer by entering customer details from datatable
      | customer_name    | customer_desc         |
      | Sync_Feb15_Cust15 | Sync_Feb15_Cust_Desc1 |
      | Sync_Feb15_Cust16 | Sync_Feb15_Cust_Desc2 |
    And logout of the applicaiton
    And close the browser
