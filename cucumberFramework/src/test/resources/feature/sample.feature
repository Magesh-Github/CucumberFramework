  Feature: Login functionality
  
  
  @regression @negative
  Scenario Outline: Login with multiple invalid data sets
    Given User is on the Login page
    When User enters <username> and <password>
    And clicks on the Login button
    Then An error message should be displayed

    Examples:
      | username   | password  |
      | wrongUser  | pass123   |
      | testUser   | wrongPass |
      | admin123   | admin123  |