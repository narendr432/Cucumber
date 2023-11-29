Feature: feature to login functionality

  @smoke
  Scenario: Checking the Login is successful with valid credentials

    Given user is on login page
    When  user enter the username and password
    Then  click on login button
    And   user navigate to homepage