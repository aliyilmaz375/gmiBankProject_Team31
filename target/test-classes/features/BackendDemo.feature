Feature: demo feature

  Scenario: read country
    Given kullanici tum ulkeleri okur "https://www.gmibank.com/api/tp-countries"
    And kullanici tum ulke verilerini dogrular


  Scenario: create a country
    And kullanici bir ulke olusturur "https://www.gmibank.com/api/tp-countries"


  #update_country
  Scenario Outline: update country
    And kullanici bir ulkenin id ve name ini degistirebilir "https://www.gmibank.com/api/tp-countries" "<newname>" "<id>"

    Examples: Update country
      |newname|id|
      |Hollanda|90650|

  #delete_country
  Scenario Outline: delete country
    Given kullanici end pointindeki "<endPoint>" id yi siler "<id>"
    Examples: Delete Country
      |endPoint                                |id    |
      |https://www.gmibank.com/api/tp-countries|/90620|

     #database
  Scenario Outline: reading and verifying country information
    Given kullanici GMIBank Database' ine baglanir
    And kullanici bir "<query>" ve "<columnName>" girer
    Then kullanici id'si 24366 olan ulkeyi dogrular

    Examples:
      |query|columnName|
      |SELECT * FROM tp_country|id|


    #pdf demo
  Scenario: applicants pdf
    Given kullanici applicant bilgilerini okur "https://www.gmibank.com/api/tp-account-registrations"
    Then kullanici tum applicant bilgilerini pdf formatinda alir



  #pdf 2
  Scenario: customer bilgileri
    Given kullanici GMIBank Database' ine baglanir
    And kullanici customer bilgilerini alir

