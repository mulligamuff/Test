Feature: Registration Functionality

  Scenario: Successful registration
    Given User is on the registration page
    When User enters valid user details
    And Clicks on the button to submit the details
    Then User should be registered successfully

