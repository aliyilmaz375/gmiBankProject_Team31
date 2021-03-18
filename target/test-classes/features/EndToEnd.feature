
Feature: US_01 Register

  @e2e
  Scenario: TC_001 register pozitif test
    Given kulllanici anasayfaya gider
    And kullanici sag ustteki simgeye tiklar
    And kullanici Register a tiklar
    And kullanici SSN textboxina "080-80-8089" numarasini girer
    And kullanici First Name textboxina "werty" ismini girer
    And kullanici Last Name textboxina "werty" soyismini girer
    And kullanici Address textboxina "werty"  adresini girer
    And kullanici Mobile Phone Number textboxina "123-456-7890" cep telefonu numarasini girer
    And kullanici Username textboxina  "werty021" kullanici adini girer
    And kullanici Email textboxina "werty021@gmail.com" mail adresini girer
    And kullanici New password textboxina "werty55." sifresini girer
    And kullanici New password confirmation textboxina "werty55." sifresini girer
    And kullanici Register butonuna tiklar

    # Admin hesabina giris ve son kullaniciyi aktive etme
    # Given kulllanici anasayfaya gider
    And kullanici sag ustteki simgeye tiklar
    And kullanici Sign In tiklar
    And kullanici username olarak "Admin31" girer
    And kullanici password olarak "Admin31." girer
    And kullanici Sign In butonuna tiklar
    And kullanici Administration a tiklar
    And kullanici User Management e tiklar
    And kullanici son sayfaya gider
    And kullanici son kayittaki Edit Butonuna tiklar
    And kullanici activated tiklar
    And kullanici Save butonuna tiklar
    And kullanici admin sayfasindan cikar

    #employee e giris
    And kullanici sag ustteki simgeye tiklar
    And kullanici Sign In tiklar
    And kullanici username olarak "Employee31" girer
    And kullanici password olarak "Employee31." girer
    And kullanici Sign In butonuna tiklar

    # Scenario: 1 inci hesabi olusturma
    When kullanici My Operations a tiklar
    And kullanici Manage Accounts a tiklar
    And kullanici create a new account a tiklar
    And kullanici Description textbox ina birinci hesap icin description girer
    And kullanici Balance textbox ina bir balance girer
    And kullanici Account Type ini secer
    And kullanici Account Status Type ini secer
    And kullanici Create Date secer
    And kullanici Close Date secer
    And kullanici save butonuna tiklar

    # Scenario: 2 nci hesabi olusturma
    And kullanici create a new account a tiklar
    And kullanici Description textbox ina ikinci hesap icin description girer
    And kullanici Balance textbox ina bir balance girer
    And kullanici Account Type ini secer
    And kullanici Account Status Type ini secer
    And kullanici Create Date secer
    And kullanici Close Date secer
    And kullanici save butonuna tiklar


    #employee customer icin hesap tanimlama
    And kullanici My Operations a tiklar
    And kullanici Manage Customer i tiklar
    And kullanici create a new customer i tiklar
    And Kullanici SSN search textboxina "080-80-8089" numarasini girer
    And kullanici search butonuna tiklar
    And kullanici diger zorunlu alanlari doldurur
    And kullanici Account dropdown dan iki hesap secer
    And kullanici save customer butonuna tiklar
    And kullanici sayfayi kapatir

    @e2e
    Scenario: Customer hesabina giris
    Given kulllanici anasayfaya gider
    And kullanici sag ustteki simgeye tiklar
    And kullanici Sign In tiklar
    And kullanici username olarak "werty021" girer
    And kullanici password olarak "werty55." girer
    And kullanici Sign In butonuna tiklar
    And kullanici My Operations a tiklar
    And kullanici My Accounts'a tiklar
    And kullanici My Operations a tiklar
    And kullanici Transfer Money'e tiklar
    And kullanici from dropDown'indan bir hesap secer
    And kullanici to dropDown'indan bir hesap secer
    And Balance kismina gecerli bir para miktarini yazar
    And Description kismina aciklama yazar
    And Make Transfer butonuna tiklar
    And kullanici My Operations a tiklar
    And kullanici My Accounts'a tiklar
    And kullanici bir View Transaction butonuna tiklar
    And kullanici w hesabindan cikis yapar
    And kullanici home page tiklar
    And kullanici sayfayi kapatir








