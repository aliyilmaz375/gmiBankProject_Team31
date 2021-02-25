Feature: US_05 Login

  Scenario Outline: TC_001-005 Login Pozitif Test

    Given kulllanici anasayfaya gider
    And kullanici sag ustteki simgeye tiklar
    And kullanici Sign In tiklar
    And kullanici yanlis bir "<username>" girer
    And kullanici password olarak "<password>" girer
    And kullanici Sign In butonuna tiklar
    Then kullanici hata mesajini gorur
    And kullanici sayfayi kapatir

    Examples:
      |username| password|
      |Employee|Employee31.|
      |Admin   |Admin31.   |
      |Manager |Manager31. |
      |Customer|Customer55.|
      |User   |User31.    |

  Scenario Outline: TC_006-0010 Login Pozitif Test

    Given kulllanici anasayfaya gider
    And kullanici sag ustteki simgeye tiklar
    And kullanici Sign In tiklar
    And kullanici username olarak "<username>" girer
    And kullanici yanlis "<password>" girer
    And kullanici Sign In butonuna tiklar
    Then kullanici hata mesajini gorur
    And kullanici sayfayi kapatir

    Examples:
      |username| password|
      |Employee31|Employee|
      |Admin31   |Admin   |
      |Manager31 |Manager |
      |Customer55|Customer|
      |User31   |User    |

  Scenario Outline: TC_011-012 Login Pozitif Test

    Given kulllanici anasayfaya gider
    And kullanici sag ustteki simgeye tiklar
    And kullanici Sign In tiklar
    And kullanici yanlis bir "<username>" girer
    And kullanici yanlis "<password>" girer
    And kullanici Sign In butonuna tiklar
    Then kullanici hata mesajini gorur
    And kullanici sayfayi kapatir

    Examples:
      |username| password|
      |Employee90|Employee171|
      |Admin   |Admin   |
