@LoginFeature
Feature: CubeCart Login Function

  @ValidLogin
  Scenario: User cane login with valid username and password
    Given user already on the login page
    When user enter valid username password to click on login button
    Then user should be able to login successfully
    Then user should click on logout button to logout

  @InvalidLogin
  Scenario: User should not able to login with invalid credentials
    Given user already on the login page again
    When user enter invalid username and password to login
    Then user should see error message popup