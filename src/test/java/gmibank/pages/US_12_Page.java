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


    @FindBy(xpath = "//tbody//tr[1]//td")
    public List<WebElement> birinciSatirTumData;

    @FindBy(xpath = "(//a[@aria-haspopup='true'])[1]")
    public WebElement myOperations;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement ManageCustomer;

    @FindBy(xpath = "(//a[@class='btn btn-info btn-sm'])[14]")
    public WebElement viewButon;

    @FindBy(xpath = "//*[@id='app-view-container']/div[1]/div/div/div/div/dl/dd")
    public List<WebElement> customerViewSatir;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement editButtonInView;

}
