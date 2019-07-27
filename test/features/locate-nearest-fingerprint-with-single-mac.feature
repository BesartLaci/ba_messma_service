Feature: single mac locate nearest fingerprint
  In order to know if a route should be calculated
  I need to find the most likely currently position



  Scenario: there is a single GridPoint in close range to client
   Given there is a MacKey "D32M" fingerprinted to "Entry" GridPoint
    And client "Alpha" is within a close range to "D32M"
    When client "Alpha" request Guidance
    Then we locate "Alpha" at the "Entry" GridPoint


  Scenario: there is a single GridPoint out of range to client

  Scenario: there are two GridPoints in equal range of the client










