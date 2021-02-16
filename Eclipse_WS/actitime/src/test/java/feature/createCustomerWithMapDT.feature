Feature: Create Multiple Customer in Actitime
	
	@acitime
  Scenario: Customer Creation
    Given user is on login page
    When user login with "admin" and "manager"
    Then home page should be displayed
    When user click on tasks link
    Then tasks page should be displayed
    When click create customer by entering customer details from datatable
      | customer_name    | customer_desc         |
      | Sync_Feb15_Cust7 | Sync_Feb15_Cust_Desc1 |
      | Sync_Feb15_Cust8 | Sync_Feb15_Cust_Desc2 |
    And logout of the applicaiton
    And close the browser
