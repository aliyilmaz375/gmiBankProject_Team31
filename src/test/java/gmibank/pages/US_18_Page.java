package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public class US_18_Page {

    public US_18_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[.='My Operations']")
    public WebElement myOperations;

    @FindBy(xpath = "//*[.='Manage Customers']")
    public WebElement manageCustomers;

    @FindBy(xpath = "//tbody//tr//td[2]")
    public List<WebElement> firstName;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> tumBilgiler;

    @FindBy(xpath = "//*[.='View']")
    public WebElement viewButton;

    @FindBy(xpath = "//*[.='Edit']")
    public WebElement editButton;

    @FindBy(xpath = "//*[.='Delete']")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[.='Cancel']")
    public WebElement cancelButton;

    @FindBy(id = "tp-customer-firstName")
    public WebElement firstNameButton;

    @FindBy (xpath = "//*[.='Save']")
    public WebElement saveButton;


}
