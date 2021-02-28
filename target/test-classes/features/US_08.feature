Feature: US_008_Password_segment_on_Homepage_should_be_editable

  Scenario: TC_001_admin_password_duzenleme
    Given kullanici Admin hesabina girer
    And kullanici profil dropdown menusunden password secer
    And kullanici admin eski password girer
    And kullanici admin yeni password girer
    And kullanici tekrar admin yeni password girer
    And kullanici Save butonuna tiklar
    Then kullanici kayit mesajini dogrular

  Scenario: TC_002_manager_password_duzenleme
    Given kullanici manager hesabina girer
    And kullanici profil dropdown menusunden password secer
    And kullanici manager eski password girer
    And kullanici manager yeni password girer
    And kullanici tekrar manager yeni password girer
    And kullanici Save butonuna tiklar
    Then kullanici kayit mesajini dogrular

  Scenario: TC_003_employee_password_duzenleme
    Given kullanici employee hesabina girer
    And kullanici profil dropdown menusunden password secer
    And kullanici employee eski password girer
    And kullanici employee yeni password girer
    And kullanici tekrar employee yeni password girer
    And kullanici Save butonuna tiklar
    Then kullanici kayit mesajini dogrular

  Scenario: TC_004_customer_password_duzenleme
    Given kullanici customer hesabina girer
    And kullanici profil dropdown menusunden password secer
    And kullanici customer eski password girer
    And kullanici customer yeni password girer
    And kullanici tekrar customer yeni password girer
    And kullanici Save butonuna tiklar
    Then kullanici kayit mesajini dogrular

  Scenario: TC_005_user_password_duzenleme
    Given kullanici user hesabina girer
    And kullanici profil dropdown menusunden password secer
    And kullanici user eski password girer
    And kullanici user yeni password girer
    And kullanici tekrar user yeni password girer
    And kullanici Save butonuna tiklar
    Then kullanici kayit mesajini dogrular