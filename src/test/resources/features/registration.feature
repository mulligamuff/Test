Feature: Registration Functionality

  Scenario: Successful registration
    Given User is on the registration page
    When User enters valid user details
    And Clicks on the button to submit the details
    Then User should be registered successfully

  Scenario: Registration fails due to missing last name
    Given User is on the registration page
    When User enters valid user details without last name
    And Clicks on the button to submit the details
    Then Registration should fail with an error message

  Scenario: Registration fails due to mismatched password
    Given User is on the registration page
    When User enters valid user details with mismatched password
    And Clicks on the button to submit the details
    Then Registration should fail with an error message

  Scenario: Registration fails due to not accepting terms and conditions
    Given User is on the registration page
    When User enters valid user details without accepting terms and conditions
    And Clicks on the button to submit the details
    Then Registration should fail with an error message
