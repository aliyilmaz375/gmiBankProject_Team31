package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_13_Page {
    public US_13_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[.='Manage Accounts']")
    public WebElement manageAccounts;

    @FindBy(id = "jh-create-entity")
    public WebElement createAccount;

    @FindBy(id = "tp-account-description")
    public WebElement description;

    @FindBy(id="tp-account-balance")
    public WebElement balance;

    @FindBy(name = "accountType")
    public WebElement accountType;

    @FindBy(xpath = "//option[@value='CHECKING']")
    public WebElement checking;

    @FindBy(xpath ="//option[@value='SAVING']")
    public WebElement saving;

    @FindBy(xpath = "//option[@value='CREDIT_CARD']")
    public WebElement creditCard;

    @FindBy(xpath = "//option[@value='INVESTING']")
    public WebElement investing;

    @FindBy(name = "accountStatusType")
    public WebElement accountStatusType;

    @FindBy(name = "createDate")
    public WebElement createDate;

    @FindBy(id="tp-account-closedDate")
    public WebElement closeDate;

    @FindBy(xpath = "//*[.='Save']")
    public WebElement saveButonu;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement hataMesaji;



}
