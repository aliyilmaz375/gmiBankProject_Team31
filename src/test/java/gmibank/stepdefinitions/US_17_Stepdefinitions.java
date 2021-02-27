package gmibank.stepdefinitions;


import gmibank.pages.US_17_Page;
import gmibank.utilities.Driver;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;


public class US_17_Stepdefinitions {

    US_17_Page us17Page = new US_17_Page();
    Actions actions = new Actions(Driver.getDriver());

    @Given("kullanici Admin hesabina girer")
    public void kullaniciHesabinaGirer() {
        ReusableMethods.adminLogin();
    }

    @Given("kullanici Administration a tiklar")
    public void kullanici_administration_a_tiklar() {
        us17Page.administration.click();
    }

    @Given("kullanici User Management e tiklar")
    public void kullanici_user_management_e_tiklar() {
        us17Page.userManagement.click();
    }

    @Given("kullanici Admin olarak herhangi bir User hesabini etkinlestirir")
    public void kullanici_admin_olarak_herhangi_bir_user_hesabini_etkinlestirir()  {

    }

    @Then("kullanici hesabin active edildigini dogrular")
    public void kullanici_active_edildigini_dogrular() {

    }
}
