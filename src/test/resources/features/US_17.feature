Feature: US_17 Admin kullanicilarin bilgilerini yonetebilmeli

  Scenario: TC_001 Admin bir User in hesabini active edebilir

    Given kullanici Admin hesabina girer
    And kullanici Administration a tiklar
    And kullanici User Management e tiklar
    And kullanici Admin olarak herhangi bir User hesabini etkinlestirir
    Then kullanici hesabin active edildigini dogrular
