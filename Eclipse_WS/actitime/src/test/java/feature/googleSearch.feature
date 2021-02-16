Feature: Google AutoSuggestions 

Scenario: Verify Auto Suggesions
Given user is on google page
When user enter "synechron" in the search box
Then application should dispaly suggestions
And user will print all suggestions to console
And close the driver


Scenario: Verify Auto Suggesions 
Given user is on google page
When user enter "IBM" in the search box
Then application should dispaly suggestions
And user will print all suggestions to console
And close the driver


Scenario: Verify Auto Suggesions 
Given user is on google page
When user enter "Wipro" in the search box
Then application should dispaly suggestions
And user will print all suggestions to console
And close the driver