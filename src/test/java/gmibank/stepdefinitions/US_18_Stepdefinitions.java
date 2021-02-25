package gmibank.stepdefinitions;

import gmibank.pages.US_18_Page;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


public class US_18_Stepdefinitions {

    US_18_Page us18Page = new US_18_Page();

    @Given("kullanici My Operation i tiklar")
    public void kullaniciMyOperationITiklar() {

        us18Page.myOperations.click();
    }

    @And("kullanici Manage Customer i tiklar")
    public void kullaniciManageCustomerITiklar() {

        us18Page.manageCustomers.click();
    }

    @Then("kullanici tum customer bilgilerini goruntuler")
    public void kullaniciTumCustomerBilgileriniGoruntuler() {

        for (WebElement w : us18Page.tumBilgiler) {
            String tumBilgiler = w.getText();
            System.out.println(tumBilgiler);
            Assert.assertFalse(tumBilgiler.isEmpty());
        }

        /*
        for (WebElement w : us18Page.firstname) {
            String firstname = w.getText();
            System.out.println(firstname);
            Assert.assertFalse(firstname.isEmpty());
        }
         */

    }

    @Given("kullanici customer bilgilerine gidebilecegi bir View butonun oldugunu dogrular")
    public void kullaniciCustomerBilgilerineGidebilecegiBirViewButonunOldugunuDogrular() {

        Assert.assertTrue(us18Page.viewButton.isDisplayed());
    }


    @Then("kullanici customer bilgilerini duzenleyebilecegi bir Edit butonun oldugunu dogrular")
    public void kullaniciCustomerBilgileriniDuzenleyebilecegiBirEditButonunOldugunuDogrular() {

        Assert.assertTrue(us18Page.editButton.isDisplayed());
    }

    @Given("kullanici Edit butonuna tiklar")
    public void kullaniciEditButonunaTiklar() {
        us18Page.editButton.click();
    }

    @And("kullanici firstname butonunda mevcut ismi siler ve yeni isim girer")
    public void kullaniciFirstnameButonundaMevcutIsmiSilerVeYeniIsimGirer() {

        ReusableMethods.waitFor(2);
        us18Page.firstNameButton.clear();
        us18Page.firstNameButton.sendKeys("william");

    }

    @And("kullanici Save butonuna tiklar")
    public void kullaniciSaveButonunaTiklar() {
        ReusableMethods.waitFor(2);
        us18Page.saveButton.click();
    }

    @And("kullanici herhangi bir Delete butonuna tiklar")
    public void kullaniciHerhangiBirDeleteButonunaTiklar() {
        us18Page.deleteButton.click();
    }

    @And("kullanici gelen mesajdan Cancel e tiklar")
    public void kullaniciGelenMesajdanCancelETiklar() {
        us18Page.cancelButton.click();
    }
}
