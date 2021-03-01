package gmibank.stepdefinitions;

import gmibank.pages.US_10_Page;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class US_10_Stepdefinitions {

    US_10_Page us10Page = new US_10_Page();
    Actions actions=new Actions(Driver.getDriver());



    @And("kullanici adres kutusuna bir adres girer")
    public void kullaniciAdresKutusunaBirAdresGirer() throws InterruptedException {
    actions.sendKeys(Keys.PAGE_DOWN).perform();
    Thread.sleep(2000);

        us10Page.adreskutusu.sendKeys("Ankara");



    }


    @And("kullanici city kutusuna bir sehir girer")
    public void kullaniciCityKutusunaBirSehirGirer() throws InterruptedException {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);

        us10Page.citykutusu.sendKeys("Ankara");
    }

    @And("kullanici state kutusuna bir sehir girer")
    public void kullaniciStateKutusunaBirSehirGirer() throws InterruptedException {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);

        us10Page.statekutusu.sendKeys("Ankara");



    }

    @And("kullanici country kutusuna bir ulke girer")
    public void kullaniciCountryKutusunaBirUlkeGirer() throws InterruptedException {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);

        Select select=new Select(us10Page.countrykutusu);

        select.selectByIndex(10);


    }
}
