Feature: US_18 Manager musterilerin hesabini yonetebilmeli

  Background:
    Given kulllanici anasayfaya gider
    And kullanici sag ustteki simgeye tiklar
    And kullanici Sign In tiklar
    And kullanici username olarak "Manager31" girer
    And kullanici password olarak "Manager31." girer
    And kullanici Sign In butonuna tiklar

    Given kullanici My Operation i tiklar
    And kullanici Manage Customer i tiklar

    Scenario: TC_001 Manage Customer Pozitif Test
      Then kullanici tum customer bilgilerini goruntuler

      Scenario: TC_002 View butonun oldugunu dogrulanir
        Then kullanici customer bilgilerine gidebilecegi bir View butonun oldugunu dogrular

        Scenario: TC_003 Edit butonun oldugunu dogrulanir
          Then kullanici customer bilgilerini duzenleyebilecegi bir Edit butonun oldugunu dogrular

          Scenario: TC_004 Bir customerin ismini edit etme
            Given kullanici Edit butonuna tiklar
            And kullanici firstname butonunda mevcut ismi siler ve yeni isim girer
            And kullanici Save butonuna tiklar

            Scenario: TC_005 Bir musteriyi silme ve cikan uyari mesaji
              And kullanici herhangi bir Delete butonuna tiklar
              And kullanici gelen mesajdan Cancel e tiklar








