Feature: To Test Orange HRM

  Scenario: Test Login Functionality with valid username
    Given user should enter username as "Admin"
    When user click on Login button
    Then user should validate passwordErrorMessage
