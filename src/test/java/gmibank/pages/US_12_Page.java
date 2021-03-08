package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_12_Page {

    public US_12_Page (){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//tbody//tr//td")
    public List<WebElement> TumData;

    @FindBy(xpath = "(//a[@aria-haspopup='true'])[1]")
    public WebElement myOperations;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement ManageCustomer;

    @FindBy(xpath = "(//a[@class='btn btn-info btn-sm'])[14]")
    public WebElement viewButon;

    @FindBy(xpath = "//*[@id='app-view-container']/div[1]/div/div/div/div/h2/b")
    public WebElement customerViewId;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement editButtonInView;

    @FindBy(linkText = "»»")
    public WebElement syfSon;

    @FindBy(linkText = "56")
    public WebElement syf56;

    @FindBy(xpath = "//tbody//tr//td[1]")
    public List<WebElement> idSutun;

    @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[2]")
    public WebElement editInfo;

    @FindBy(id = "tp-customer-firstName")
    public WebElement firstName;

    @FindBy(id = "tp-customer-lastName")
    public WebElement lastName;

    @FindBy(id = "tp-customer-middleInitial")
    public WebElement middleInitial;

    @FindBy(id = "tp-customer-email")
    public WebElement eMail;

    @FindBy(id = "tp-customer-mobilePhoneNumber")
    public WebElement mobilePhoneNumber;

    @FindBy(id = "tp-customer-phoneNumber")
    public WebElement phoneNumber;

    @FindBy(id = "tp-customer-createDate")
    public WebElement address;

    @FindBy(id = "tp-customer-createDate")
    public WebElement createDate;

    @FindBy(id="save-entity")
    public WebElement editSave;

    @FindBy(xpath = "//tbody//tr[1]//td")
    public List<WebElement> birinciSatir;

    @FindBy(xpath = "//tbody//tr[1]//td[2]")
    public WebElement satir1FirstName;

    @FindBy(xpath = "//tbody//tr[1]//td[3]")
    public WebElement satir1LastName;

    @FindBy(xpath = "//tbody//tr[1]//td[4]")
    public WebElement satir1MiddleInitial;

    @FindBy(id = "gmibankfrontendApp.tPCustomer.home.createOrEditLabel")
    public WebElement notSave;

    @FindBy(xpath = "//tbody//tr[1]//td[5]")
    public WebElement satir1Email;

    @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm'])[2]")
    public WebElement deleteButton;

    @FindBy(xpath = "//h5[@class='modal-title']")
    public WebElement confirmDeleteButtonMesage;

    @FindBy(id = "jhi-confirm-delete-tPCustomer")
    public WebElement AfterConfirmDeleteButton;
}
