package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_006_Page {

    public US_006_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "account-menu")
    public WebElement accountMenu;

    @FindBy(xpath = "//*[.='User Info']")
    public WebElement userInfo;

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "langKey")
    public WebElement langKey;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement SaveBtn;

    @FindBy(xpath = "//strong[2]")
    public  WebElement SaveMesaji;

    @FindBy(className = "invalid-feedback")
    public WebElement hataMesaji;
}
