package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_16_Page {
   public US_16_Page(){
       PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath = "//*[.='Transfer Money']")
    public WebElement transferMoney_button;

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

    @FindBy (xpath = "//div[@class='invalid-feedback']")
    public WebElement max5Caracter;

    @FindBy (xpath = "//div[@class='Toastify__toast-body']")
    public WebElement balanceExceedMessage;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement descriptionEmptyMessage;
}
