package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class US_04_Page {

    public US_04_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

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

    @FindBy(xpath = "//*[.='employee employee']")
    public WebElement kullaniciIsmi;

    @FindBy(xpath = "(//a[@class='d-flex align-items-center dropdown-toggle nav-link'])[3]")
    public WebElement exitArea;

    @FindBy(xpath = "//*[.='Sign out']")
    public WebElement SignOut;
}
