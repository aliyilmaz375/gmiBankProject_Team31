Feature: US_11 Date

  Background:
    Given kulllanici anasayfaya gider
    And kullanici sag ustteki simgeye tiklar
    And kullanici Sign In tiklar
    And kullanici username olarak "Employee31" girer
    And kullanici password olarak "Employee31." girer
    And kullanici Sign In butonuna tiklar

    Given kullanici My Operation i tiklar
    And kullanici Manage Customer i tiklar
    And kullanici create a new customer i tiklar

    Scenario: TC_001 date kutusuna veri gonderme
      Given kullanici bir tarih girer
      Then kullanici Date girildigini dogrular
      Then kullanici cikis yapar

  Scenario: TC_002 user secme
    Given kullanici user dropdown kutusundan iki nci user i secer
    Then kullanici user secildigini dogrular
    Then kullanici cikis yapar

    Scenario: TC_003 account secme
      Given kullanici Account dropdown dan bir hesap secer
      Then kullanici Account secildigini dogrular
      And kullanici cikis yapar

  Scenario: TC_004 zelle kutusu tiklama
    Given kullanici Zelle kutusunu tiklar
    Then kullanici Zelle kutusunun tiklandigini dogrular
    And kullanici Save butonuna tiklar
    And kullanici cikis yapar





