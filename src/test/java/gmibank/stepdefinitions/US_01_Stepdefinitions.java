package gmibank.stepdefinitions;

import gmibank.pages.US_01_Page;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.Select;

public class US_01_Stepdefinitions {

    US_01_Page us_01Page=new US_01_Page();

       @Given("user navigate to {string}")
         public void userNavigateTo(String arg0) {

        Driver.getDriver().get(ConfigReader.getProperty("gmibank_url"));
    }

        @And("user clicks the symbol  on the top of the page")
        public void userClicksTheSymbolOnTheTopOfThePage () {

        Select select = new Select(us_01Page.registerdropdown);
            select.selectByValue("2");
        }


    @And("user enters an valid SSN number in the SSN textbox")
    public void userEntersAnValidSSNNumberInTheSSNTextbox() {
           us_01Page.ssnNumber.sendKeys(ConfigReader.getProperty("SSNnumber"));
    }


        @And("user enters a valid first name in the name textbox")
    public void userEntersAValidFirstNameInTheNameTextbox() {
           us_01Page.firstnametextbox.sendKeys(ConfigReader.getProperty("firstname"));
    }


    @And("user enters a valid last name  in the last name text box")
    public void userEntersAValidLastNameInTheLastNameTextBox() {
           us_01Page.lastnametextbox.sendKeys((ConfigReader.getProperty("lastname")));
    }

    @And("user enters a valid address in the address textbox")
    public void userEntersAValidAddressInTheAddressTextbox() {
          us_01Page.addresstextbox.sendKeys(ConfigReader.getProperty("address"));

    }

    @And("user enters a valid mobile phone number in the mobile phone number textbox")
    public void userEntersAValidMobilePhoneNumberInTheMobilePhoneNumberTextbox() {
           us_01Page.mobilephonetextbox.sendKeys(ConfigReader.getProperty("mobilephonenumber"));

    }

    @And("user enters a valid username in the username textbox")
    public void userEntersAValidUsernameInTheUsernameTextbox() {
           us_01Page.usernametextbox.sendKeys(ConfigReader.getProperty("username"));
    }


    @And("user enters a valid email address in the email address textbox")
    public void userEntersAValidEmailAddressInTheEmailAddressTextbox() {
           us_01Page.emailtextbox.sendKeys(ConfigReader.getProperty("email"));

    }

    @And("user enters a new password in the new password textbox")
    public void userEntersANewPasswordInTheNewPasswordTextbox() {
           us_01Page.secondPasswordtextbox.sendKeys(ConfigReader.getProperty("newpassword"));

    }

    @And("user enters the new password in the  password confirmation textbox")
    public void userEntersTheNewPasswordInThePasswordConfirmationTextbox() {
            us_01Page.secondPasswordtextbox.sendKeys(ConfigReader.getProperty("newpassword"));
    }



    @And("user clicks register")
    public void userClicksRegister() {
           us_01Page.registerdropdown.click();
    }

}














