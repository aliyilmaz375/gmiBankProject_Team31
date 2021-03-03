Feature: US_09_SSN_numarasi_girerek_bilgileri_getirme


Background:
  Given kulllanici anasayfaya gider
  And kullanici sag ustteki simgeye tiklar
  And kullanici Sign In tiklar
  And kullanici username olarak "Employee31" girer
  And kullanici password olarak "Employee31." girer
  And kullanici Sign In butonuna tiklar


  Scenario: TC_01_admin_user_info_duzenleme


    And kullanici Myoperations a basar
    And kullanici Manage Customers a basar
    And kullanici Create a new Customers a basar
    And kullanici SSN e veriyi girer
    And kullanici Search butonuna basar
    And kullanici Save butonuna basar
    
















