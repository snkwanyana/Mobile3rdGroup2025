Feature: Animation Testing

  Scenario: Verify animation starts on button click
    Given I am on the animation test page
    When I click the Event option
    Then the animation should start playing
