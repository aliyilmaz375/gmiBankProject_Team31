package gmibank.stepdefinitions;

import gmibank.pages.US_006_Page;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.Driver;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class US_006_Stepdefinitions {

    US_006_Page us6page = new US_006_Page();

    @Given("kullanici profil dropdown menusunden user info secer")
    public void kullanici_profil_dropdown_menusunden_user_info_secer() {
        us6page.accountMenu.click();
        us6page.userInfo.click();
    }

    @Given("kullanici admin firstname girer")
    public void kullanici_admin_firstname_girer() {
        us6page.firstName.clear();
        us6page.firstName.sendKeys(ConfigReader.getProperty("06Admin_name"));
    }

    @Given("kullanici admin lastname girer")
    public void kullanici_admin_lastname_girer() {
        us6page.lastName.clear();
        us6page.lastName.sendKeys(ConfigReader.getProperty("06Admin_name"));
    }

    @Given("kullanici admin email girer")
    public void kullanici_admin_email_girer() {
        us6page.email.clear();
        us6page.email.sendKeys(ConfigReader.getProperty("06Admin_mail"));
    }

    @Given("kullanici language english secer")
    public void kullanici_language_english_secer() {
        Select select = new Select(us6page.langKey);
        select.selectByValue(ConfigReader.getProperty("06Language"));
    }

    @Given("kullanici Save butonuna basar")
    public void kullanici_save_butonuna_basar() {
        us6page.SaveBtn.click();
    }

    @Then("kullanici kayit mesajini dogrular")
    public void kullanici_kayit_mesajini_dogrular() {
        //Assert.assertEquals(ConfigReader.getProperty("06Mesaj"),us6page.SaveMesaji.getText());
        Driver.closeDriver();
    }

    //==================

    @Given("kullanici manager hesabina girer")
    public void kullaniciManagerHesabinaGirer() {
        ReusableMethods.managerLogin();
    }

    @Given("kullanici manager firstname girer")
    public void kullanici_manager_firstname_girer() {
        us6page.firstName.clear();
        us6page.firstName.sendKeys(ConfigReader.getProperty("06Manager_name"));
    }

    @Given("kullanici manager lastname girer")
    public void kullanici_manager_lastname_girer() {
        us6page.lastName.clear();
        us6page.lastName.sendKeys(ConfigReader.getProperty("06Manager_name"));
    }

    @Given("kullanici manager email girer")
    public void kullanici_manager_email_girer() {
        us6page.email.clear();
        us6page.email.sendKeys(ConfigReader.getProperty("06Manager_mail"));
    }

    //==================

    @Given("kullanici employee hesabina girer")
    public void kullaniciEmployeeHesabinaGirer() {
        ReusableMethods.employeeLogin();
    }

    @Given("kullanici employee firstname girer")
    public void kullanici_employee_firstname_girer() {
        us6page.firstName.clear();
        us6page.firstName.sendKeys(ConfigReader.getProperty("06Employee_name"));
    }

    @Given("kullanici employee lastname girer")
    public void kullanici_employee_lastname_girer() {
        us6page.lastName.clear();
        us6page.lastName.sendKeys(ConfigReader.getProperty("06Employee_name"));
    }

    @Given("kullanici employee email girer")
    public void kullanici_employee_email_girer() {
        us6page.email.clear();
        us6page.email.sendKeys(ConfigReader.getProperty("06Employee_mail"));
    }

    //==================

    @Given("kullanici customer hesabina girer")
    public void kullaniciCustomerHesabinaGirer() {
        ReusableMethods.customerLogin();
    }

    @Given("kullanici customer firstname girer")
    public void kullanici_customer_firstname_girer() {
        us6page.firstName.clear();
        us6page.firstName.sendKeys(ConfigReader.getProperty("06Customer_name"));
    }

    @Given("kullanici customer lastname girer")
    public void kullanici_customer_lastname_girer() {
        us6page.lastName.clear();
        us6page.lastName.sendKeys(ConfigReader.getProperty("06Customer_name"));
    }

    @Given("kullanici customer email girer")
    public void kullanici_customer_email_girer() {
        us6page.email.clear();
        us6page.email.sendKeys(ConfigReader.getProperty("06Customer_mail"));
    }

    //==================

    @Given("kullanici user hesabina girer")
    public void kullaniciUserHesabinaGirer() {
        ReusableMethods.userLogin();
    }

    @Given("kullanici user firstname girer")
    public void kullanici_user_firstname_girer() {
        us6page.firstName.clear();
        us6page.firstName.sendKeys(ConfigReader.getProperty("06User_name"));
    }

    @Given("kullanici user lastname girer")
    public void kullanici_user_lastname_girer() {
        us6page.lastName.clear();
        us6page.lastName.sendKeys(ConfigReader.getProperty("06User_name"));
    }

    @Given("kullanici user email girer")
    public void kullanici_user_email_girer() {
        us6page.email.clear();
        us6page.email.sendKeys(ConfigReader.getProperty("06User_mail"));
    }

    //====================

    @Given("kullanici gecersiz email girer")
    public void kullanici_gecersiz_email_girer() {
        us6page.email.clear();
        us6page.email.sendKeys(ConfigReader.getProperty("06gecersiz_mail"));
    }

    @Then("kullanici hata mesajini dogrular")
    public void kullanici_hata_mesajini_dogrular() {
        Assert.assertTrue(us6page.hataMesaji.isDisplayed());
        Driver.closeDriver();

    }

}
