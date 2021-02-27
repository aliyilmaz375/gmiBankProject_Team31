@wip
Feature: An Employee can manage Customer
  Background:
    Given kullanici GMIBank sayfasina gider
    Then Insan simgesine tiklar
    And Valid username girer
    And Valid password girer
    And Sign in butonuna basar
    And MyOperations tiklar
    And Manage Customer tiklar

  Scenario: TC_001_Customer_Information_canbe_shown
    Given manage customer modulunde customer bilgilerinin goruntulendıgını test eder