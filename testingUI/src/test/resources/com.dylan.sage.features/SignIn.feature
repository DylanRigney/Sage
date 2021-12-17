Feature: Signing in
  Scenario: User signs in with correct username and password
    Given User is on the sign in page
    When User types the correct username
    And User types in the correct password
    And User presses sign in
    Then User has successfully logged in

  Scenario: User signs in with invalid username and password
    Given User is on the sign in page
    When User enters invalid login information
    And User presses sign in
    Then An error message is displayed

