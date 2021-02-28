Feature: US_007_System_should_not_allow_to_make_updates_with_invalid_credentials

  Scenario: TC_001_admin_negatif_email
    Given kullanici Admin hesabina girer
    And kullanici profil dropdown menusunden user info secer
    And kullanici admin firstname girer
    And kullanici admin lastname girer
    And kullanici gecersiz email girer
    And kullanici language english secer
    And kullanici Save butonuna basar
    Then kullanici mail hata mesajini dogrular

  Scenario: TC_002_manager_negatif_email
    Given kullanici manager hesabina girer
    And kullanici profil dropdown menusunden user info secer
    And kullanici manager firstname girer
    And kullanici manager lastname girer
    And kullanici gecersiz email girer
    And kullanici language english secer
    And kullanici Save butonuna basar
    Then kullanici mail hata mesajini dogrular

  Scenario: TC_003_employee_negatif_email
    Given kullanici employee hesabina girer
    And kullanici profil dropdown menusunden user info secer
    And kullanici employee firstname girer
    And kullanici employee lastname girer
    And kullanici gecersiz email girer
    And kullanici language english secer
    And kullanici Save butonuna basar
    Then kullanici mail hata mesajini dogrular

  Scenario: TC_004_customer_negatif_email
    Given kullanici customer hesabina girer
    And kullanici profil dropdown menusunden user info secer
    And kullanici customer firstname girer
    And kullanici customer lastname girer
    And kullanici gecersiz email girer
    And kullanici language english secer
    And kullanici Save butonuna basar
    Then kullanici mail hata mesajini dogrular

  Scenario: TC_005_user_negatif_email
    Given kullanici user hesabina girer
    And kullanici profil dropdown menusunden user info secer
    And kullanici user firstname girer
    And kullanici user lastname girer
    And kullanici gecersiz email girer
    And kullanici language english secer
    And kullanici Save butonuna basar
    Then kullanici mail hata mesajini dogrular

#===================================

  Scenario: TC_006_admin_negatif_firstname
    Given kullanici Admin hesabina girer
    And kullanici profil dropdown menusunden user info secer
    And kullanici firstname bos birakir
    And kullanici admin lastname girer
    And kullanici admin email girer
    And kullanici language english secer
    And kullanici Save butonuna basar
    Then kullanici isim hata mesajini dogrular

  Scenario: TC_007_manager_negatif_firstname
    Given kullanici manager hesabina girer
    And kullanici profil dropdown menusunden user info secer
    And kullanici firstname bos birakir
    And kullanici manager lastname girer
    And kullanici manager email girer
    And kullanici language english secer
    And kullanici Save butonuna basar
    Then kullanici isim hata mesajini dogrular

  Scenario: TC_008_employee_negatif_firstname
    Given kullanici employee hesabina girer
    And kullanici profil dropdown menusunden user info secer
    And kullanici firstname bos birakir
    And kullanici employee lastname girer
    And kullanici employee email girer
    And kullanici language english secer
    And kullanici Save butonuna basar
    Then kullanici isim hata mesajini dogrular

  Scenario: TC_009_customer_negatif_firstname
    Given kullanici customer hesabina girer
    And kullanici profil dropdown menusunden user info secer
    And kullanici firstname bos birakir
    And kullanici customer lastname girer
    And kullanici customer email girer
    And kullanici language english secer
    And kullanici Save butonuna basar
    Then kullanici isim hata mesajini dogrular

  Scenario: TC_010_user_negatif_firstname
    Given kullanici user hesabina girer
    And kullanici profil dropdown menusunden user info secer
    And kullanici firstname bos birakir
    And kullanici user lastname girer
    And kullanici user email girer
    And kullanici language english secer
    And kullanici Save butonuna basar
    Then kullanici isim hata mesajini dogrular

    #===================================

  Scenario: TC_011_admin_negatif_lastname
    Given kullanici Admin hesabina girer
    And kullanici profil dropdown menusunden user info secer
    And kullanici admin firstname girer
    And kullanici lastname bos birakir
    And kullanici admin email girer
    And kullanici language english secer
    And kullanici Save butonuna basar
    Then kullanici isim hata mesajini dogrular

  Scenario: TC_012_manager_negatif_lastname
    Given kullanici manager hesabina girer
    And kullanici profil dropdown menusunden user info secer
    And kullanici manager firstname girer
    And kullanici lastname bos birakir
    And kullanici manager email girer
    And kullanici language english secer
    And kullanici Save butonuna basar
    Then kullanici isim hata mesajini dogrular

  Scenario: TC_013_employee_negatif_lastname
    Given kullanici employee hesabina girer
    And kullanici profil dropdown menusunden user info secer
    And kullanici employee firstname girer
    And kullanici lastname bos birakir
    And kullanici employee email girer
    And kullanici language english secer
    And kullanici Save butonuna basar
    Then kullanici isim hata mesajini dogrular

  Scenario: TC_014_customer_negatif_lastname
    Given kullanici customer hesabina girer
    And kullanici profil dropdown menusunden user info secer
    And kullanici customer firstname girer
    And kullanici lastname bos birakir
    And kullanici customer email girer
    And kullanici language english secer
    And kullanici Save butonuna basar
    Then kullanici isim hata mesajini dogrular

  Scenario: TC_015_user_negatif_lastname
    Given kullanici user hesabina girer
    And kullanici profil dropdown menusunden user info secer
    And kullanici user firstname girer
    And kullanici lastname bos birakir
    And kullanici user email girer
    And kullanici language english secer
    And kullanici Save butonuna basar
    Then kullanici isim hata mesajini dogrular