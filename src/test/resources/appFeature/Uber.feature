@All
Feature: Uber Booking Feature

  @Smoke
  Scenario: Booking Cab Sedan
    Given User wants to select a car type "Sedan" from uber app
    When User selects car "Sedan" and Pick up point "Bangalore" drop location "Pune"
    Then Driver starts the jorney
    And Driver stop the journey
    Then User pays 2000 USD

  @Regression
  Scenario: Booking Cab SUV
    Given User wants to select a car type "SUV" from uber app
    When User selects car "SUV" and Pick up point "Bangalore" drop location "Hyderabad"
    Then Driver starts the jorney
    And Driver stop the journey
    Then User pays 3000 USD

  @Prod
  Scenario: Booking Cab Mini
    Given User wants to select a car type "Mini" from uber app
    When User selects car "Mini" and Pick up point "Mumbai" drop location "Pune"
    Then Driver starts the jorney
    And Driver stop the journey
    Then User pays 1000 USD

  @Smoke @Regression
  Scenario: Booking Cab Rent
    Given User wants to select a car type "Rent" from uber app
    When User selects car "Rent" and Pick up point "Pune" drop location "Mumbai"
    Then Driver starts the jorney
    And Driver stop the journey
    Then User pays 5000 USD

  @End2End
  Scenario: Booking Cab Share
    Given User wants to select a car type "Share" from uber app
    When User selects car "Share" and Pick up point "Hyderabad" drop location "Vijayawada"
    Then Driver starts the jorney
    And Driver stop the journey
    Then User pays 1000 USD
