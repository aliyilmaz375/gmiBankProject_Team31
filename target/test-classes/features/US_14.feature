Feature: US_14 Date

  Background:
    Given kulllanici anasayfaya gider
    And kullanici sag ustteki simgeye tiklar
    And kullanici Sign In tiklar
    And kullanici username olarak "Employee31" girer
    And kullanici password olarak "Employee31." girer
    And kullanici Sign In butonuna tiklar

    Given kullanici My Operation i tiklar
    And kullanici Manage Accounts a tiklar
    And kullanici create a new account a tiklar

    Scenario: TC_001 date kutusuna veri gonderme
    Given kullanici Create Date secer
    Then kullanici Create Date girildigini dogrular
    Then kullanici cikis yapar

  Scenario: TC_002 close date kutusuna veri gonderme
    Given kullanici Close Date secer
    Then kullanici Close Date girildigini dogrular
    Then kullanici cikis yapar