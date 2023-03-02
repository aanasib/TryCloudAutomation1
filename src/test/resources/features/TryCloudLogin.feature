Feature: TryCloud login functionality
  Agile story: As a user, I should be able to access all the features on
  the login page.
Background: For all scenarios user is on the tryCloud login page
  Given user is on the tryCloud login page


@wip
  Scenario: Users should be able to log in with valid credentials should
  land on the "Dashboard" page after successful login.

    When user enters valid username
    And user enters valid password
    And user clicks on the Log in button
    Then user should land on the "Dashboard" page

  Scenario:


