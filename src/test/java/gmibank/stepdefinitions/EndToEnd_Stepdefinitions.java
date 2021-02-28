package gmibank.stepdefinitions;

import gmibank.pages.EndToEnd_Page;
import gmibank.utilities.Driver;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class EndToEnd_Stepdefinitions {

    EndToEnd_Page endToEndPage = new EndToEnd_Page();
    Actions actions = new Actions(Driver.getDriver());

    @And("kullanici son sayfaya gider")
    public void kullaniciSonSayfayaGider() {

        ReusableMethods.waitFor(2);
        endToEndPage.sonSayfa.click();
    }

    @And("kullanici son kayittaki Edit Butonuna tiklar")
    public void kullaniciSonKayittakiEditButonunaTiklar() {

        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.waitFor(3);
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

    @And("kullanici Account dropdown dan iki hesap secer")
    public void kullaniciAccountDropdownDanIkiHesapSecer() {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        Select select = new Select(endToEndPage.accountDropdown);
        select.selectByVisibleText("Saving");
        actions.keyDown(Keys.CONTROL).perform();
        select.selectByVisibleText("werty10");
    }

    @And("kullanici Transfer Money'e tiklar")
    public void kullaniciTransferMoneyETiklar() {
        ReusableMethods.waitFor(3);
        endToEndPage.transferMoney.click();
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
        endToEndPage.phoneNumber.sendKeys("123-456-7890");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
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
}

