Feature: US_23

  Background: background
    Given kullanici applicant end pointine gider "https://www.gmibank.com/api/tp-account-registrations"
    And kullanici butun applicants billigilerini alir

  Scenario: TC_001
    Then status kodunun 200 oldugunu dogrulayin
    Then applicants sayisini bulun ve dogrulayin
    Then "werty" adinda basvuran olup olmadigini kontrol edin


  Scenario: TC_002
    Then kullanici ilk id'nin 1252 oldugunu dogrular