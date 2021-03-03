package gmibank.stepdefinitions;


import gmibank.pages.US_17_Page;
import gmibank.utilities.Driver;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class US_17_Stepdefinitions {

    US_17_Page us17Page = new US_17_Page();
    Actions actions = new Actions(Driver.getDriver());

    @Given("kullanici Admin hesabina girer")
    public void kullaniciHesabinaGirer() {
        ReusableMethods.adminLogin();
    }

    @Given("kullanici Administration a tiklar")
    public void kullanici_administration_a_tiklar() {
        us17Page.administration.click();
    }

    @Given("kullanici User Management e tiklar")
    public void kullanici_user_management_e_tiklar() {
        us17Page.userManagement.click();
    }


        @Given("kullanici Admin olarak bir User hesabini etkinlestirir")
        public void kullanici_admin_olarak_bir_user_hesabini_etkinlestirir () {

            ReusableMethods.waitFor(2);
            us17Page.userEdit.click();
            ReusableMethods.waitFor(2);

            if (us17Page.activatedButton.isSelected()) {
                ReusableMethods.waitFor(1);
            } else {
                us17Page.activatedButton.click();
                ReusableMethods.waitFor(1);
                us17Page.saveButton.click();
            }


        /*

        String idDeactivated = "";
        int satir = 0;
        for (int i = 0; i < 2; i++) {
            for (int k = 0; k < us17Page.rollUser.size(); k++) {
                if (us17Page.rollUser.get(k).getText().equals("ROLE_CUSTOMER") &&
                        us17Page.deactivated.get(k).getText().equals("Deactivated")) {
                    idDeactivated = Driver.getDriver().findElement(By.xpath("//tbody//tr[" + (k + 1) + "]//td[1]")).getText();
                    satir = k + 1;
                    break;
                }
            }
            if (idDeactivated != "") {
                break;
            }
            ReusableMethods.waitFor(1);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
        }
        System.out.println("id: " + idDeactivated);
        System.out.println("satır: " + satir);
        ReusableMethods.waitFor(10);
        Driver.getDriver().findElement(By.xpath("(//*[.='Edit'])[" + satir + "]")).click();
        ReusableMethods.waitFor(5);
        actions.sendKeys(Keys.UP).perform();
        us17Page.activatedBox.click();
        //actions.sendKeys(Keys.PAGE_DOWN).perform();
        us17Page.saveButton.click();
        ReusableMethods.waitFor(5);
        actions.sendKeys(Keys.UP).perform();
        String actualResult = "";
        for (int i = 0; i < 3; i++) {
            ReusableMethods.waitFor(1);
            for (int j = 0; j < us17Page.idSutun.size(); j++) {
                if (us17Page.idSutun.get(j).getText().equals(idDeactivated)) {
                    actualResult = Driver.getDriver().findElement(By.xpath("//tbody//tr[" + (j + 1) + "]//td[4]")).getText();
                    break;
                }
            }
            if (actualResult != "") {
                break;
            } else {
                actions.sendKeys(Keys.PAGE_DOWN).perform();
            }
        }
*/


        }

        @And("kullanici Admin olarak bir Employee hesabini etkinlestirir")
        public void kullaniciAdminOlarakBirEmployeeHesabiniEtkinlestirir () {

            ReusableMethods.waitFor(2);
            us17Page.employeeEdit.click();
            ReusableMethods.waitFor(2);
            us17Page.activatedButton.click();
            ReusableMethods.waitFor(1);
            us17Page.saveButton.click();

        }

        @And("kullanici Admin olarak bir Manager hesabini etkinlestirir")
        public void kullaniciAdminOlarakBirManagerHesabiniEtkinlestirir () {
            ReusableMethods.waitFor(2);
            us17Page.managerEdit.click();
            ReusableMethods.waitFor(2);
            us17Page.activatedButton.click();
            ReusableMethods.waitFor(1);
            us17Page.saveButton.click();
        }

        @And("kullanici Admin olarak bir Customer hesabini etkinlestirir")
        public void kullaniciAdminOlarakBirCustomerHesabiniEtkinlestirir () {
            ReusableMethods.waitFor(2);
            us17Page.customerEdit.click();
            ReusableMethods.waitFor(2);
            us17Page.activatedButton.click();
            ReusableMethods.waitFor(1);
            us17Page.saveButton.click();
        }

        @And("kullanici Admin olarak bir Admin hesabini etkinlestirir")
        public void kullaniciAdminOlarakBirAdminHesabiniEtkinlestirir () {

            ReusableMethods.waitFor(2);
            us17Page.adminEdit.click();
            ReusableMethods.waitFor(2);
            us17Page.activatedButton.click();
            ReusableMethods.waitFor(1);
            us17Page.saveButton.click();
        }
        @Then("kullanici hesabin active edildigini dogrular")
        public void kullanici_active_edildigini_dogrular () {

            Assert.assertTrue(us17Page.basariliMesaji.isDisplayed());
        }

        @And("kullanici Admin olarak bir User hesabini goruntuler")
        public void kullaniciAdminOlarakBirUserHesabiniGoruntuler () {

            ReusableMethods.waitFor(2);
            us17Page.userView.click();
        }

        @Then("kullanici hesabin User hesabini goruntulendigini dogrular")
        public void kullaniciHesabinUserHesabiniGoruntulendiginiDogrular () {
            ReusableMethods.waitFor(1);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(1);
            Assert.assertTrue(us17Page.roleUser.isDisplayed());
        }

        @And("kullanici Admin olarak bir Employee hesabini goruntuler")
        public void kullaniciAdminOlarakBirEmployeeHesabiniGoruntuler () {
            ReusableMethods.waitFor(2);
            us17Page.employeeView.click();
        }

        @Then("kullanici hesabin Employee hesabini goruntulendigini dogrular")
        public void kullaniciHesabinEmployeeHesabiniGoruntulendiginiDogrular () {
            ReusableMethods.waitFor(1);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(1);
            Assert.assertTrue(us17Page.roleEmployee.isDisplayed());
        }

        @And("kullanici Admin olarak bir Manager hesabini goruntuler")
        public void kullaniciAdminOlarakBirManagerHesabiniGoruntuler () {
            ReusableMethods.waitFor(2);
            us17Page.managerView.click();
        }

        @Then("kullanici hesabin Manager hesabini goruntulendigini dogrular")
        public void kullaniciHesabinManagerHesabiniGoruntulendiginiDogrular () {
            ReusableMethods.waitFor(1);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(1);
            Assert.assertTrue(us17Page.roleManager.isDisplayed());
        }

        @And("kullanici Admin olarak bir Customer hesabini goruntuler")
        public void kullaniciAdminOlarakBirCustomerHesabiniGoruntuler () {
            ReusableMethods.waitFor(2);
            us17Page.customerView.click();
        }

        @Then("kullanici hesabin Customer hesabini goruntulendigini dogrular")
        public void kullaniciHesabinCustomerHesabiniGoruntulendiginiDogrular () {
            ReusableMethods.waitFor(1);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(1);
            Assert.assertTrue(us17Page.roleCustomer.isDisplayed());
        }

        @And("kullanici Admin olarak bir Admin hesabini goruntuler")
        public void kullaniciAdminOlarakBirAdminHesabiniGoruntuler () {
            ReusableMethods.waitFor(2);
            us17Page.adminView.click();
        }

        @Then("kullanici hesabin Admin hesabini goruntulendigini dogrular")
        public void kullaniciHesabinAdminHesabiniGoruntulendiginiDogrular () {
            ReusableMethods.waitFor(1);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(1);
            Assert.assertTrue(us17Page.roleAdmin.isDisplayed());
        }


        @Given("kullanici ilk satirdaki edit butonuna tiklar")
        public void kullaniciIlkSatirdakiEditButonunaTiklar () {

            for (WebElement w : us17Page.birinciSatirTumData) {
                String birinciSatirTumData = w.getText();
                System.out.println(birinciSatirTumData);
                Assert.assertFalse(birinciSatirTumData.isEmpty());
            }

            us17Page.editButton.click();

        }

        @And("kullanici profiles dropdown dan Manager i secer")
        public void kullaniciProfilesDropdownDanManagerISecer () {

            ReusableMethods.waitFor(1);
            Select select = new Select(us17Page.pfofilesDropdown);
            select.deselectAll();
            select.selectByIndex(3);
        }

        @Then("kullanici rolun basariyla degistirildigini dogrular")
        public void kullaniciProflinManagerOldugunuDogrular () {

            ReusableMethods.waitFor(2);
            Assert.assertTrue(us17Page.basariliMesaji.isDisplayed());

        }

        @And("kullanici profiles dropdown dan Admin i secer")
        public void kullaniciProfilesDropdownDanAdminISecer () {

            ReusableMethods.waitFor(2);
            Select select = new Select(us17Page.pfofilesDropdown);
            select.deselectAll();
            select.selectByIndex(0);
        }

        @And("kullanici profiles dropdown dan Employee i secer")
        public void kullaniciProfilesDropdownDanEmployeeISecer () {

            ReusableMethods.waitFor(2);
            Select select = new Select(us17Page.pfofilesDropdown);
            select.deselectAll();
            select.selectByIndex(2);
        }

        @And("kullanici profiles dropdown dan User i secer")
        public void kullaniciProfilesDropdownDanUserISecer () {

            ReusableMethods.waitFor(2);
            Select select = new Select(us17Page.pfofilesDropdown);
            select.deselectAll();
            select.selectByIndex(1);
        }

        @And("kullanici profiles dropdown dan Customer i secer")
        public void kullaniciProfilesDropdownDanCustomerISecer () {

            ReusableMethods.waitFor(2);
            Select select = new Select(us17Page.pfofilesDropdown);
            select.deselectAll();
            select.selectByIndex(4);
        }


        @And("kullanici Admin olarak bir User hesabinin ismini degistirir")
        public void kullaniciAdminOlarakBirUserHesabininIsminiDegistirir () {
            ReusableMethods.waitFor(2);
            us17Page.userEdit.click();
            ReusableMethods.waitFor(2);
            us17Page.firstNameButton.clear();
            ReusableMethods.waitFor(1);
            us17Page.firstNameButton.sendKeys("deneme");
            ReusableMethods.waitFor(1);
            us17Page.saveButton.click();
        }

        @Then("kullanici degisimi dogrular")
        public void kullaniciDegisimiDogrular () {
            ReusableMethods.waitFor(2);
            Assert.assertTrue(us17Page.basariliMesaji.isDisplayed());
        }

        @And("kullanici Admin olarak bir Employee hesabinin ismini degistirir")
        public void kullaniciAdminOlarakBirEmployeeHesabininIsminiDegistirir () {
            ReusableMethods.waitFor(2);
            us17Page.employeeEdit.click();
            ReusableMethods.waitFor(2);
            us17Page.firstNameButton.clear();
            ReusableMethods.waitFor(1);
            us17Page.firstNameButton.sendKeys("deneme");
            ReusableMethods.waitFor(1);
            us17Page.saveButton.click();
        }

        @And("kullanici Admin olarak bir Manager hesabinin ismini degistirir")
        public void kullaniciAdminOlarakBirManagerHesabininIsminiDegistirir () {
            ReusableMethods.waitFor(2);
            us17Page.managerEdit.click();
            ReusableMethods.waitFor(2);
            us17Page.firstNameButton.clear();
            ReusableMethods.waitFor(1);
            us17Page.firstNameButton.sendKeys("deneme");
            ReusableMethods.waitFor(1);
            us17Page.saveButton.click();
        }

        @And("kullanici Admin olarak bir Customer hesabinin ismini degistirir")
        public void kullaniciAdminOlarakBirCustomerHesabininIsminiDegistirir () {
            ReusableMethods.waitFor(2);
            us17Page.customerEdit.click();
            ReusableMethods.waitFor(2);
            us17Page.firstNameButton.clear();
            ReusableMethods.waitFor(1);
            us17Page.firstNameButton.sendKeys("deneme");
            ReusableMethods.waitFor(1);
            us17Page.saveButton.click();

        }

        @And("kullanici Admin olarak bir Admin hesabinin ismini degistirir")
        public void kullaniciAdminOlarakBirAdminHesabininIsminiDegistirir () {

            ReusableMethods.waitFor(2);
            us17Page.adminEdit.click();
            ReusableMethods.waitFor(2);
            us17Page.firstNameButton.clear();
            ReusableMethods.waitFor(1);
            us17Page.firstNameButton.sendKeys("deneme");
            ReusableMethods.waitFor(1);
            us17Page.saveButton.click();
        }

        @And("kullanici @ isareti koymadan email degistiremez")
        public void kullaniciIsaretiKoymadanEmailDegistiremez () {

            ReusableMethods.waitFor(2);
            us17Page.adminEdit.click();
            ReusableMethods.waitFor(2);
            us17Page.emailButton.clear();
            ReusableMethods.waitFor(1);
            us17Page.emailButton.sendKeys("deneme");
            ReusableMethods.waitFor(1);
            us17Page.saveButton.click();
        }

        @And("kullanici Admin olarak bir User hesabini silebilir")
        public void kullaniciAdminOlarakBirUserHesabiniSilebilir () {

            ReusableMethods.waitFor(2);
            us17Page.userDelete.click();
            ReusableMethods.waitFor(2);

        }


        @And("kullanici Admin olarak bir Employee hesabini silebilir")
        public void kullaniciAdminOlarakBirEmployeeHesabiniSilebilir () {
            ReusableMethods.waitFor(2);
            us17Page.employeeDelete.click();
            ReusableMethods.waitFor(2);
        }

        @And("kullanici Admin olarak bir Manager hesabini silebilir")
        public void kullaniciAdminOlarakBirManagerHesabiniSilebilir () {
            ReusableMethods.waitFor(2);
            us17Page.managerDelete.click();
            ReusableMethods.waitFor(2);
        }

        @And("kullanici Admin olarak bir Customer hesabini silebilir")
        public void kullaniciAdminOlarakBirCustomerHesabiniSilebilir () {
            ReusableMethods.waitFor(2);
            us17Page.customerDelete.click();
            ReusableMethods.waitFor(2);
        }

        @And("kullanici Admin olarak bir Admin hesabini silebilir")
        public void kullaniciAdminOlarakBirAdminHesabiniSilebilir () {
            ReusableMethods.waitFor(2);
            us17Page.adminDelete.click();
            ReusableMethods.waitFor(2);
        }

        @Given("kullanici bir Admin satirindaki edit butonuna tiklar")
        public void kullaniciBirAdminSatirindakiEditButonunaTiklar () {

            ReusableMethods.waitFor(2);
            us17Page.adminEdit.click();

        }

        @Given("kullanici bir User satirindaki edit butonuna tiklar")
        public void kullaniciBirUserSatirindakiEditButonunaTiklar () {
            ReusableMethods.waitFor(2);
            us17Page.userEdit.click();

        }


        @Given("kullanici bir Employee satirindaki edit butonuna tiklar")
        public void kullaniciBirEmployeeSatirindakiEditButonunaTiklar () {
            ReusableMethods.waitFor(2);
            us17Page.employeeEdit.click();

        }


    @Given("kullanici bir Manager satirindaki edit butonuna tiklar")
    public void kullaniciBirManagerSatirindakiEditButonunaTiklar() {
        ReusableMethods.waitFor(2);
        us17Page.managerEdit.click();
    }
}