package gmibank.stepdefinitions;

import gmibank.pages.US_12_Page;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.Driver;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class US_12_StepDefinitions {

    US_12_Page us_12_page = new US_12_Page();
    SoftAssert softAssert = new SoftAssert();
    Actions actions = new Actions(Driver.getDriver());


    @Given("manage customer modulunde customer bilgilerinin goruntulendıgını test eder")
    public void manage_customer_modulunde_customer_bilgilerinin_goruntulendıgını_test_eder() {
     for(int i = 0; i<us_12_page.TumData.size()-1; i++){
         softAssert.assertFalse(us_12_page.TumData.get(i).toString().isEmpty());
         softAssert.assertAll();
     }

    }

    @And("view butonuna tiklar")
    public void viewButonunaTiklar() {
        actions.sendKeys(Keys.END).
                sendKeys(Keys.PAGE_UP).perform();
        us_12_page.syfSon.click();
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.PAGE_UP).perform();
        us_12_page.syf56.click();
        for(int i=0;i<4;i++){
            ReusableMethods.waitFor(1);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            for(int k =0; k<us_12_page.idSutun.size();k++){
                if(us_12_page.idSutun.get(k).getText().equals("76170")){

                    Driver.getDriver().findElement(By.xpath("(//a[@class='btn btn-info btn-sm'])["+(k+1)+"]")).click();
                }
            }
        }
    }

    @And("Müsteri bilgilerinin gorunurlugunu test eder")
    public void müsteriBilgilerininGorunurlugunuTestEder() {
        actions.sendKeys(Keys.UP).perform();
        String actualData = us_12_page.customerViewId.getText();
        Assert.assertEquals(actualData, ConfigReader.getProperty("customer_id"));

    }

    @And("Edit butonunun gorunurlugunu test eder")
    public void editButonununGorunurlugunuTestEder() {
        Assert.assertTrue(us_12_page.editButtonInView.isDisplayed());

    }


    @And("User Infodaki edit butonunun gorunurlugunu test eder")
    public void userInfodakiEditButonununGorunurlugunuTestEder() {
   Assert.assertTrue( us_12_page.editInfo.isDisplayed());
    }

    @And("first name update eder {string}")
    public void firstNameUpdateEder(String firstName) {
        us_12_page.firstName.clear();
        us_12_page.firstName.sendKeys(firstName);
    }

    @And("last name update eder {string}")
    public void lastNameUpdateEder(String lastName) {
        us_12_page.lastName.clear();
        us_12_page.lastName.sendKeys(lastName);
    }

    @And("middle initial update eder {string}")
    public void middleInitialUpdateEder(String middleInitial) {
        us_12_page.middleInitial.clear();
        us_12_page.middleInitial.sendKeys(middleInitial);
    }

    @And("Email update eder {string}")
    public void emailUpdateEder(String eMail) {
        us_12_page.eMail.clear();
        us_12_page.eMail.sendKeys(eMail);
    }

    @And("Mobile Phone Number update eder {string}")
    public void mobilePhoneNumberUpdateEder(String mobilePhoneNumber) {
        us_12_page.mobilePhoneNumber.clear();
        us_12_page.mobilePhoneNumber.sendKeys(mobilePhoneNumber);
    }

    @And("Phone Number update eder {string}")
    public void phoneNumberUpdateEder(String phoneNumber) {
        us_12_page.phoneNumber.clear();
        us_12_page.phoneNumber.sendKeys(phoneNumber);
    }

    @And("address update eder {string}")
    public void addressUpdateEder(String address) {
        us_12_page.address.clear();
        us_12_page.address.sendKeys(address);
    }


    @And("Save butonuna basar")
    public void saveButonunaBasar() {
        us_12_page.editSave.click();
    }

    @And("Edit butonuna basar")
    public void editButonunaBasar() {
        us_12_page.editInfo.click();
    }

    @And("update olup olmadıgını test eder")
    public void updateOlupOlmadıgınıTestEder() {
        String arr[] = {"35128","Burcu","Gunes","Elif","brcgns@gmail.com","345-789-7812","234-345-4515","Ankara"};
        for(int i =0; i<arr.length; i++){
                   Assert.assertEquals(us_12_page.birinciSatir.get(i).getText(),arr[i]);
        }
    }
    
    @And("first name update oldugunu test eder")
    public void firstNameUpdateOldugunuTestEder() {
        ReusableMethods.waitFor(3);
        Assert.assertEquals(us_12_page.satir1FirstName.getText(),ConfigReader.getProperty("edit_firstName"));
    }

    @And("last name update oldugunu test eder")
    public void lastNameUpdateOldugunuTestEder() {
        ReusableMethods.waitFor(3);
        Assert.assertEquals(us_12_page.satir1LastName.getText(),ConfigReader.getProperty("edit_lastName"));
    }

    @And("Email {string} update oldugunu test eder")
    public void emailUpdateOldugunuTestEder(String eMailExpected) {
        ReusableMethods.waitFor(3);
        Assert.assertEquals(us_12_page.satir1Email.getText(),eMailExpected);
    }

    @And("Middle Initial update oldugunu test eder")
    public void middleInitialUpdateOldugunuTestEder() {
        ReusableMethods.waitFor(3);
        Assert.assertEquals(us_12_page.satir1MiddleInitial.getText(),ConfigReader.getProperty("edit_middleInitial"));
    }

    @And("bos bırakılan alan oldugunda kayıt olmadıgını test eder")
    public void bosBırakılanAlanOldugundaKayıtOlmadıgınıTestEder() {
        Assert.assertTrue(us_12_page.notSave.isDisplayed());
    }

    @And("Delete butonuna basar")
    public void deleteButonunaBasar() {
        us_12_page.deleteButton.click();
    }

    @And("Confirm delete mesajı goruntulenır")
    public void confirmDeleteMesajıGoruntulenır() {
        Assert.assertEquals(us_12_page.confirmDeleteButtonMesage.getText(),ConfigReader.getProperty("ConfirmMessageDelete"));
    }

    @And("Confirm mesajındaki delete butonuna basar")
    public void confirmMesajındakiDeleteButonunaBasar() {
     us_12_page.AfterConfirmDeleteButton.click();
    }

    @And("Silme isleminin gerceklestigini test eder")
    public void silmeIslemininGerceklestiginiTestEder() {
    }
}
