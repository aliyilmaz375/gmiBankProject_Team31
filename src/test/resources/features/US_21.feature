Feature: "System should allow to read all countries info using api end point

  Scenario:TC_01 country okuma
    Given Kullanici adresteki end_pointe gider " https://www.gmibank.com/api/tp-countries"
    Given Read all countries you created and validate them from your data set
    Then Read all countries you created and validate them 1 by 1


