Feature: Application Login

  Scenario: Home page default login
    Given User is on Google landing page
    When User logs into application with "holyforkingshirtballs111" and "jucdL04ozB"
    Then Profile page is populated
#    And Cards are displayed "true"

#  Scenario: Home page default login
#    Given User is on bank landing page
#    When User logs into application with "Jane" and "54321"
#    Then Homepage is populated
#    And Cards are displayed "false"