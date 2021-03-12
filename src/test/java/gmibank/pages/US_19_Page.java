package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_19_Page {

    public US_19_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[.='My Operations']")
    public WebElement myOperations;

    @FindBy(xpath = "//*[.='Manage Accounts']")
    public WebElement manageAccounts;

    @FindBy(id = "jh-create-entity")    //       // a[@id='jh-create-entity']
    public WebElement createNewAccount;

    @FindBy(id = "tp-account-description")
    public WebElement description;

    @FindBy(id = "tp-account-balance")
    public WebElement balance;

    @FindBy(id = "tp-account-accountType")
    public WebElement accountTypeDropdown;

    @FindBy(id = "tp-account-accountStatusType")
    public WebElement accountStatusType;

    @FindBy(id = "tp-account-createDate")
    public WebElement createAccountDate;

    @FindBy(id = "tp-account-closedDate")
    public WebElement closeDate;

    @FindBy (xpath = "//*[.='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement succesMessage;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement hataMesaji;


}
