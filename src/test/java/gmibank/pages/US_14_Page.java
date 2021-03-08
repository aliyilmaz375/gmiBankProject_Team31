package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_14_Page {

    public US_14_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "tp-account-closedDate")
    public WebElement closeDate;

    @FindBy(id = "tp-account-createDate")
    public WebElement createAccountDate;


}
