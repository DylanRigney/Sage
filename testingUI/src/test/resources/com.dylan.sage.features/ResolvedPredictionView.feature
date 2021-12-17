Feature: Resolved Prediction View
  Scenario: User navigates to Resolved Prediction View
    Given User is on the landing view
    When User navigates to the Resolved Prediction View
    Then User is at the Resolved Prediction View

  Scenario: User views a resolved prediction
    Given User is at the Resolved Prediction View
    When User selects a resolved prediction
    Then Information about that resolved prediction is displayed
