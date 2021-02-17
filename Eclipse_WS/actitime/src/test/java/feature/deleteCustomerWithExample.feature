Feature: Customer Delete Functionality

	@dev1
  Scenario Outline: Delete Customer
    Given user is on login page
    When user login with "admin" and "manager"
    Then home page should be displayed
    When user click on tasks link
    Then tasks page should be displayed
    And user search for a customer <customer_name> in Customer and project search box
    Then user click of settings icon from the searchlist
    When user click on delete button present inside action
    And click on delete permanently
    Then user validates the success message
    And logout of the applicaiton
    And close the browser

    Examples:
    |customer_name|
    |Sync_Feb15_Cust10|