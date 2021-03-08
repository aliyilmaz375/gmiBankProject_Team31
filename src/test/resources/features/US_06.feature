Feature: US_006_User_info_segment_should_be_editable_on_homepage

  Scenario: TC_001_admin_user_info_duzenleme

    Given kullanici Admin hesabina girer
    And kullanici profil dropdown menusunden user info secer
    And kullanici admin firstname girer
    And kullanici admin lastname girer
    And kullanici admin email girer
    And kullanici language english secer
    And kullanici Save butonuna basar
    Then kullanici kayit mesajini dogrular

  Scenario: TC_002_manager_user_info_duzenleme

    Given kullanici manager hesabina girer
    And kullanici profil dropdown menusunden user info secer
    And kullanici manager firstname girer
    And kullanici manager lastname girer
    And kullanici manager email girer
    And kullanici language english secer
    And kullanici Save butonuna basar
    Then kullanici kayit mesajini dogrular

  Scenario: TC_003_employee_user_info_duzenleme

    Given kullanici employee hesabina girer
    And kullanici profil dropdown menusunden user info secer
    And kullanici employee firstname girer
    And kullanici employee lastname girer
    And kullanici employee email girer
    And kullanici language english secer
    And kullanici Save butonuna basar
    Then kullanici kayit mesajini dogrular

  Scenario: TC_004_customer_user_info_duzenleme

    Given kullanici customer hesabina girer
    And kullanici profil dropdown menusunden user info secer
    And kullanici customer firstname girer
    And kullanici customer lastname girer
    And kullanici customer email girer
    And kullanici language english secer
    And kullanici Save butonuna basar
    Then kullanici kayit mesajini dogrular

  Scenario: TC_005_user_user_info_duzenleme

    Given kullanici user hesabina girer
    And kullanici profil dropdown menusunden user info secer
    And kullanici user firstname girer
    And kullanici user lastname girer
    And kullanici user email girer
    And kullanici language english secer
    And kullanici Save butonuna basar
    Then kullanici kayit mesajini dogrular