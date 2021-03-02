package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public class EndToEnd_Page {
    public EndToEnd_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "account-menu")
    public WebElement svgIcon;

    @FindBy(xpath = "//a[@href='#']")
    public WebElement loginAndRegisterButton;

    @FindBy(xpath = "//*[.='Register']")
    public WebElement registerMenuLink;

    @FindBy(id = "ssn")
    public WebElement ssnTextbox;

    @FindBy(xpath = "//div[.='Your SSN is invalid']")
    public WebElement ssnHataMesaji;

    @FindBy(id = "firstname")
    public WebElement firstnameTextbox;

    @FindBy(xpath = "//div[.='Your First Name is required']")
    public WebElement firstnameHataMesaji;

    @FindBy(id = "lastname")
    public WebElement lastnameTextbox;

    @FindBy(xpath = "//div[.='Your Last Name is required']")
    public WebElement lastnameHataMesaji;

    @FindBy(id = "address")
    public WebElement addressTextbox;

    @FindBy(id = "mobilephone")
    public WebElement mobilePhoneTextbox;

    @FindBy(xpath = "//div[.='Your mobile phone number is invalid']")
    public WebElement mobilePhoneHataMesaji;

    @FindBy(id = "username")
    public WebElement usernameTextbox;

    @FindBy(id = "email")
    public WebElement emailTextbox;

    @FindBy(id = "firstPassword")
    public WebElement firstPasswordTextbox;

    @FindBy(id = "secondPassword")
    public WebElement secondPasswordTextbox;

    @FindBy(id = "register-submit")
    public WebElement registerButton;

    @FindBy(xpath = "//strong[.='Registration saved!']")
    public WebElement registrationSuccessMessage;


    @FindBy(xpath = "(//a[@class='page-link'])[7]")
    public WebElement sonSayfa;


    @FindBy(xpath = "//a[@href='/admin/user-management/asdf11']")
    public WebElement aaaaaview;

    @FindBy(id = "activated")
    public WebElement activated;

    @FindBy(xpath = "//*[.='Search']")
    public WebElement searchButton;

    @FindBy(xpath = "//*[@id='search-ssn']")
    public WebElement searchSSN;

    @FindBy (id = "tp-customer-account")
    public WebElement accountDropdown;

    @FindBy(xpath = "//*[@data-icon='sign-out-alt']")
    public WebElement SignOut;

    @FindBy(xpath = "//*[.='Transfer Money']")
    public WebElement transferMoney;

    @FindBy(xpath = "//*[.='admin admin']")
    public WebElement exitAreaAdmin;

    @FindBy(xpath = "//*[.='werty werty']")
    public WebElement exitAreaWerty;

    @FindBy(xpath = "(//*[.='Home'])[1]")
    public WebElement homePage;

    @FindBy(id = "save-entity")
    public WebElement saveCustomer;


    @FindBy(id = "tp-customer-middleInitial")
    public WebElement middleInitial;

    @FindBy(id = "tp-customer-phoneNumber")
    public WebElement phoneNumber;

    @FindBy(id = "tp-customer-zipCode")
    public WebElement zipCode;

    @FindBy(id = "tp-customer-city")
    public WebElement cityCustomer;

    @FindBy(xpath = "(//*[.='employee employee'])[1]")
    public WebElement employeeCikis;


    @FindBy(xpath = "//select[@id='fromAccountId']")
    public WebElement fromAccountDropDown;

    @FindBy (xpath = "//select[@id='toAccountId']")
    public WebElement toAccountDropDown;

    @FindBy (xpath = "//input[@id='balance']")
    public WebElement balanceTextBox;

    @FindBy (xpath = "//textarea[@id='description']")
    public WebElement descriptionTextBox;

    @FindBy (xpath = "//button[@id='make-transfer']")
    public WebElement makeTransferButton;

    @FindBy (xpath = "//div[@class='Toastify__toast-body']")
    public WebElement succesfullMessage;

    @FindBy (xpath = "(//button[@class='btn btn-success btn-sm'])[1]")
    public WebElement viewTransaction_button;

    @FindBy (xpath = "//tbody//tr//td[2]")
    public List<WebElement> accountTtypesListesi;

    @FindBy (xpath = "//tbody//tr//td[3]")
    public List<WebElement> accountBalanceListesi;

    @FindBy (xpath = "(//table[@class='table table-striped'])[2]")
    public WebElement transactionTable;

    @FindBy(xpath = "//li[@id='entity-menu']")
    public WebElement myOperation_button;

    @FindBy(xpath = "//a[@href='/admin/user-management/werty89/edit']")
    public WebElement aaaaa;

    @FindBy(id = "tp-account-description")
    public WebElement decriptionAccountTextBox;


}
