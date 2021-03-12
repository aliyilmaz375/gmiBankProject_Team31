Feature: US_26 Sistem kullaniciya bir ulkeyi update etme izni vermeli

  Scenario Outline: ulke update etme
    Given kullanici end pointe gider "https://www.gmibank.com/api/tp-countries"
    And kullanici bir ulkenin id ve name ini degistirebilir "https://www.gmibank.com/api/tp-countries" "<newname>" "<id>"

    Examples:
      |     newname       | id  |
      |     Hollanda31    | 0  |

