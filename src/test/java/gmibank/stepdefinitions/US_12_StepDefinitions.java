package gmibank.stepdefinitions;

import gmibank.pages.US_12_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class US_12_StepDefinitions {

    US_12_Page us_12_page = new US_12_Page();
    SoftAssert softAssert = new SoftAssert();

    @Given("kullanici GMIBank sayfasina gider")
    public void kullanici_gmi_bank_sayfasina_gider() {

    }

    @Then("Insan simgesine tiklar")
    public void insan_simgesine_tiklar() {

    }
    @Then("Valid username girer")
    public void valid_username_girer() {

    }
    @Then("Valid password girer")
    public void valid_password_girer() {

    }
    @Then("Sign in butonuna basar")
    public void sign_in_butonuna_basar() {

    }
    @Then("MyOperations tiklar")
    public void my_operations_tiklar() {
    us_12_page.myOperations.click();
    }
    @Then("Manage Customer tiklar")
    public void manage_customer_tiklar() {
      us_12_page.ManageCustomer.click();
    }
    @Given("manage customer modulunde customer bilgilerinin goruntulendıgını test eder")
    public void manage_customer_modulunde_customer_bilgilerinin_goruntulendıgını_test_eder() {
     for(int i =0; i<us_12_page.birinciSatirTumData.size()-1;i++){
         softAssert.assertTrue(us_12_page.birinciSatirTumData.get(i).toString().isEmpty());
         softAssert.assertAll();
     }

    }

    @And("view butonuna tiklar")
    public void viewButonunaTiklar() {
        us_12_page.viewButon.click();
    }

    @And("Müsteri bilgilerinin gorunurlugunu test eder")
    public void müsteriBilgilerininGorunurlugunuTestEder() {

    }
}
