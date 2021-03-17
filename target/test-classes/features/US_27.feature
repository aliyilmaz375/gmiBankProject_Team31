Feature: US_27

  Scenario Outline: delete country
    Given kullanici end pointindeki "<endPoint>" bir state ait id yi siler "<id>"

    Examples: Delete Country
      |endPoint                                |id    |
      |https://www.gmibank.com/api/tp-states|/90515|