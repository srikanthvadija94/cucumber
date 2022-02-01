Feature: Login Feature

  Scenario Outline: login fail - possible combinations
    Given user is on Apllication landing page
    When user clicks on sign-in button
    Then user is displayed login screen
    When user enter "<username>" in username field
    And user enter "<password>" in password field
    And user clicks sign-in button
    Then user gets login failed error message

    Examples: 
      | username        | password        |
      | invalidUseranme |           12345 |
      | srikanth        | invalidPassword |
      | invalidUsername | invalidPassword |
