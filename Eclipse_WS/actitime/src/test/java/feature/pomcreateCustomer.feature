Feature: Create Customer in Actitime

	@pom
  Scenario: Customer Creation
    Given had all the page Objects
    And pomuser is on login page
    When pomuser login with "admin" and "manager"
    Then pomuser home page should be displayed
    When pomuser click on tasks link
    Then pomuser tasks page should be displayed
    When pomuser click on create customer button
    And pomuser click create customer by entering "POM-Syn-BDD-Cu4_feb" and "Syn-BDD-CdDes"
    Then pomuser validates the success message
    And pomuser logout of the applicaiton
    And pomuser close the browser
