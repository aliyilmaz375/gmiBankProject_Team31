Feature: US_007_System_should_not_allow_to_make_updates_with_invalid_credentials

  Scenario: TC_001_admin_negatif_email
    Given kullanici Admin hesabina girer
    And kullanici profil dropdown menusunden user info secer
    And kullanici admin firstname girer
    And kullanici admin lastname girer
    And kullanici gecersiz email girer
    And kullanici language english secer
    And kullanici Save butonuna basar
    Then kullanici hata mesajini dogrular

  Scenario: TC_001_manager_negatif_email
    Given kullanici manager hesabina girer
    And kullanici profil dropdown menusunden user info secer
    And kullanici manager firstname girer
    And kullanici manager lastname girer
    And kullanici gecersiz email girer
    And kullanici language english secer
    And kullanici Save butonuna basar
    Then kullanici hata mesajini dogrular