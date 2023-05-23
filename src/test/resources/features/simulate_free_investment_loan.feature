Feature: Simulate free investment loan in bancolombia/personas
  As investor I want to simulate a free investment loan for
  knowing the benefits I would have with bancolombia

  Scenario: From bancolombia/personas I can arrive to the simulate button
    Given I am in personas of bancolombia
    When I click the button know more in credits zone
    Then it carries me to consumer loans page
