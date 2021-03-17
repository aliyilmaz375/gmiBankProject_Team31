package gmibank.stepdefinitions;

import gmibank.utilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class US_27_Stepdefinitions {

    Response response;
    Response responseAll;

    @Given("kullanici end pointindeki {string} bir state ait id yi siler {string}")
    public void kullaniciEndPointindekiBirStateAitIdYiSiler(String api_endpoint_url, String id) {

        response = given().headers(
                "Authorization",
                "Bearer " + ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .delete(api_endpoint_url+id)
                .then()
                .extract()
                .response();
        response.prettyPrint();

        responseAll = given().headers(
                "Authorization",
                "Bearer " + ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(api_endpoint_url)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();


        JsonPath jsonPath = responseAll.jsonPath();
        String kalan_IDler = jsonPath.getString("id");
        Assert.assertFalse("silinemedi",kalan_IDler.contains(id));
        System.out.println("basariyla silindi");


    }
}
