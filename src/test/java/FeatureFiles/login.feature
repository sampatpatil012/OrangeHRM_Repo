Feature: To Test Orange HRM

  Scenario: Test Login Functionality with valid username
    Given user should enter username as "Admin"
    When user click on Login button
    Then user should validate passwordErrorMessage
    
    
  Scenario: Test Login Functionality with valid password
    Given user should enter password as "admin123"
    When user click on Login button
    Then user should validate usernameErrorMessage
    
