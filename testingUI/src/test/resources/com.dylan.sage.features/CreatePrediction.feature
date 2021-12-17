Feature:
  Scenario: User creates a prediction
    Given User is on the landing view
    When User navigates to the create a prediction view
    And Enters in prediction information
    And Presses the Predict button
    Then A popup appears saying your prediction has been created
    And User is back at the landing page
    And Created prediction is displayed on landing page

