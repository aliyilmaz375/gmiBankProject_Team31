package gmibank.stepdefinitions;

import gmibank.pages.US_04_Page;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class US_04_Stepdefinitions {

    US_04_Page us04Page = new US_04_Page();

    @Given("kulllanici anasayfaya gider")
    public void kulllanici_anasayfaya_gider() {

        Driver.getDriver().get("https://gmibank.com/");
    }

    @Given("kullanici sag ustteki simgeye tiklar")
    public void kullanici_sag_ustteki_simgeye_tiklar() {

        us04Page.svgIcon.click();
    }

    @Given("kullanici Sign In tiklar")
    public void kullanici_sign_in_tiklar() {

        us04Page.signIn.click();
    }

    @Given("kullanici username olarak {string} girer")
    public void kullanici_username_olarak_girer(String string) {

        Driver.waitAndSendText(us04Page.username,string,3);
    }

    @Given("kullanici password olarak {string} girer")
    public void kullanici_password_olarak_girer(String string) {

        Driver.waitAndSendText(us04Page.password,string,3);
    }

    @Given("kullanici Sign In butonuna tiklar")
    public void kullanici_sign_in_butonuna_tiklar() {

        us04Page.signInButton.click();
    }

    @And("kullanici ExitArea a tiklar")
    public void kullaniciExitAreaATiklar() {
        us04Page.exitArea.click();
    }

    @And("kullanici Sign Out a tiklar")
    public void kullaniciSignOutATiklar() throws InterruptedException {

        us04Page.SignOut.click();
        Thread.sleep(3000);

    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici employee sayfasinda oldugunu dogrular")
    public void kullaniciEmployeeSayfasindaOldugunuDogrular() {

        Assert.assertTrue(us04Page.kullaniciIsmi.isDisplayed());
    }
}
