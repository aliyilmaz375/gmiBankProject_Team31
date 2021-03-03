Feature:gmiBank Registration

  Scenario:
    Given user enters  at least 1 lowercase char for stronger password
    And user enters at least 1 uppercase char and see the level  chart change accordingly
    And user enters at least 1 digit  and see the level  chart change accordingly
    And user enters at least 1 special char and see the level bar change accordingly
    Then user enters at least 7 chars for a stronger password
