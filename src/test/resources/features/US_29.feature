Feature: US_29 DataBase test ile data lari dogrulama

  Background: Backgroung
  Given kullanici GMIBank Database' ine baglanir

    Scenario: TC_001 kullanici bilgileri dogrulama
      Given kullanici tum datalari okuyabilmelidir
      Then kullanici tum kullanici datalarini dogrulamalidir