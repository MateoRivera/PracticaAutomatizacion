Feature: Simulate free investment loan in bancolombia/personas
  As investor I want to simulate a free investment loan for
  knowing the benefits I would have with bancolombia

  Scenario: From bancolombia personas I can open the simulator of free investment credit and make a simulation
    Given I am in personas of bancolombia
    When I close offers
    And I click the button know more in credits zone
    And I click on simulate at Free investment credit Bancolombia zone
    And I click on continue
    And I select yes
    And I set a random number betweeen 1000000 and 500000000 for a loan
    And I set a random number betweeen 48 and 84 for months
    And I set a random date
    And I click on simulate
    Then it carries me three options of credits
