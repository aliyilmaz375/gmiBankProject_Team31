package gmibank.stepdefinitions;


import gmibank.pages.US_09_Page;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;


public class US_09_Stepdefinitions {


    US_09_Page us09page = new US_09_Page();
    Actions actions = new Actions(Driver.getDriver());

    @Given("kullanici sayfaya gider")
    public void kullanici_sayfaya_gider() {

        Driver.getDriver().get("https://gmibank.com/");

    }



    @Given("kullanici ustteki dropdown simgesine basar")
    public void kullanici_ustteki_dropdown_simgesine_basar() {

    us09page.svgIcon.click();

    }


    @Given("kullanici Signin e tiklar")
    public void kullanici_Signin_e_tiklar() {

     us09page.signIn.click();


    }

    @Given("kullanici username {string}i yazar")
    public void kullanici_username_yazar(String string) {

    us09page.username.sendKeys("Employee31");

    }

    @Given("kullanici password {string}i yazar")
    public void kullanici_password_yazar(String string) {

    us09page.password.sendKeys("Employee31.");

    }


    @Given("kullanici Signin butonuna basar")
    public void kullanici_Signin_butonuna_basar() {

    us09page.signInButton.click();


    }


    @Given("kullanici Myoperations a basar")
    public void kullanici_Myoperations_a_basar() {

        us09page.Myoperation.click();

    }


    @Given("kullanici Manage Customers a basar")
    public void kullanici_Manage_Customers_a_basar() {

        us09page.ManageCustomers.click();


    }




    @Given("kullanici Create a new Customers a basar")
    public void kullanici_Create_a_new_Customers_a_basar() {

        us09page.CreateanewCustomer.click();


    }



    @Given("kullanici SSN e veriyi girer")
    public void kullanici_SSN_e_veriyi_girer() {

    us09page.SSN.sendKeys("777-31-7777");
    }




    @Given("kullanici Search butonuna basar")
    public void kullanici_Search_butonuna_basar() {

    us09page.search.click();
    }



}




















