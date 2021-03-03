package gmibank.stepdefinitions;

import gmibank.pages.US_05_Page;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class US_05_Stepdefinitions {

    US_05_Page us05Page = new US_05_Page();

    @Given("kullanici yanlis bir {string} girer")
    public void kullanici_e_ait_username_girer(String string) {

        // us05Page.username.sendKeys(string);
        Driver.waitAndSendText(us05Page.username,string,3);
    }

    @And("kullanici yanlis {string} girer")
    public void kullaniciYanlisGirer(String string) {

        //us05Page.password.sendKeys(string);
        Driver.waitAndSendText(us05Page.password,string,3);
    }

    @Then("kullanici hata mesajini gorur")
    public void kullaniciHataMesajiniGorur() {
        Assert.assertTrue(us05Page.hataMesaji.isDisplayed());
    }
}
