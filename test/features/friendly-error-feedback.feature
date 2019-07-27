Feature: always ask for new telemetry on error
  in order to avoid trying to calculate routes or locations from bad data
  as a
  i want to get new telemetry if i wasnt able to locate or route a request

  i dont want to get the latest location when the client goes online but a fresh one every few seconds

  Scenario: there are two GridPoints in equal range of the client
    Given we get telemetry and dmarkation
    When we can`t match exactly one known position
    Then we will response "we could not locate you"
    And we will ask for new request with new telemetry


  Scenario: cannot guide to dmarkation
    Given we get telemetry and dmarkation
    And we can locate you
    When we can not calcualte the route to given dmarkation
    Then we will response "Could not calculate route"
    And we will ask for new request with new telemetry



  Scenario: located fingerprint and target destination is the same
    Given we get telemetry and dmarkation
    And we can locate you
    And location is dmarkation
    Then we will response you "you are already there"