package gmibank.stepdefinitions;

import gmibank.pages.US_06_Page;
import gmibank.pages.US_07_Page;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US_07_Stepdefinitions {

    US_06_Page us6page = new US_06_Page();
    US_07_Page us7page = new US_07_Page();


    @Given("kullanici gecersiz email girer")
    public void kullanici_gecersiz_email_girer() {
        us6page.email.clear();
        us6page.email.sendKeys(ConfigReader.getProperty("06gecersiz_mail"));
    }

    @Then("kullanici mail hata mesajini dogrular")
    public void kullanici_mail_hata_mesajini_dogrular() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(us7page.hataMesajiEmail.isDisplayed());
        Driver.closeDriver();
    }
    @Given("kullanici firstname bos birakir")
    public void kullanici_firstname_bos_birakir() {
        us6page.firstName.clear();
    }
    @Then("kullanici isim hata mesajini dogrular")
    public void kullanici_isim_hata_mesajini_dogrular() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(us7page.hataMesajiIsim.isDisplayed());
        Driver.closeDriver();
    }
    @Given("kullanici lastname bos birakir")
    public void kullanici_lastname_bos_birakir() {
        us6page.lastName.clear();
    }

}
