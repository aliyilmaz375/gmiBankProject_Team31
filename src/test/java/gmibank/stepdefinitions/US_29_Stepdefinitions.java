package gmibank.stepdefinitions;

import gmibank.utilities.ConfigReader;
import gmibank.utilities.DatabaseUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class US_29_Stepdefinitions {

    ResultSet resultSetUser;
    String UserDataQuery = "SELECT * FROM" + ConfigReader.getProperty("usersTable");
    List<String> userFirstName = new ArrayList<>();


    @Given("kullanici GMIBank Database' ine baglanir")
    public void kullaniciGMIBankDatabaseIneBaglanir() {

        DatabaseUtility.createConnection("url", "username", "password");

    }


    @Given("kullanici tum datalari okuyabilmelidir")
    public void kullaniciTumDatalariOkuyabilmelidir() throws SQLException {

        ResultSetMetaData userMetaData = resultSetUser.getMetaData();
        int columnCount = userMetaData.getColumnCount();

        for (int i = 1; i <= columnCount; i++) {
            System.out.println(userMetaData.getColumnName(i));
        }

        while (resultSetUser.next()) {
            String firstname = resultSetUser.getString("first_name");
            userFirstName.add(firstname);
        }

        System.out.println(userFirstName);
        
    }

    @Then("kullanici tum kullanici datalarini dogrulamalidir")
    public void kullaniciTumKullaniciDatalariniDogrulamalidir() {

    }


}
