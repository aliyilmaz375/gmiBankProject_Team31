package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_02_Page {
    public US_02_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="register-submit")
    public WebElement registerdropdown;

    @FindBy(name="ssn" )
    public WebElement ssnNumber;

    @FindBy(id="firstname")
    public WebElement firstnametextbox;

    @FindBy(id="lastname")
    public WebElement lastnametextbox;

    @FindBy(id="address")
    public WebElement addresstextbox;

    @FindBy(id="mobilephone")
    public WebElement mobilephonetextbox;

    @FindBy(name="username")
    public WebElement usernametextbox;

    @FindBy(name="email")
    public WebElement emailtextbox;


    @FindBy(name="firstPassword")
    public WebElement firstPasswordtextbox;

    @FindBy(name="secondPassword")
    public WebElement secondPasswordtextbox;



































}
