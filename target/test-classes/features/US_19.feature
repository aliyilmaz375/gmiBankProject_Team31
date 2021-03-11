@newAccount
Feature: US_19 create a new account (manager)

  Background:
    Given kulllanici anasayfaya gider
    And kullanici sag ustteki simgeye tiklar
    And kullanici Sign In tiklar
    And kullanici username olarak "Manager31" girer
    And kullanici password olarak "Manager31." girer
    And kullanici Sign In butonuna tiklar

  Scenario: TC_001 Pozitif Test

    When kullanici My Operations a tiklar
    And kullanici Manage Accounts a tiklar
    And kullanici create a new account a tiklar
    And kullanici Description textbox ina desciription girer
    And kullanici Balance textbox ina bir balance girer
    And kullanici Account Type ini secer
    And kullanici Account Status Type ini secer
    And kullanici Create Date secer
    And kullanici Close Date secer
    And kullanici save butonuna tiklar
    Then kullanici hesap olustugunu dogrular

  Scenario: TC_002 Negatif Test

    When kullanici My Operations a tiklar
    And kullanici Manage Accounts a tiklar
    And kullanici create a new account a tiklar
    And kullanici Description textbox ina desciription girer
    And kullanici Balance textbox bos birakilir
    And kullanici Account Type ini secer
    And kullanici Account Status Type ini secer
    And kullanici Create Date secer
    And kullanici Close Date secer
    And kullanici save butonuna tiklar
    Then kullanici hata mesajini goruntuler

  Scenario: TC_003 Negatif Test

    When kullanici My Operations a tiklar
    And kullanici Manage Accounts a tiklar
    And kullanici create a new account a tiklar
    And kullanici Description textbox bos birakilir
    And kullanici Balance textbox ina bir balance girer
    And kullanici Account Type ini secer
    And kullanici Account Status Type ini secer
    And kullanici Create Date secer
    And kullanici Close Date secer
    And kullanici save butonuna tiklar
    Then kullanici hata mesajini goruntuler

  Scenario: TC_004 Negatif Test

    When kullanici My Operations a tiklar
    And kullanici Manage Accounts a tiklar
    And kullanici create a new account a tiklar
    And kullanici Description textbox ina desciription girer
    And kullanici Balance textbox ina bir balance girer
    And kullanici Account Type ini secer
    And kullanici Account Status Type ini secer
    And kullanici Create Date secer
    And kullanici gecersiz Close Date secer
    And kullanici save butonuna tiklar
    Then kullanici hata mesajini goruntuler






