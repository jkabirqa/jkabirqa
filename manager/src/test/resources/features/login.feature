Feature: withdraw money from atm
  In order to withdraw money
  as a user
  I have to enter correct pin number

  Scenario: Enter the card in the machine
    Given I enter credit card into the machine
    When I enter the pin number
    Then user see the money coming out
    And I select the amount of money
    And I press the enter button
