Feature: US_10_Adres_bilgilerini_girme


  Background:
    Given kulllanici anasayfaya gider
    And kullanici sag ustteki simgeye tiklar
    And kullanici Sign In tiklar
    And kullanici username olarak "Employee31" girer
    And kullanici password olarak "Employee31." girer
    And kullanici Sign In butonuna tiklar
    And kullanici Myoperations a basar
    And kullanici Manage Customers a basar
    And kullanici Create a new Customers a basar


  Scenario: TC_01_adres
    And kullanici adres kutusuna bir adres girer
    And kullanici cikis yapar

  Scenario: TC_02_city
    And kullanici city kutusuna bir sehir girer
    And kullanici cikis yapar


  Scenario: TC_03_state
    And kullanici state kutusuna bir sehir girer
    And kullanici cikis yapar

  Scenario: TC_04_country
    And kullanici country kutusuna bir ulke girer
    And kullanici cikis yapar