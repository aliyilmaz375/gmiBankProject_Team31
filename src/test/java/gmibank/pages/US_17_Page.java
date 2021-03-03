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

    // @FindBy(xpath = "//tbody//tr[11]//td[6]")
    // public WebElement rollUser;

    //  @FindBy(xpath = "(//*[.='ROLE_USER'])[1]")
    //  public WebElement rollUser;

    @FindBy(xpath = "//*[.='View']")
    public WebElement viewButton;

    @FindBy(xpath = "//*[.='Edit']")
    public WebElement editButton;

    @FindBy(xpath = "//*[.='Delete']")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[.='Cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "//tbody//tr[1]//td")
    public List<WebElement> birinciSatirTumData;

    @FindBy(xpath = "//table/tbody/tr[1]/td[6]")
    public WebElement birinciSatirProfiles;

    @FindBy(id = "authorities")
    public WebElement pfofilesDropdown;

    @FindBy(xpath = "//*[.='ROLE_USER']")
    public WebElement roleUser;

    @FindBy(xpath = "//*[.='ROLE_ADMIN']")
    public WebElement roleAdmin;

    @FindBy(xpath = "//*[.='ROLE_EMPLOYEE']")
    public WebElement roleEmployee;

    @FindBy(xpath = "//*[.='ROLE_MANAGER']")
    public WebElement roleManager;

    @FindBy(xpath = "//*[.='ROLE_CUSTOMER']")
    public WebElement roleCustomer;

    @FindBy(id = "firstName")
    public WebElement firstNameButton;

    @FindBy(xpath = "//tbody//tr//td[6]")
    public List<WebElement> rollUser;

    @FindBy(xpath = "//tbody//tr//td[4]")
    public List<WebElement> deactivated;

    @FindBy(id = "activated")
    public WebElement activatedBox;

    @FindBy(xpath = "//*[.='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//tbody//tr//td[1]")
    public List<WebElement> idSutun;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement basariliMesaji;

    @FindBy(xpath = "//*[.='Deactivated']")
    public WebElement deactivatedButton;

    @FindBy(xpath = "//*[.='Activated']")
    public WebElement activatedButton;

    @FindBy(xpath = "//*[@href='/admin/user-management/aslinda/edit']")
    public  WebElement employeeEdit;

    @FindBy(xpath = "//*[@href='/admin/user-management/fakename/edit']")
    public  WebElement customerEdit;

    @FindBy(xpath = "//*[@href='/admin/user-management/pixie_manager/edit']")
    public  WebElement managerEdit;

    @FindBy(xpath = "//*[@href='/admin/user-management/pehlivan2934/edit']")
    public  WebElement userEdit;

    @FindBy(xpath = "//*[@href='/admin/user-management/example2ekasaba/edit']")
    public  WebElement adminEdit;

    @FindBy(xpath = "//*[@href='/admin/user-management/aslinda']")
    public  WebElement employeeView;

    @FindBy(xpath = "//*[@href='/admin/user-management/fakename']")
    public  WebElement customerView;

    @FindBy(xpath = "//*[@href='/admin/user-management/pixie_manager']")
    public  WebElement managerView;

    @FindBy(xpath = "//*[@href='/admin/user-management/pehlivan2934']")
    public  WebElement userView;

    @FindBy(xpath = "//*[@href='/admin/user-management/example2ekasaba']")
    public  WebElement adminView;

    @FindBy(xpath = "//*[@href='/admin/user-management/aslinda/delete']")
    public  WebElement employeeDelete;

    @FindBy(xpath = "//*[@href='/admin/user-management/fakename/delete']")
    public  WebElement customerDelete;

    @FindBy(xpath = "//*[@href='/admin/user-management/pixie_manager/delete']")
    public  WebElement managerDelete;

    @FindBy(xpath = "//*[@href='/admin/user-management/pehlivan2934/delete']")
    public  WebElement userDelete;

    @FindBy(xpath = "//*[@href='/admin/user-management/example2ekasaba/delete']")
    public  WebElement adminDelete;

    @FindBy(xpath = "//*[.='Your email is invalid.']")
    public WebElement hataMesaji;

    @FindBy(id = "email")
    public WebElement emailButton;






}
