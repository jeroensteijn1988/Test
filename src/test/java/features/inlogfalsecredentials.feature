Feature: Demo Login

Scenario: Valid Credentials
    Given the browser is opened and showing the intranet homepage
    When user logs on with valid credentials
    Then login is not successful
    And an errormessage is displayed
