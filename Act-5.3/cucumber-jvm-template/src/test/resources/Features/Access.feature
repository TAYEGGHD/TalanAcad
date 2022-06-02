
Feature: feature to test access to the site


  Scenario: Validate access to the site is working
    Given browser is open
    And user is on google search page
    When user enters url of the site in search box
    And hits enter
    Then user is directed to the home page of the site


