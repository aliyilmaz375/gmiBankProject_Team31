package gmibank.stepdefinitions;

import gmibank.pages.US_01_Page;
import gmibank.utilities.ConfigReader;
import io.cucumber.java.en.And;

public class US_02_Stepdefinitions {
    US_01_Page us_01Page=new US_01_Page();

    @And("user enters a valid SSN number in the SSN textbox")
    public void userEntersAValidSSNNumberInTheSSNTextbox() {

    }


    @And("user enters a valid name in the name textbox")
    public void userEntersAValidNameInTheNameTextbox() {
    }

    @And("user enters an invalid last name  in the last name text box")
    public void userEntersAnInValidLastNameInTheLastNameTextBox() {
        us_01Page.lastnametextbox.sendKeys((ConfigReader.getProperty("gmibank_invalidlastname")));
    }


    @And("user clicks  register")
    public void userClicksRegister() {

    }





























}
