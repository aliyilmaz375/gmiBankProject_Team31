package gmibank.stepdefinitions;

import gmibank.pages.US_14_Page;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.Then;


public class US_14_Stepdefinitions {

    US_14_Page us14Page = new US_14_Page();

    @Then("kullanici Create Date girildigini dogrular")
    public void kullaniciCreateDateGirildiginiDogrular() {

        ReusableMethods.waitFor(2);
        System.out.println(us14Page.createAccountDate.getAttribute("deger"));
    }

    @Then("kullanici Close Date girildigini dogrular")
    public void kullaniciCloseDateGirildiginiDogrular() {

        ReusableMethods.waitFor(2);
        System.out.println(us14Page.closeDate.getAttribute("deger"));
    }
}
