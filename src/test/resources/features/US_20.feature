Feature: US_20 System should allow to read all customers

  Scenario:TC_01 customers okuma
    Given kullanici adresteki end_pointe gider "https://gmibank.com/api/tp-customers"
    Given Tum customers okunabilmeli
    Then Tum customers dogrulanmali