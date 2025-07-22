Feature: Flight Booking


  Scenario: User books a one-way flight
    Given Launch expedia home page
    When I click on the Flights link
    And I select the One-way option
    And I enter Leaving from as "chennai"
    And I enter Going to as "delhi"
    And I select two travelers and Economy class
    Then I click on the Search button
    And I should see the search results for the above search criteria



