Feature: US_29 DataBase test ile data lari dogrulama

  Background: Background
  Given kullanici GMIBank Database' ine baglanir

    Scenario: TC_001 user bilgilerini okuma ve dogrulama
      Given kullanici tum user bilgilerini alir
      And kullanici tum user'lara ait login isimlerini alir
      Then kullanici ucuncu satirdaki ismin elvis.welch oldugunu dogrular

  Scenario Outline: TC_002 ulke okuma ve dogrulama
    And kullanici bir "<query>" ve "<columnName>" girer
    Then kullanici id'si 22330 olan ulkeyi dogrular

    Examples: data okuma
      |query|columnName|
      |SELECT * FROM tp_country|id|

  Scenario: TC_003 tum eyaletleri okuma ve dogrulama
    Given kullanici tum state bilgilerini alir
    And kullanici tum state isimlerini alir
    Then kullanici ilk satirdaki ismin Virginia oldugunu dogrular
