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
  Scenario Outline: Enter informations
    Given user is on the site register page
    When user enters <First name> and <Last Name> and <Phone> and <Email> and <Address> and <City> and <State/Province> and <Postal Code> and <Country> and <User Name> and <Password> and <Confirm Password>
    And clicks on envoyer
    Then user is registered

    Examples: 
      |First Name|Last Name|Phone|Email|Address|City|State/Province|Postal Code|Country|User Name|Password|Confirm Password|
      |name1|Lastname1|123456789|name@gmail.com|Rue de la bource|Tunis|Tunis|2035|Tunisia|User1|qwerty.5|qwerty.5|
