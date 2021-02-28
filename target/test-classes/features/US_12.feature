
Feature: An Employee can manage Customer

  Background:
    Given kulllanici anasayfaya gider
    And kullanici sag ustteki simgeye tiklar
    And kullanici Sign In tiklar
    And kullanici username olarak "Employee31" girer
    And kullanici password olarak "Employee31." girer
    And kullanici Sign In butonuna tiklar
    Given kullanici My Operation i tiklar
    And kullanici Manage Customer i tiklar

  Scenario: TC_001_Customer_Information_canbe_shown
    And manage customer modulunde customer bilgilerinin goruntulendıgını test eder


<<<<<<< HEAD
  Scenario: TC_002_There_should_be_view_option where customer can be navigated to all customer info
    And view butonuna tiklar
    And Müsteri bilgilerinin gorunurlugunu test eder
    And Edit butonunun gorunurlugunu test eder

  Scenario: TC_003_Assertion_of_the_edit_button_is_displayed_where_all_customer_information_can_be_populated
    And User Infodaki edit butonunun gorunurlugunu test eder

  Scenario: TC_004_Positive_assert_the_user_info_if_they_are_updated
    And Edit butonuna basar
    And  first name update eder "Burcu"
    And last name update eder "Gunes"
    And middle initial update eder "Elif"
    And Email update eder "brcgns@gmail.com"
    And Mobile Phone Number update eder "345-789-7812"
    And Phone Number update eder "234-345-4515"
    And address update eder "Ankara"
    And Save butonuna basar
    And update olup olmadıgını test eder

  Scenario: TC_005__Positive_assert_the_user_info_if_firstName_is_updated
    And Edit butonuna basar
    And  first name update eder "Gulsen"
    And Save butonuna basar
    And first name update oldugunu test eder

  Scenario: TC_006__Positive_assert_the_user_info_if_lastName_is_updated
    And Edit butonuna basar
    And  last name update eder "Kaya"
    And Save butonuna basar
    And last name update oldugunu test eder

  Scenario: TC_007__Positive_assert_the_user_info_if_Email_is_updated
    And Edit butonuna basar
    And Email update eder "glsnky@gmail.com"
    And Save butonuna basar
    And Email "glsnky@gmail.com" update oldugunu test eder

  Scenario: TC_008__Positive_assert_the_user_info_if_Email_and_MiddleInitial_are_updated
    And Edit butonuna basar
    And Email update eder "gunes@gmail.com"
    And middle initial update eder "Beril"
    And Save butonuna basar
    And Email "gunes@gmail.com" update oldugunu test eder
    And Middle Initial update oldugunu test eder


  Scenario: TC_009_Negative_assert_the_user_info_if_they_are_not_updated_when_a_mandatory_field_is_blank
    And Edit butonuna basar
    And  first name update eder "Hale"
    And last name update eder ""
    And middle initial update eder "Elif"
    And Email update eder "brcgns@gmail.com"
    And Mobile Phone Number update eder "345-789-7812"
    And Phone Number update eder "234-345-4515"
    And address update eder "Ankara"
    And Save butonuna basar
    And bos bırakılan alan oldugunda kayıt olmadıgını test eder

  Scenario: TC_010_Negative_assert_the_user_info_if_they_are_not_updated_when_a_mandatory_field_is_blank
    And Edit butonuna basar
    And  first name update eder "Hale"
    And last name update eder "Aydın"
    And middle initial update eder "Elif"
    And Email update eder ""
    And Mobile Phone Number update eder "345-789-7812"
    And Phone Number update eder "234-345-4515"
    And address update eder "Ankara"
    And Save butonuna basar
    And bos bırakılan alan oldugunda kayıt olmadıgını test eder

  Scenario: TC_011_User_can_delete_a_customer_but_seeing_a_message_if_the_user_is_sure_about_deletion
    And Delete butonuna basar
    And Confirm delete mesajı goruntulenır
    And Confirm mesajındaki delete butonuna basar
    And Silme isleminin gerceklestigini test eder
=======
  Scenario: TC_002_ There_should_be_view_option where customer can be navigated to all customer info
    And view butonuna tiklar
    And Müsteri bilgilerinin gorunurlugunu test eder
>>>>>>> main
