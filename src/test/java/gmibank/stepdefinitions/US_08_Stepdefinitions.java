package gmibank.stepdefinitions;

import gmibank.pages.US_06_Page;
import gmibank.pages.US_07_Page;
import gmibank.pages.US_08_Page;
import gmibank.utilities.ConfigReader;
import io.cucumber.java.en.Given;

public class US_08_Stepdefinitions {

    US_06_Page us6page = new US_06_Page();
    US_07_Page us7page = new US_07_Page();
    US_08_Page us8page = new US_08_Page();

    @Given("kullanici profil dropdown menusunden password secer")
    public void kullanici_profil_dropdown_menusunden_password_secer() {
        us6page.accountMenu.click();
        us8page.Password.click();
    }

    //=========================

    @Given("kullanici admin eski password girer")
    public void kullanici_admin_eski_password_girer(){
        us8page.currentPassword.sendKeys(ConfigReader.getProperty("admin_password"));
    }
    @Given("kullanici admin yeni password girer")
    public void kullanici_admin_yeni_password_girer(){
        us8page.newPassword.sendKeys(ConfigReader.getProperty("admin_password"));
    }

    @Given("kullanici tekrar admin yeni password girer")
    public void kullanici_tekrar_admin_yeni_password_girer(){
        us8page.confirmPassword.sendKeys(ConfigReader.getProperty("admin_password"));
    }
    //=========================

    @Given("kullanici manager eski password girer")
    public void kullanici_manager_eski_password_girer(){
        us8page.currentPassword.sendKeys(ConfigReader.getProperty("manager_password"));
    }
    @Given("kullanici manager yeni password girer")
    public void kullanici_manager_yeni_password_girer(){
        us8page.newPassword.sendKeys(ConfigReader.getProperty("manager_password"));
    }

    @Given("kullanici tekrar manager yeni password girer")
    public void kullanici_tekrar_manager_yeni_password_girer(){
        us8page.confirmPassword.sendKeys(ConfigReader.getProperty("manager_password"));
    }
    //=========================

    @Given("kullanici employee eski password girer")
    public void kullanici_employee_eski_password_girer(){
        us8page.currentPassword.sendKeys(ConfigReader.getProperty("employee_password"));
    }
    @Given("kullanici employee yeni password girer")
    public void kullanici_employee_yeni_password_girer(){
        us8page.newPassword.sendKeys(ConfigReader.getProperty("employee_password"));
    }

    @Given("kullanici tekrar employee yeni password girer")
    public void kullanici_tekrar_employee_yeni_password_girer(){
        us8page.confirmPassword.sendKeys(ConfigReader.getProperty("employee_password"));
    }
//=========================

    @Given("kullanici customer eski password girer")
    public void kullanici_customer_eski_password_girer(){
        us8page.currentPassword.sendKeys(ConfigReader.getProperty("customer_password"));
    }
    @Given("kullanici customer yeni password girer")
    public void kullanici_customer_yeni_password_girer(){
        us8page.newPassword.sendKeys(ConfigReader.getProperty("customer_password"));
    }

    @Given("kullanici tekrar customer yeni password girer")
    public void kullanici_tekrar_customer_yeni_password_girer(){
        us8page.confirmPassword.sendKeys(ConfigReader.getProperty("customer_password"));
    }
    //=========================

    @Given("kullanici user eski password girer")
    public void kullanici_user_eski_password_girer(){
        us8page.currentPassword.sendKeys(ConfigReader.getProperty("user_password"));
    }
    @Given("kullanici user yeni password girer")
    public void kullanici_user_yeni_password_girer(){
        us8page.newPassword.sendKeys(ConfigReader.getProperty("user_password"));
    }

    @Given("kullanici tekrar user yeni password girer")
    public void kullanici_tekrar_user_yeni_password_girer(){
        us8page.confirmPassword.sendKeys(ConfigReader.getProperty("user_password"));
    }

}
