@access
Feature: Feature to test account creation on Mercury tours

  Background: Validate access to the site is working
    Given browser is open
    And user is on google search page
    When user enters the url of the site in search box
    And hits enter
    Then user is directed to the home page of the site

  @registerpage
  Scenario: Create a Mercury tours account
    Given user is on the site home page
    When user clicks on Register
    Then user is directed to register page

  @register
  Scenario: Enter informations
    Given user is on the site register page
    When user enters informations
    And clicks on envoyer
    Then user is registered

 