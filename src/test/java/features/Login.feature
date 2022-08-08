Feature: Application Login

  Scenario: Home page default login
    Given User is on bank landing page
    When User logs into application with "John" and "12345"
    Then Homepage is populated
    And Cards are displayed "true"

  Scenario: Home page default login
    Given User is on bank landing page
    When User logs into application with "Jane" and "54321"
    Then Homepage is populated
    And Cards are displayed "false"