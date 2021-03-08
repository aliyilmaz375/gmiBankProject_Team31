Feature: US_17 Admin kullanicilarin bilgilerini yonetebilmeli

  Background:
    Given kullanici Admin hesabina girer
    And kullanici Administration a tiklar
    And kullanici User Management e tiklar

  Scenario: TC_001 Admin bir User in hesabini active edebilir
    And kullanici Admin olarak bir User hesabini etkinlestirir
    Then kullanici hesabin active edildigini dogrular

  Scenario: TC_002 Admin bir Employee in hesabini active edebilir
    And kullanici Admin olarak bir Employee hesabini etkinlestirir
    Then kullanici hesabin active edildigini dogrular

  Scenario: TC_003 Admin bir Manager in hesabini active edebilir
    And kullanici Admin olarak bir Manager hesabini etkinlestirir
    Then kullanici hesabin active edildigini dogrular

  Scenario: TC_004 Admin bir Customer in hesabini active edebilir
    And kullanici Admin olarak bir Customer hesabini etkinlestirir
    Then kullanici hesabin active edildigini dogrular

  Scenario: TC_005 Admin bir Admin in hesabini active edebilir
    And kullanici Admin olarak bir Admin hesabini etkinlestirir
    Then kullanici hesabin active edildigini dogrular

  Scenario: TC_006 Admin bir User in hesabini goruntuleyebilir
    And kullanici Admin olarak bir User hesabini goruntuler
    Then kullanici hesabin User hesabini goruntulendigini dogrular

  Scenario: TC_007 Admin bir Employee in hesabini goruntuleyebilir
    And kullanici Admin olarak bir Employee hesabini goruntuler
    Then kullanici hesabin Employee hesabini goruntulendigini dogrular

  Scenario: TC_008 Admin bir Manager in hesabini goruntuleyebilir
    And kullanici Admin olarak bir Manager hesabini goruntuler
    Then kullanici hesabin Manager hesabini goruntulendigini dogrular

  Scenario: TC_009 Admin bir Customer in hesabini goruntuleyebilir
    And kullanici Admin olarak bir Customer hesabini goruntuler
    Then kullanici hesabin Customer hesabini goruntulendigini dogrular

  Scenario: TC_010 Admin bir Admin in hesabini goruntuleyebilir
    And kullanici Admin olarak bir Admin hesabini goruntuler
    Then kullanici hesabin Admin hesabini goruntulendigini dogrular

  Scenario: TC_011 Admin bir User in hesabini duzenleyebilir
    And kullanici Admin olarak bir User hesabinin ismini degistirir
    Then kullanici degisimi dogrular

  Scenario: TC_012 Admin bir Employee in hesabini duzenleyebilir
    And kullanici Admin olarak bir Employee hesabinin ismini degistirir
    Then kullanici degisimi dogrular

  Scenario: TC_013 Admin bir Manager in hesabini duzenleyebilir
    And kullanici Admin olarak bir Manager hesabinin ismini degistirir
    Then kullanici degisimi dogrular

  Scenario: TC_014 Admin bir Customer in hesabini duzenleyebilir
    And kullanici Admin olarak bir Customer hesabinin ismini degistirir
    Then kullanici degisimi dogrular

  Scenario: TC_015 Admin bir Admin in hesabini duzenleyebilir
    And kullanici Admin olarak bir Admin hesabinin ismini degistirir
    Then kullanici degisimi dogrular

  Scenario: TC_016 NegatifTest hesap duzenleme
    And kullanici @ isareti koymadan email degistiremez
    Then kullanici hata mesajini goruntuler

  Scenario: TC_017 hesap silme
    And kullanici Admin olarak bir User hesabini silebilir
    And kullanici gelen mesajdan Cancel e tiklar

  Scenario: TC_018 hesap silme
    And kullanici Admin olarak bir Employee hesabini silebilir
    And kullanici gelen mesajdan Cancel e tiklar
    #kimsenin hesabini silmek istemedim o yuzden cancel diyorum

  Scenario: TC_019 hesap silme
    And kullanici Admin olarak bir Manager hesabini silebilir
    And kullanici gelen mesajdan Cancel e tiklar

  Scenario: TC_020 hesap silme
    And kullanici Admin olarak bir Customer hesabini silebilir
    And kullanici gelen mesajdan Cancel e tiklar

  Scenario: TC_021 hesap silme
    And kullanici Admin olarak bir Admin hesabini silebilir
    And kullanici gelen mesajdan Cancel e tiklar

  Scenario: TC_022 Admin bir Admin in rolunu degistirebilir
    Given kullanici bir Admin satirindaki edit butonuna tiklar
    And kullanici profiles dropdown dan Customer i secer
    And kullanici Save butonuna tiklar
    Then kullanici rolun basariyla degistirildigini dogrular

  Scenario: TC_023 Admin bir User in rolunu degistirebilir
    Given kullanici bir User satirindaki edit butonuna tiklar
    And kullanici profiles dropdown dan Admin i secer
    And kullanici Save butonuna tiklar
    Then kullanici rolun basariyla degistirildigini dogrular

  Scenario: TC_024 Admin bir Employee nin rolunu degistirebilir
    Given kullanici bir Employee satirindaki edit butonuna tiklar
    And kullanici profiles dropdown dan User i secer
    And kullanici Save butonuna tiklar
    Then kullanici rolun basariyla degistirildigini dogrular

  Scenario: TC_25 Admin bir Manager in rolunu degistirebilir
    Given kullanici bir Manager satirindaki edit butonuna tiklar
    And kullanici profiles dropdown dan Employee i secer
    And kullanici Save butonuna tiklar
    Then kullanici rolun basariyla degistirildigini dogrular

