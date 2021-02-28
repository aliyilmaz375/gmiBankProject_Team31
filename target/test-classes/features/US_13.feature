Feature:US_13 An employee can create a new account

  Background:
    Given kulllanici anasayfaya gider
    And kullanici sag ustteki simgeye tiklar
    And kullanici Sign In tiklar
    And kullanici username olarak "Employee31" girer
    And kullanici password olarak "Employee31." girer
    And kullanici Sign In butonuna tiklar

    Given kullanici My Operation i tiklar
    And kullanici Manage Account'a   tiklar
    And Kullanici  +Create a new Account'a  tiklar

  Scenario: TC_001  Pozitif Test 1
    And Kullanici Description textboxuna "Vip Müsteri" açıklmasını girer
    And Kullanıcı Balance butonuna  "150" girer
    And Kullanıcı Account Type drop down'dan "CHECKİNG" i secer
    And Kullanıcı Account Status Type drop down'dan "ACTIVE" e secer
    And Kullanıcı Create Date butonuna "12/04/2019 10:12"  tarihini girer
    And Kullanici Closed Date butonuna "15/09/2021 11:02" tarihini girer
    And Kullanici save butonuna basar
    Then Hata mesaji gormez


  Scenario: TC_002  Pozitif Test 2
    And Kullanici Description textboxuna "Vip Müsteri" açıklmasını girer
    And Kullanıcı Balance butonuna  "150" girer
    And Kullanıcı Account Type drop downindan "SAVİNG" i secer
    And Kullanıcı Account Status Type drop down'dan "ACTIVE" e secer
    And Kullanıcı Create Date butonuna "12/04/2019 10:12"  tarihini girer
    And Kullanici Closed Date butonuna "15/09/2021 11:02" tarihini girer
    And Kullanici save butonuna basar
    Then Hata mesaji gormez


  Scenario: TC_003  Pozitif Test 3
    And Kullanici Description textboxuna "Vip Müsteri" açıklmasını girer
    And Kullanıcı Balance butonuna  "150" girer
    And Kullanıcı Account Type dropdownından  "CREDIT_CART" i secer
    And Kullanıcı Account Status Type drop down'dan "ACTIVE" e secer
    And Kullanıcı Create Date butonuna "12/04/2019 10:12"  tarihini girer
    And Kullanici Closed Date butonuna "15/09/2021 11:02" tarihini girer
    And Kullanici save butonuna basar
    Then Hata mesaji gormez

  Scenario: TC_004  Pozitif Test 4
    And Kullanici Description textboxuna "Vip Müsteri" açıklmasını girer
    And Kullanıcı Balance butonuna  "150" girer
    And Kullanıcı Account Type drop downin'dan "INVESTING" i secer
    And Kullanıcı Account Status Type drop down'dan "ACTIVE" e secer
    And Kullanıcı Create Date butonuna "12/04/2019 10:12"  tarihini girer
    And Kullanici Closed Date butonuna "15/09/2021 11:02" tarihini girer
    And Kullanici save butonuna basar
    Then Hata mesaji gormez

  Scenario: TC_005  Pozitif Test 5
    And Kullanici Description textboxuna "Vip Müsteri" açıklmasını girer
    And Kullanıcı Balance butonuna  "150" girer
    And Kullanıcı Account Type drop down'dan "INVESTING" i secer
    And Kullanıcı Account Status Type drop downin'dan "SUESPENDED" e secer
    And Kullanıcı Create Date butonuna "12/04/2019 10:12"  tarihini girer
    And Kullanici Closed Date butonuna "15/09/2021 11:02" tarihini girer
    And Kullanici save butonuna basar
    Then Hata mesaji gormez

  Scenario: TC_006  Pozitif Test 6
    And Kullanici Description textboxuna "Vip Müsteri" açıklmasını girer
    And Kullanıcı Balance butonuna  "150" girer
    And Kullanıcı Account Type drop down'dan "INVESTING" i secer
    And Kullanıcı Account Status Type dropdown'dan "CLOSED" e secer
    And Kullanıcı Create Date butonuna "12/04/2019 10:12"  tarihini girer
    And Kullanici Closed Date butonuna "15/09/2021 11:02" tarihini girer
    And Kullanici save butonuna basar
    Then Hata mesaji gormez


  Scenario: TC_007  Negatif Test 1
    And Kullanici Description textboxuna bos birakir
    And Kullanıcı Balance butonuna  "150" girer
    And Kullanıcı Account Type drop down'dan "INVESTING" i secer
    And Kullanıcı Account Status Type drop down'dan "CLOSED" e secer
    And Kullanıcı Create Date butonuna "12/04/2019 10:12"  tarihini girer
    And Kullanici Closed Date butonuna "15/09/2021 11:02" tarihini girer
    And Kullanici save butonuna basar
    Then Hata mesaji gorur


  Scenario: TC_008  Negatif Test 2
    And Kullanici Description textboxuna "Vip Müsteri" açıklmasını girer
    And Kullanıcı Balance butonunu bos birakir
    And Kullanıcı Account Type drop down'dan "INVESTING" i secer
    And Kullanıcı Account Status Type drop down'dan "CLOSED" e secer
    And Kullanıcı Create Date butonuna "12/04/2019 10:12"  tarihini girer
    And Kullanici Closed Date butonuna "15/09/2021 11:02" tarihini girer
    And Kullanici save butonuna basar
    Then Hata mesaji gormez


  Scenario: TC_009  Pozitif Test 6
    And Kullanici Description textboxuna "Vip Müsteri" açıklmasını girer
    And Kullanıcı Balance butonuna  harflerden olusan bir string girer
    And Kullanıcı Account Type drop down'dan "INVESTING" i secer
    And Kullanıcı Account Status Type drop down'dan "CLOSED" e secer
    And Kullanıcı Create Date butonuna "12/04/2019 10:12"  tarihini girer
    And Kullanici Closed Date butonuna "15/09/2021 11:02" tarihini girer
    And Kullanici save butonuna basar
    Then Hata mesaji gormez

