package gmibank.pages;

import gmibank.utilities.Driver;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_15_16_Page {
    public US_15_16_Page() {
        PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//li[@id='entity-menu']")
    public WebElement myOperation_button;

    @FindBy (xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement myAccounts_button;

    @FindBy (xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement transferMoney_button;

    @FindBy (xpath = "(//button[@class='btn btn-success btn-sm'])[1]")
    public WebElement viewTransaction_button;

    @FindBy (xpath = "//tbody//tr//td[2]")
    public List<WebElement> accountTtypesListesi;

    @FindBy (xpath = "//tbody//tr//td[3]")
    public List<WebElement> accountBalanceListesi;

}


