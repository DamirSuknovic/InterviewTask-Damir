Feature: User should set up required parameters and report the test loss value in console

  Scenario: Set up required parameters and report Test loss value
    Given User is on the main page
    When User changes dataset to exclusive
    And User changes noise to 5 percent
    And User selects two more features
    And User removes one neuron of each
    And User changes learning rate to 0.1
    And User clicks to run the simulator
    And User waits until epoch is more than 0.3
    Then User reports the Test loss value