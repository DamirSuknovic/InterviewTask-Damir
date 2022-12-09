Feature: User should set up required parameters and report the test loss value in console

  @wip
  Scenario: Set up required parameters and report Test loss value
    Given User is on the main page
    When User changes dataset to exclusive
    And User changes noise to given percent
    And User selects two more features
    And User removes one neuron of each
    And User changes learning rate to given value
    And User clicks to run the simulator
    And User waits until Epoch is more than given value
    Then User reports the Test loss value