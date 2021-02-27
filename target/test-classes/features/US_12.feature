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
    And manage customer modulunde customer bilgilerinin goruntulendıgını test eder


  Scenario: TC_002_ There_should_be_view_option where customer can be navigated to all customer info
    And view butonuna tiklar
    And Müsteri bilgilerinin gorunurlugunu test eder
