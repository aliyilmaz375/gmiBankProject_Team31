package gmibank.stepdefinitions;

import gmibank.pages.US_13_Page;
import gmibank.utilities.Driver;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class US_13_Stepdefinitions {
    US_13_Page us13Page = new US_13_Page();



    @Given("kullanici Manage Account'a   tiklar")
    public void kullanici_manage_account_a_tiklar() throws InterruptedException {
      us13Page.manageAccounts.click();

    }
        @Given("Kullanici  +Create a new Account'a  tiklar")
    public void kullanici_create_a_new_account_a_tiklar()  {
            ReusableMethods.waitFor(5);
        us13Page.createAccount.click();

    }

    @Given("Kullanici Description textboxuna {string} açıklmasını girer")
    public void kullanici_description_textboxuna_açıklmasını_girer(String string) {
      us13Page.description.sendKeys("Vip Müsteri");

    }
    @Given("Kullanici Description textboxuna bos birakir")
    public void kullanici_description_textboxuna_bos_birakir() {
     us13Page.description.click();
    }


    @Given("Kullanıcı Balance butonuna  {string} girer")
    public void kullanıcı_balance_butonuna_girer(String string) {
       us13Page.balance.sendKeys("150");

    }

    @Given("Kullanıcı Balance butonunu bos birakir")
    public void kullanıcı_balance_butonunu_bos_birakir() {
       us13Page.balance.click();
    }

    @Given("Kullanıcı Balance butonuna  harflerden olusan bir string girer")
    public void kullanıcı_balance_butonuna_harflerden_olusan_bir_string_girer() {
        us13Page.balance.sendKeys("musteri");
    }



    @Given("Kullanıcı Account Type drop down'dan {string} i secer")
    public void kullanıcı_account_type_drop_down_dan_i_secer(String string) throws InterruptedException {
        Thread.sleep(2000);
        Select select = new Select(us13Page.accountType);
        select.selectByIndex(0);
    }

    @Given("Kullanıcı Account Type drop downindan {string} i secer")
    public void kullanıcı_account_type_drop_downindan_i_secer(String string) throws InterruptedException {
        Thread.sleep(2000);
        Select select = new Select(us13Page.accountType);
        select.selectByIndex(1);
    }
    @Given("Kullanıcı Account Type dropdownından  {string} i secer")
    public void kullanıcı_account_type_dropdownından_i_secer(String string) throws InterruptedException {
        Thread.sleep(2000);
        Select select = new Select(us13Page.accountType);
        select.selectByIndex(2);
    }
    @Given("Kullanıcı Account Type drop downin'dan {string} i secer")
    public void kullanıcı_account_type_drop_downin_dan_i_secer(String string) throws InterruptedException {
        Thread.sleep(2000);
        Select select = new Select(us13Page.accountType);
        select.selectByIndex(3);
    }






    @Given("Kullanıcı Account Status Type drop down'dan {string} e secer")
    public void kullanıcı_account_status_type_drop_down_dan_e_secer(String string) throws InterruptedException {
        Thread.sleep(2000);
        Select select = new Select(us13Page.accountStatusType);
        select.selectByIndex(0);

    }
    @Given("Kullanıcı Account Status Type drop downin'dan {string} e secer")
    public void kullanıcı_account_status_type_drop_downin_dan_e_secer(String string) throws InterruptedException {
        Thread.sleep(2000);
        Select select = new Select(us13Page.accountStatusType);
        select.selectByIndex(1);

    }
    @Given("Kullanıcı Account Status Type dropdown'dan {string} e secer")
    public void kullanıcı_account_status_type_dropdown_dan_e_secer(String string) throws InterruptedException {
        Thread.sleep(2000);
        Select select = new Select(us13Page.accountStatusType);
        select.selectByIndex(2);
    }



    @Given("Kullanıcı Create Date butonuna {string}  tarihini girer")
    public void kullanıcı_create_date_butonuna_tarihini_girer(String string) throws InterruptedException {
        Thread.sleep(3000);
        us13Page.createDate.sendKeys("12/04/2019" + Keys.TAB);
        us13Page.createDate.sendKeys("10:12");
    }

    @Given("Kullanici Closed Date butonuna {string} tarihini girer")
    public void kullanici_closed_date_butonuna_tarihini_girer(String string) throws InterruptedException {
        Thread.sleep(3000);
            us13Page.closeDate.sendKeys("15/09/2021"+Keys.TAB);
            us13Page.closeDate.sendKeys("11:02");

    }




    @Given("Kullanici save butonuna basar")
    public void kullanici_save_butonuna_basar() {
      us13Page.saveButonu.click();
    }

    @Then("Hata mesaji gormez")
    public void hata_mesaji_gormez() {


    }

    @Then("Hata mesaji gorur")
    public void hata_mesaji_gorur() {
        Assert.assertTrue(us13Page.hataMesaji.isDisplayed());
    }


}
