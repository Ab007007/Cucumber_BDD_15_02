@google
Feature: Google Search

Scenario: Google Search Functionality

Given user is on google page
When user enter "synechron" in the search box
And click on Serch button
Then application should dispaly more results


Given user is on google page
When user enter "$$$$$$$##synechron1322123123" in the search box
And click on Serch button
Then application should dispaly no result