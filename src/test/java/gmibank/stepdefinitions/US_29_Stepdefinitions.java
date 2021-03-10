package gmibank.stepdefinitions;

import gmibank.pojos.Country;
import gmibank.utilities.DatabaseUtility;
import gmibank.utilities.WriteToTxt;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class US_29_Stepdefinitions {

    String queryUser = "SELECT * FROM jhi_user";
    String queryCountry = "SELECT * FROM tp_country";
    String queryState = "SELECT * FROM public.tp_state";
    List <Country> dbCountry = new ArrayList<>();

    @Given("kullanici GMIBank Database' ine baglanir")
    public void kullaniciGMIBankDatabaseIneBaglanir() {

        DatabaseUtility.createConnection();
    }


    @Given("kullanici tum user bilgilerini alir")
    public void kullaniciTumUserBilgileriniAlir() {

        //String allCustomerInfo =  DatabaseUtility.getQueryResultList(queryUser).toString();
        //System.out.println(DatabaseUtility.getColumnNames(allCustomerInfo));
        //System.out.println(allCustomerInfo);
    }

    @And("kullanici tum user'lara ait login isimlerini alir")
    public void kullaniciTumUserlaraAitLoginIsimleriniAlir() {
        System.out.println("=============");
        System.out.println(DatabaseUtility.getColumnData(queryUser, "login"));
    }

    @Then("kullanici ucuncu satirdaki ismin elvis.welch oldugunu dogrular")
    public void kullaniciUcuncuSatirdakiIsminOldugunuDogrular() {
        System.out.println("=============");
        System.out.println(DatabaseUtility.getCellValuewithRowsAndCells(queryUser,2,1));
        Assert.assertEquals("elvis.welch",DatabaseUtility.getCellValuewithRowsAndCells(queryUser,2,1));
        System.out.println("isim basarili bir sekilde dogrulandi");
    }



    @Given("kullanici bir {string} ve {string} girer")
    public void kullanici_bir_ve_girer(String query, String columnName) {
        List<Object> list = DatabaseUtility.getColumnData(query,columnName);
        Country[]countries1 = new Country[list.size()];
        for (int i=0; i<list.size()-1; i++){
            Country country  = new Country();
            country.setId(Integer.parseInt(list.get(i).toString().trim()));
            dbCountry.add(country);
            // System.out.println(dbCountry.get(i).getId());
        }

    }

    @Then("kullanici id'si {int} olan ulkeyi dogrular")
    public void kullanici_idsi_olan_ulkeyi_dogrular(Integer CountryId) {
        List <Integer> createdIds = new ArrayList<>();
        for(int i = 0 ; i<dbCountry.size();i++){
            createdIds.add(dbCountry.get(i).getId());
        }

        System.out.println("=============");
        System.out.println();

        Assert.assertTrue(createdIds.contains(CountryId));

        System.out.println("Ulke dogrulama basarili");
    }

    @Given("kullanici tum state bilgilerini alir")
    public void kullaniciTumStateBilgileriniAlir() {

        System.out.println("-------");
        System.out.println(DatabaseUtility.getQueryResultList(queryState));

    }

    @And("kullanici tum state isimlerini alir")
    public void kullaniciTumStateIsimleriniAlir() {

        System.out.println("-------");
        System.out.println(DatabaseUtility.getColumnData(queryState, "name"));

    }

    @Then("kullanici ilk satirdaki ismin Virginia oldugunu dogrular")
    public void kullaniciIlkSatirdakiIsminVirginiaOldugunuDogrular() {

        System.out.println("-------");
        System.out.println(DatabaseUtility.getCellValuewithRowsAndCells(queryState,0,1));
        Assert.assertEquals("Virginia",DatabaseUtility.getCellValuewithRowsAndCells(queryState,0,1));
        System.out.println("State dogrulama basarili");

    }
}


