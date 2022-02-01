Feature: Calculate Billing Amount

  Scenario Outline: billing amount
    Given user is on billing page
    When user enters billing amount "<billing amount>"
    When user enters Tax amount "<tax amount>"
    And user clicks on calculate button
    Then it gives the final amount "<final amount>"

    Examples: 
      | billing amount | tax amount | final amount |
      |           1000 |        101 |         1101 |
      |           5200 |        201 |         5401 |
      |           3000 |     150.56 |      3150.56 |
