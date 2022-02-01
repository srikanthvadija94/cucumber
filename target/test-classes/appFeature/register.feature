Feature: User Registration

  Scenario: user create an account with deatils
    Given User is landed on registration page
    When User enters following the details
      | srikanth  | vadija     | 9999 | srikanth@gmail.com  | Bangalore |
      | rajesh    | maramreddy | 8888 | rajesh@gmail.com    | Bangalore |
      | roopanand | kommi      | 7777 | roopanand@gmail.com | Hyderabad |
      | mohan     | erampally  | 6666 | mohan@gmail.com     | Hyderabad |
    Then User registration should be successfully completed

  Scenario: User create an account with different data with colums
    Given User is landed on registration page
    When User enters following the details with colums
      | First Name | Last Name  | Phone | Email               | City      |
      | srikanth   | vadija     |  9999 | srikanth@gmail.com  | Bangalore |
      | rajesh     | maramreddy |  8888 | rajesh@gmail.com    | Bangalore |
      | roopanand  | kommi      |  7777 | roopanand@gmail.com | Hyderabad |
      | mohan      | erampally  |  6666 | mohan@gmail.com     | Hyderabad |
    Then User registration should be successfully completed
