Feature: To validate the Login Fuctionality of FaceBook Application

  Scenario: To validate login with Valid username and Invalid password
    Given User has to lauch the Browser and hit the url
    When User has to pass the valid username to Email field
    And User has to pass the invaild password to Password field
    And User has to click the login button
    And User has to navigate to invalid credentials page
    Then User has to close the Browser
