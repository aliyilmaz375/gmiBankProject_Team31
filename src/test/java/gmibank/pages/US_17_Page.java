package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class US_17_Page {

    public US_17_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[.='Administration']")
    public WebElement administration;

    @FindBy(xpath = "//*[.='User management']")
    public WebElement userManagement;

    @FindBy(xpath = "//tbody//tr[11]//td[6]")
    public WebElement rollUser;



}
