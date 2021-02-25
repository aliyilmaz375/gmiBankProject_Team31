Feature: US_16 Kullanici hesaplari arasinda para transferi yapabilir

  Background:
    Given kulllanici anasayfaya gider
    And kullanici sag ustteki simgeye tiklar
    And kullanici Sign In tiklar
    And kullanici username olarak "Customer55" girer
    And kullanici password olarak "Customer55." girer
    And kullanici Sign In butonuna tiklar
    And kullanici My Operations'a tiklar
    And kullanici My Accounts'a tiklar

  Scenario: TC_001 Kullanici basarili bir sekilde hesaplari arasinda para transferi yapabilir
    And From DropDown'indan bir hesap secer
    And To DropDown'indan bir hesap secer
    And Balance kismina gecerli bir para miktarini yazar
    And Description kismina aciklama yazar
    And Make Transfer butonuna tiklar
    Then kullanici para transferi yapildigini dogrular

  Scenario: TC_002 Kullanici hesabinda olan paradan fazlasini gonderemez
    And From DropDown'indan bir hesap secer
    And To DropDown'indan bir hesap secer
    And Balance kismina hesaptaki paradan fazla bir tutar girer
    And Description kismina aciklama yazar
    And Make Transfer butonuna tiklar
    Then kullanici balance exceed hata mesaji aldigini dogrular

  Scenario: TC_003 Kullanici 5 rakamdan fazla para miktari gonderemez
    And From DropDown'indan bir hesap secer
    And To DropDown'indan bir hesap secer
    And Balance kismina bes rakamdan fazla para miktari yazar
    And Description kismina aciklama yazar
    And Make Transfer butonuna tiklar
    Then kullanici max caracter hata mesaji aldigini dogrular

  Scenario: Kullanici para transferi yaparken aciklama kismini bos birakamaz
    

