Feature: Create Multiple Customer in Actitime

  Scenario: Customer Creation
    Given user is on login page
    When user login with "admin" and "manager"
    Then home page should be displayed
    When user click on tasks link
    Then tasks page should be displayed
    When click create customer by entering customer details from list datatable
      | Sync_Feb15_Cust9 | Sync_Feb15_Cust_Desc1 |
      | Sync_Feb15_Cust10 | Sync_Feb15_Cust_Desc2 |
    And logout of the applicaiton
    And close the browser
