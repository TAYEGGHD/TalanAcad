

Feature:  feature to test the login functionality


  Scenario Outline: Check login is successful with valid credentials
    Given user is on the login page of the site
    When user enters <username> and <password>
    And user clicks on submit
    Then user is navigated to the home page


    Examples: 
      |username|password|
      |User1|qwerty.5| 

