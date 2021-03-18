package gmibank.stepdefinitions;

import gmibank.utilities.ConfigReader;
import io.cucumber.java.en.And;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static gmibank.jsonModels.CountryJson.createCountry2;
import static io.restassured.RestAssured.given;

public class US_25_Stepdefinitions {

    Response response;

    @And("kullanici bir ulke olusturur {string}")
    public void kullaniciBirUlkeOlusturur(String string) {


        response = given().headers(
                "Authorization",
                "Bearer " + ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .body(createCountry2)
                .post(string)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        response.prettyPrint();
    }

}
