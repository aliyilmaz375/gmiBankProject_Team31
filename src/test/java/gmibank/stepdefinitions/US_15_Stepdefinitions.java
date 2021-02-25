package gmibank.stepdefinitions;

import gmibank.pages.US_15_Page;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class US_15_Stepdefinitions {

    US_15_Page us_15_page = new US_15_Page();

    @And("kullanici My Operations'a tiklar")
    public void kullaniciMyOperationsATiklar() {
        us_15_page.myOperation_button.click();
    }

    @And("kullanici My Accounts'a tiklar")
    public void kullaniciMyAccountsATiklar() {
        us_15_page.myAccounts_button.click();
    }

    @And("kullanici bir View Transaction butonuna tiklar")
    public void kullaniciBirViewTransactionButonunaTiklar() {
        us_15_page.viewTransaction_button.click();
    }

    @Then("kullanici tum Account Types'lari goruntuledigini dogrular")
    public void kullaniciTumAccountTypesLariGoruntulediginiDogrular() {
        for (WebElement w: us_15_page.accountTtypesListesi
             ) {
            Assert.assertTrue(w.isDisplayed());
        }
    }

    @Then("kullanici tum Account Balance'lari goruntuledigini dogrular")
    public void kullaniciTumAccountBalanceLariGoruntulediginiDogrular() {
        for (WebElement w: us_15_page.accountBalanceListesi
             ) {
            Assert.assertTrue(w.isDisplayed());
        }
    }

    @Then("kullanici secili hesapta yapilan islemleri goruntuledigini dogrular")
    public void kullaniciSeciliHesaptaYapilanIslemleriGoruntulediginiDogrular() {
        Assert.assertTrue(us_15_page.transactionTable.isDisplayed());
    }
}