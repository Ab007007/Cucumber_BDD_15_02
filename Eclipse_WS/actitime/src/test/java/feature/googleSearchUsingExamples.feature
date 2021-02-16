@google
Feature: Google AutoSuggestions

  Scenario Outline: Verify Auto Suggesions
    Given user is on google page
    When user enter <text> in the search box
    Then application should dispaly suggestions
    And user will print all suggestions to console
    And close the driver

    Examples: 
      | text      |
      | IBM       |
      | google    |
      | Synechron |
