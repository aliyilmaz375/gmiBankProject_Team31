Feature: System should allow to create new states using api end point if not created already

  Scenario: User can Just create each state 1 by 1
    And users can create any state with endPoint "https://www.gmibank.com/api/tp-states"
    Then validate created state