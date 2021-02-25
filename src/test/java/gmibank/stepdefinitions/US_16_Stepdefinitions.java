package gmibank.stepdefinitions;

import gmibank.pages.US_16_Page;
import gmibank.utilities.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class US_16_Stepdefinitions {

    US_16_Page us_16_page = new US_16_Page();

    @And("kullanici My Operations'a tiklar")
    public void kullaniciMyOperationsATiklar() {
        us_16_page.myOperation_button.click();
    }

    @And("kullanici My Accounts'a tiklar")
    public void kullaniciMyAccountsATiklar() {
        us_16_page.myAccounts_button.click();
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
        Assert.assertEquals(us_16_page.succesfullMessage, "Transfer is succesfulL");
    }
}
