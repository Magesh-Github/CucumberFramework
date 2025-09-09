Feature: Amazon Login


  @search
  Scenario: Search mobiles in Amazon
    Given I am on the Amazon homepage
    When I search for "Mobiles"
    And I click on the search button
    Then I should see a list of mobile phones displayed
   