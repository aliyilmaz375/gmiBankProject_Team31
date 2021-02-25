Feature: US_04 Login

  Scenario: TC_001 Login Pozitif Test

    Given kulllanici anasayfaya gider
    And kullanici sag ustteki simgeye tiklar
    And kullanici Sign In tiklar
    And kullanici username olarak "Employee31" girer
    And kullanici password olarak "Employee31." girer
    And kullanici Sign In butonuna tiklar
    Then kullanici employee sayfasinda oldugunu dogrular
    And kullanici sayfayi kapatir

  Scenario Outline: TC_001-005 Login Pozitif Test

    Given kulllanici anasayfaya gider
    And kullanici sag ustteki simgeye tiklar
    And kullanici Sign In tiklar
    And kullanici username olarak "<username>" girer
    And kullanici password olarak "<password>" girer
    And kullanici Sign In butonuna tiklar
    And kullanici sayfayi kapatir

    Examples:
      |username| password|
      |Employee31|Employee31.|
      |Admin31   |Admin31.   |
      |Manager31 |Manager31. |
      |Customer55|Customer55.|
      |User31   |User31.    |
