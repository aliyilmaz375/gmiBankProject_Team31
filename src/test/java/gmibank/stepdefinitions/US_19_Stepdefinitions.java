package gmibank.stepdefinitions;

import gmibank.pages.US_19_Page;
import gmibank.utilities.Driver;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class US_19_Stepdefinitions {

    US_19_Page us19Page = new US_19_Page();
    Actions actions = new Actions(Driver.getDriver());
    @When("kullanici My Operations a tiklar")
    public void kullanici_my_operations_a_tiklar() {
        ReusableMethods.waitFor(2);
        us19Page.myOperations.click();
    }
    @When("kullanici Manage Accounts a tiklar")
    public void kullanici_manage_accounts_a_tiklar() {
        ReusableMethods.waitFor(1);
        us19Page.manageAccounts.click();
    }
    @When("kullanici create a new account a tiklar")
    public void kullanici_create_a_new_account_a_tiklar() throws InterruptedException {
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.UP).perform();
        ReusableMethods.waitFor(2);
        us19Page.createNewAccount.click();
    }
    @When("kullanici Description textbox ina desciription girer")
    public void kullanici_description_textbox_ina_desciription_girer() throws InterruptedException {
        ReusableMethods.waitFor(2);
        us19Page.description.sendKeys("Alex vadeli hesap");
    }
    @When("kullanici Balance textbox ina bir balance girer")
    public void kullanici_balance_textbox_ina_bir_balance_girer() {
        us19Page.balance.sendKeys("22000");
    }
    @When("kullanici Account Type ini secer")
    public void kullanici_account_type_ini_secer() throws InterruptedException {
        ReusableMethods.waitFor(2);
        Select select = new Select(us19Page.accountTypeDropdown);
        select.selectByIndex(1);
    }
    @When("kullanici Account Status Type ini secer")
    public void kullanici_account_status_type_ini_secer() throws InterruptedException {
        ReusableMethods.waitFor(2);
        Select select = new Select(us19Page.accountStatusType);
        select.selectByIndex(0);
    }
    @When("kullanici Create Date secer")
    public void kullanici_create_date_secer() throws InterruptedException {
        ReusableMethods.waitFor(2);
        us19Page.createAccountDate.sendKeys("02/27/2021"+ Keys.TAB);
        us19Page.createAccountDate.sendKeys("12:59");
    }
    @When("kullanici Close Date secer")
    public void kullanici_close_date_secer() throws InterruptedException {
        ReusableMethods.waitFor(2);
        us19Page.closeDate.sendKeys("02/27/2023"+ Keys.TAB);
        us19Page.closeDate.sendKeys("00:44");
    }
    @When("kullanici save butonuna tiklar")
    public void kullanici_save_butonuna_tiklar() {
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        us19Page.saveButton.click();
    }
    @And("kullanici Balance textbox bos birakilir")
    public void kullaniciBalanceTextboxBosBirakilir() {
    }
    @And("kullanici Description textbox bos birakilir")
    public void kullaniciDescriptionTextboxBosBirakilir() {
    }
    @Then("kullanici hesap olustugunu dogrular")
    public void kullaniciHesapOlustugunuDogrular() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us19Page.succesMessage.isDisplayed());
    }
    @Then("kullanici hata mesajini goruntuler")
    public void kullaniciHataMesajiniGoruntuler() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(us19Page.hataMesaji.isDisplayed());
    }
    @And("kullanici gecersiz Close Date secer")
    public void kullaniciGecersizCloseDateSecer() throws InterruptedException {
        ReusableMethods.waitFor(2);
        us19Page.closeDate.sendKeys("02/27/2000 12:00 PM");
    }





    }
