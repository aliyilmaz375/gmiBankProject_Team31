package gmibank.stepdefinitions;

import gmibank.pojos.States;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class US_22_Stepdefinitions {
    Response response;

    List<Integer> id=new ArrayList<>();
    States[] states;
    JsonPath jsonPath;
    private ConfigReader ConfigReader;


    @Given("Kullanici state end point e gider  {string}")
    public void kullaniciStateEndPointEGider(String states_url) {
        response = given().headers(
                "Authorization",
                "Bearer " + ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(states_url)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();
        //response.prettyPrint();


    }

    @Then("Kullanici bir state ismini dogrular")
    public void kullaniciBirStateIsminiDogrular() {

        jsonPath=response.jsonPath();
        String firstName=jsonPath.getString("name");
        String expectedStateName="Virginia";
        Assert.assertTrue("State bulunamadi",firstName.contains(expectedStateName));
        System.out.println("State basariyla dogrulandi");
    }

    @And("Kullanici verileri De-Serialization formatinda alir")
    public void kullaniciVerileriDeSerializationFormatindaAlir() {

        jsonPath=response.jsonPath();
        String firstName=jsonPath.getString("name");
        System.out.println(firstName);
    }
}
