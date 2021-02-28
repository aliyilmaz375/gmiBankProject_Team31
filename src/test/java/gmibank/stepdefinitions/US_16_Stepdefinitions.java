package gmibank.stepdefinitions;

import gmibank.pages.US_16_Page;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class US_16_Stepdefinitions {

    US_16_Page us_16_page = new US_16_Page();

    @And("kullanici Transfer Money'e tiklar")
    public void kullaniciTransferMoneyETiklar() {
        us_16_page.transferMoney_button.click();
    }

    @And("From DropDown'indan bir hesap secer")
    public void fromDropDownIndanBirHesapSecer() {
        Select options = new Select(us_16_page.fromAccountDropDown);
        options.selectByValue(ConfigReader.getProperty("investing_account_id"));
    }

    @And("To DropDown'indan bir hesap secer")
    public void toDropDownIndanBirHesapSecer() {
        Select options = new Select(us_16_page.toAccountDropDown);
        options.selectByValue(ConfigReader.getProperty("saving_account_id"));
    }

    @And("Balance kismina gecerli bir para miktarini yazar")
    public void balanceKisminaGecerliBirParaMiktariniYazar() {
        us_16_page.balanceTextBox.sendKeys(ConfigReader.getProperty("gecerli_balance_miktari"));
    }

    @And("Description kismina aciklama yazar")
    public void descriptionKisminaAciklamaYazar() {
        us_16_page.descriptionTextBox.sendKeys(ConfigReader.getProperty("description_message"));
    }

    @And("Make Transfer butonuna tiklar")
    public void makeTransferButonunaTiklar() {
        us_16_page.makeTransferButton.click();
    }


    @Then("kullanici para transferi yapildigini dogrular")
    public void kullaniciParaTransferiYapildiginiDogrular() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_16_page.succesfullMessage.isDisplayed());
    }


    @And("Balance kismina bes rakamdan fazla para miktari yazar")
    public void balanceKisminaBesRakamdanFazlaParaMiktariYazar() {
        us_16_page.balanceTextBox.sendKeys(ConfigReader.getProperty("besten_fazla_balance"));
    }

    @Then("kullanici max caracter hata mesaji aldigini dogrular")
    public void kullaniciMaxCaracterHataMesajiAldiginiDogrular() {
        Assert.assertTrue(us_16_page.max5Caracter.isDisplayed());
    }

    @And("Balance kismina hesaptaki paradan fazla bir tutar girer")
    public void balanceKisminaHesaptakiParadanFazlaBirTutarGirer() {
        us_16_page.balanceTextBox.sendKeys(ConfigReader.getProperty("hesaptaki_paradan_fazla_balance"));
    }

    @Then("kullanici balance exceed hata mesaji aldigini dogrular")
    public void kullaniciBalanceExceedHataMesajiAldiginiDogrular() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_16_page.balanceExceedMessage.isDisplayed());
    }

    @Then("kullanici bos birakilamaz hata mesajini dogrular")
    public void kullaniciBosBirakilamazHataMesajiniDogrular() {
        Assert.assertTrue(us_16_page.descriptionEmptyMessage.isDisplayed());
    }

    @And("Description kismi bos birakilir ve Make Transfer butonuna tiklar")
    public void descriptionKismiBosBirakilirVeMakeTransferButonunaTiklar() {
        us_16_page.makeTransferButton.click();
    }




}
