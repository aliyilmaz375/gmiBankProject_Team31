package gmibank.stepdefinitions;

import gmibank.pages.EndToEnd_Page;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.Driver;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class EndToEnd_Stepdefinitions {

    EndToEnd_Page endToEndPage = new EndToEnd_Page();
    Actions actions = new Actions(Driver.getDriver());

    @Given("kullanici Register a tiklar")
    public void kullanici_Register_a_tiklar() {


        Driver.waitAndClick(endToEndPage.registerMenuLink, 2);
    }

    @Given("kullanici SSN textboxina {string} numarasini girer")
    public void kullanici_SSN_textboxina_numarasini_girer(String string) {

        ReusableMethods.waitFor(2);
        endToEndPage.ssnTextbox.sendKeys(string);
    }

    @Given("kullanici First Name textboxina {string} ismini girer")
    public void kullanici_First_Name_textboxina_ismini_girer(String string) {


        Driver.waitAndSendText(endToEndPage.firstnameTextbox,string,2);
    }


    @Given("kullanici Last Name textboxina {string} soyismini girer")
    public void kullanici_Last_Name_textboxina_soyismini_girer(String string) {

        Driver.waitAndSendText(endToEndPage.lastnameTextbox,string,2);
    }


    @Given("kullanici Address textboxina {string}  adresini girer")
    public void kullanici_Address_textboxina_adresini_girer(String string) {

        Driver.waitAndSendText(endToEndPage.addressTextbox,string,2);
    }


    @Given("kullanici Mobile Phone Number textboxina {string} cep telefonu numarasini girer")
    public void kullanici_Mobile_Phone_Number_textboxina_cep_telefonu_numarasini_girer(String string) {
        ReusableMethods.waitFor(2);
        endToEndPage.mobilePhoneTextbox.sendKeys(string);
    }


    @Given("kullanici Username textboxina  {string} kullanici adini girer")
    public void kullanici_Username_textboxina_kullanici_adini_girer(String string) {

        ReusableMethods.waitFor(2);

        endToEndPage.usernameTextbox.sendKeys(string);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }


    @Given("kullanici Email textboxina {string} mail adresini girer")
    public void kullanici_Email_textboxina_mail_adresini_girer(String string) {

        endToEndPage.emailTextbox.sendKeys(string);
    }

    @Given("kullanici New password textboxina {string} sifresini girer")
    public void kullanici_New_password_textboxina_sifresini_girer(String string) {
        endToEndPage.firstPasswordTextbox.sendKeys(string);
    }

    @Given("kullanici New password confirmation textboxina {string} sifresini girer")
    public void kullanici_New_password_confirmation_textboxina_sifresini_girer(String string) {
        endToEndPage.secondPasswordTextbox.sendKeys(string);
    }

    @Given("kullanici Register butonuna tiklar")
    public void kullanici_Register_butonuna_tiklar() {

        ReusableMethods.waitFor(1);
        endToEndPage.registerButton.click();
    }

    @Then("kullanici basarili bir kayit olusturulduguna dair mesaj goruntuler")
    public void kullanici_basarili_bir_kayit_olusturulduguna_dair_mesaj_goruntuler() {

        ReusableMethods.waitForVisibility(endToEndPage.registrationSuccessMessage,5);
        Assert.assertTrue(endToEndPage.registrationSuccessMessage.isDisplayed());
    }


    @And("kullanici son sayfaya gider")
    public void kullaniciSonSayfayaGider() {

        ReusableMethods.waitFor(2);
        endToEndPage.sonSayfa.click();
    }

    @And("kullanici son kayittaki Edit Butonuna tiklar")
    public void kullaniciSonKayittakiEditButonunaTiklar() {

       ReusableMethods.waitFor(5);
       actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.waitFor(5);
        endToEndPage.aaaaa.click();
    }

    @And("kullanici activated tiklar")
    public void kullaniciActivatedTiklar() {
        ReusableMethods.waitFor(1);
        endToEndPage.activated.click();
    }

    @And("kullanici son kayittaki View Butonuna tiklar")
    public void kullaniciSonKayittakiViewButonunaTiklar() {
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.waitFor(3);
        endToEndPage.aaaaaview.click();
    }

    @And("kullanici search butonuna tiklar")
    public void kullaniciSearchButonunaTiklar() {
        ReusableMethods.waitFor(2);
        endToEndPage.searchButton.click();
        ReusableMethods.waitFor(2);

    }

    @And("Kullanici SSN search textboxina {string} numarasini girer")
    public void kullaniciSSNSearchTextboxinaNumarasiniGirer(String string) {

        ReusableMethods.waitFor(2);
        endToEndPage.searchSSN.sendKeys(string);

    }


    @And("kullanici admin sayfasindan cikar")
    public void kullaniciAdminSayfasindanCikar() {
        ReusableMethods.waitFor(2);
        endToEndPage.exitAreaAdmin.click();
        endToEndPage.SignOut.click();
    }


    @And("kullanici w hesabindan cikis yapar")
    public void kullaniciWHesabindanCikisYapar() {
        ReusableMethods.waitFor(2);
        endToEndPage.exitAreaWerty.click();
        endToEndPage.SignOut.click();
    }

    @And("kullanici home page tiklar")
    public void kullaniciHomePageTiklar() {
        ReusableMethods.waitFor(1);
        endToEndPage.homePage.click();
    }

    @And("kullanici save customer butonuna tiklar")
    public void kullaniciSaveCustomerButonunaTiklar() {

        ReusableMethods.waitFor(2);
        endToEndPage.saveCustomer.click();
        ReusableMethods.waitFor(5);
    }

    @And("kullanici diger zorunlu alanlari doldurur")
    public void kullaniciDigerZorunluAlanlariDoldurur() {

        ReusableMethods.waitFor(2);
        endToEndPage.middleInitial.sendKeys("We");
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        endToEndPage.phoneNumber.sendKeys("123-456-7890");
        ReusableMethods.waitFor(2);
        endToEndPage.zipCode.sendKeys("0101");
        ReusableMethods.waitFor(1);
        endToEndPage.cityCustomer.sendKeys("Istanbul");

    }

    @And("kullanici employee sayfasindan cikar")
    public void kullaniciEmployeeSayfasindanCikar() {

    ReusableMethods.waitFor(1);
    endToEndPage.employeeCikis.click();
    endToEndPage.SignOut.click();

    }

    @And("kullanici diger sayfaya gecer")
    public void kullaniciDigerSayfayaGecer() {

        ReusableMethods.waitFor(1);
        ReusableMethods.switchToWindow("GMIBANK");
        ReusableMethods.waitFor(1);

    }

    @And("From DropDown'indan bir hesap secer endtoend")
    public void fromDropDownIndanBirHesapSecerEndtoend() {

        ReusableMethods.waitFor(1);
        Select select = new Select(endToEndPage.fromAccountDropDown);
        select.selectByIndex(1);
    }


    @And("To DropDown'indan bir hesap secer endtoend")
    public void toDropDownIndanBirHesapSecerEndtoend() {

        ReusableMethods.waitFor(1);
        Select select = new Select(endToEndPage.toAccountDropDown);
        select.selectByIndex(1);
    }

    @And("kullanici Description textbox ina ikinci hesap icin description girer")
    public void kullaniciDescriptionTextboxInaIkinciHesapIcinDesciriptionGirer() {

        Driver.waitAndSendText(endToEndPage.decriptionAccountTextBox,"hesap002",2);
    }

    @And("kullanici Description textbox ina birinci hesap icin description girer")
    public void kullaniciDescriptionTextboxInaBirinciHesapIcinDescriptionGirer() {

        Driver.waitAndSendText(endToEndPage.decriptionAccountTextBox,"hesap001",2);
    }

    @And("kullanici Account dropdown dan iki hesap secer")
    public void kullaniciAccountDropdownDanIkiHesapSecer() {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        Select select = new Select(endToEndPage.accountDropdown);
        select.selectByVisibleText("hesap001");
        actions.keyDown(Keys.CONTROL).perform();
        select.selectByVisibleText("hesap002");
    }

    @And("kullanici from dropDown'indan bir hesap secer")
    public void kullaniciFromDropDownIndanBirHesapSecer() {
        ReusableMethods.waitFor(1);
        Select options = new Select(endToEndPage.fromAccountDropDown);
        options.selectByIndex(1);
    }

    @And("kullanici to dropDown'indan bir hesap secer")
    public void kullaniciToDropDownIndanBirHesapSecer() {
        ReusableMethods.waitFor(1);
        Select options = new Select(endToEndPage.toAccountDropDown);
        options.selectByIndex(1);
    }


}

