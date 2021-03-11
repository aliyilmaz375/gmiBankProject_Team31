Feature: US_30 database kullanici bilgilerini pdf olarak yazdirma

  Scenario Outline: TC_001 kullanici bilgileri yazdirma
    Given kullanici GMIBank Database' ine baglanir
    And kullanici query girer "<query>"
    Examples:
      | query |
      |select * from tp_customer|

