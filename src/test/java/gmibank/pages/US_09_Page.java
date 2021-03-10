package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_09_Page {


        public US_09_Page(){
            PageFactory.initElements(Driver.getDriver(),this);
        }
        @FindBy(id = "entity-menu")
        public WebElement Myoperation;


        @FindBy(xpath = "//*[.='Manage Customers']")
        public WebElement ManageCustomers;

        @FindBy(xpath = "//*[.='Create a new Customer']")
        public  WebElement CreateanewCustomer;

        @FindBy(id = "search-ssn")
        public WebElement SSN;

        @FindBy(className = "btn btn-secondary")
        public WebElement search;

    @FindBy(id = "account-menu")
    public WebElement svgIcon;

    @FindBy(xpath = "//*[.='Sign in']")
    public WebElement signIn;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy( id = "password")
    public WebElement password;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement signInButton;

    @FindBy(id="save-entity")
    public WebElement saveButton;

}
