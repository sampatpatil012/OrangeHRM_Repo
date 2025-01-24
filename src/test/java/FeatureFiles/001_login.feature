Feature: To Test Orange HRM

  Scenario: Test Login Functionality with valid username
    Given user should enter username as "Admin"
    When user click on Login button
    Then user should validate passwordErrorMessage

  Scenario: Test Login Functionality with valid password
    Given user should enter password as "admin123"
    When user click on Login button
    Then user should validate usernameErrorMessage

  Scenario: Test Login Functionality with Invalid credentials
    Given user should enter username as "wrongUsername"
    And user should enter password as "wrongpw"
    When user click on Login button
    Then user should validate credentialsErrorMessage

  Scenario: Test Login Functionality with Invalid credentials
    When user click on Login button
    Then user should validate usernameErrorMessage
    And user should validate passwordErrorMessage

  Scenario: Test Login Functionality with valid username and invalid password
    Given user should enter username as "Admin"
    And user should enter password as "wrongpw"
    When user click on Login button
    Then user should validate credentialsErrorMessage

  Scenario: Test Login Functionality with Invalid username and valid password
    Given user should enter username as "admi@435"
    And user should enter password as "admin123"
    When user click on Login button
    Then user should validate credentialsErrorMessage

  @sanity
  Scenario: Test Login Functionality with valid username and valid password
    Given user should enter username as "Admin"
    And user should enter password as "admin123"
    When user click on Login button
    Then user should navigate to homepage and validate the title as "OrangeHRM"
