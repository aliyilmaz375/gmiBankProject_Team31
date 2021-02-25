Feature: US_15 Kullanici hesabindaki bilgileri goruntuleyebilmeli

  Background:
    Given kulllanici anasayfaya gider
    And kullanici sag ustteki simgeye tiklar
    And kullanici Sign In tiklar
    And kullanici username olarak "Customer55" girer
    And kullanici password olarak "Customer55." girer
    And kullanici Sign In butonuna tiklar
    And kullanici My Operations'a tiklar
    And kullanici My Accounts'a tiklar

  Scenario: TC_001 Kullanici tum hesap turlerini gorebilir
    And kullanici bir View Transaction butonuna tiklar
    Then kullanici tum Account Types'lari goruntuledigini dogrular

  Scenario: TC_002 Kullanici dolu olan bakiyeleri gorebilir
    And kullanici bir View Transaction butonuna tiklar
    Then kullanici tum Account Balance'lari goruntuledigini dogrular

  Scenario: TC_003 Kullanici bir hesaba ait yapilan islemleri gorebilir
    And kullanici bir View Transaction butonuna tiklar
    Then kullanici secili hesapta yapilan islemleri goruntuledigini dogrular
