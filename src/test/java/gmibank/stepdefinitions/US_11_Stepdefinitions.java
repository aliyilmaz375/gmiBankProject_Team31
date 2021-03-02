package gmibank.stepdefinitions;

import gmibank.pages.US_11_Page;
import gmibank.utilities.Driver;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class US_11_Stepdefinitions {

    US_11_Page us11Page = new US_11_Page();
    Actions actions = new Actions(Driver.getDriver());

    @Given("kullanici tarih kutusuna {string} tarihini girer")
    public void kullaniciTarihKutusunaTarihiniGirer(String string) {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        us11Page.createDateCustomer.sendKeys(string);
    }

    @Then("kullanici Date girildigini dogrular")
    public void kullaniciCreateDateGirildiginiDogrular() {
        ReusableMethods.waitFor(2);
        System.out.println(us11Page.createDateCustomer.getAttribute("deger"));
    }

    @Then("kullanici cikis yapar")
    public void kullaniciSignOut() {

        ReusableMethods.waitFor(1);
        us11Page.exitArea.click();
        ReusableMethods.waitFor(1);
        us11Page.SignOut.click();
        Driver.closeDriver();
    }

    @Given("kullanici user dropdown kutusundan iki nci user i secer")
    public void kullaniciUserDropdownKutusundanIkiNciUserISecer() {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Select options = new Select(us11Page.userDropdown);
        options.selectByIndex(2);
    }

    @Then("kullanici user secildigini dogrular")
    public void kullaniciUserSecildiginiDogrular() {
        ReusableMethods.waitFor(2);
        System.out.println(us11Page.accountDropdown.getAttribute("deger"));
    }

    @And("kullanici create a new customer i tiklar")
    public void kullaniciCreateANewCustomerITiklar() {

        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_UP).perform();
        us11Page.createNewCustomer.click();
    }

    @Given("kullanici Account dropdown dan bir hesap secer")
    public void kullaniciAccountDropdownDanBirHesapSecer() {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Select select = new Select(us11Page.accountDropdown);
        select.selectByVisibleText("Saving");
    }

    @Then("kullanici Account secildigini dogrular")
    public void kullaniciAccountSecildiginiDogrular() {
        ReusableMethods.waitFor(2);
        System.out.println(us11Page.accountDropdown.getAttribute("deger"));
    }

    @Given("kullanici Zelle kutusunu tiklar")
    public void kullaniciZelleKutusunuTiklar() {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        us11Page.zelleEnrolledCheckBox.click();
    }

    @Then("kullanici Zelle kutusunun tiklandigini dogrular")
    public void kullaniciZelleKutusununTiklandiginiDogrular() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us11Page.zelleEnrolledCheckBox.isSelected());
    }


    @Given("kullanici bir tarih girer")
    public void kullaniciBirTarihGirer() {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        us11Page.createDateCustomer.sendKeys("02/27/2021"+ Keys.TAB);

        us11Page.createDateCustomer.sendKeys("12:59");
    }
}

