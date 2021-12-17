Feature: Prediction View
  Scenario:  User views a prediction
    Given User is on the landing page
    When User selects a prediction to view
    Then Information about that prediction is displayed

  Scenario: User enters a prediction result
    Given User is on a prediction page
    When User enters a prediction result
    And User presses the enter button
    Then The result is entered and the prediction is resolved

