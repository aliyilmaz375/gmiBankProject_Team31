Feature: State bilgilerini okuma

  Scenario: Tum state bilgilerini okuma ve dogrulama
    Given Kullanici state end point e gider  "https://www.gmibank.com/api/tp-states"
    And Kullanici verileri De-Serialization formatinda alir
    Then Kullanici bir state ismini dogrular
