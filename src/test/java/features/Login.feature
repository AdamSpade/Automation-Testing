Feature: Application Login

  Scenario: Home page default login
    Given User is on bank landing page
    When User logs into application with username and password
    Then Homepage is populated
    And All cards are displayed