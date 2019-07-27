Feature: locate nearest fingerprint and trigger route calculation
  In order to save performance
  we only want to calculate route
  if we were able to locate you
  and you chose a valid destination

  Background:
    Given there are GridPoints:
      | name  | posX | posY |id|
      | Entry | 100  | 100  |AA|
      | Exit  | 250  | 250  |BB|
    And there are FingerPrintSnippets:
      | mac         | gridPoint | signal |
      | 10:55:25:20 | Entry     | 35     |
      | 10:55:25:20 | Exit      | 15     |
      | 50:55:25:60 | Entry     | 80     |
      | 50:55:25:60 | Exit      | 40     |


  Scenario: located fingerprint and target destination is the same
    When the client "Alpha" requests Guidance to Destination "Entry" with telemetry:
      | mac         | power |
      | 10:55:25:20 | 39    |
    Then I know the position from client "Alpha" is the same as chosenDestination
    And will return "you are already there"
    And I will not trigger "Route Calculation"

  Scenario: find location and trigger to calculate route to given destination
    When we approximate the client "Alpha" to the "Entry" GridPoint
    And the client "Alpha" wants to go to the "Exit" GridPoint
    Then we trigger "Route Calculation"

