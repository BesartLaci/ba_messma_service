Feature: Scoring closest known gridpoint when locating
  there are multiple gridpoints and associated macsignals known.
  we only consider a client located if A single gridpoint scores more hits than all the other gridpoints when comparing to telemetry

  Scenario: A client can be cleary associated to a single gridpoint with a tolerance of 5

  Scenario: A client is approximated to two gridpoints equally with a tolerance of 5

  Scenario: A client is approximated to two or more gridpoints equaly with a tolerance of 5

    Scenario: A client is not in close range to any gridpoints accordig to their telemetry with a tolerance of 5