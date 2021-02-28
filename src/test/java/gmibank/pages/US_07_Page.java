package gmibank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US_07_Page {

    @FindBy(className = "invalid-feedback")
    public WebElement hataMesajiEmail;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement hataMesajiIsim;

}

