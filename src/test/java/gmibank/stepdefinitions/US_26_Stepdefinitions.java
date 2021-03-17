package gmibank.stepdefinitions;

import gmibank.pojos.Country;
import gmibank.utilities.ConfigReader;
import io.cucumber.java.en.And;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.codehaus.jackson.map.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static io.restassured.RestAssured.given;
import org.junit.Assert;


public class US_26_Stepdefinitions {
    Response response;
    Country[] countries;


    @Given("kullanici end pointe gider {string}")
    public void kullaniciEndPointeGider(String string) throws IOException {

        response = given().
                headers("Authorization",
                        "Bearer " + ConfigReader.getProperty("token"),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON).
                when().
                get(string).
                then().
                contentType(ContentType.JSON).
                statusCode(200).
                extract().
                response();
           response.prettyPrint();

        ObjectMapper objectMapper = new ObjectMapper();
        countries=objectMapper.readValue(response.asString(),Country[].class);
        for (int i=0; i<countries.length; i++){
            System.out.println(countries[i].getName());
        }


    }

    @And("kullanici bir ulkenin id ve name ini degistirebilir {string} {string} {string}")
    public void kullaniciBirUlkeninIdVeNameIniDegistirebilir(String endPoint, String newname, String id) {

        Map<String, Object> countryPut = new HashMap<>();
        System.out.println("*********************************************");

        countryPut.put("id", id);
        countryPut.put("name", newname);
        countryPut.put("states", null);

        response = given()
                .auth()
                .oauth2(ConfigReader.getProperty("token"))
                .contentType(ContentType.JSON)
                .when()
                .body(countryPut)
                .put(endPoint)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();
        response.prettyPrint();

        Assert.assertEquals("Ulke ismi degistirilemedi", countryPut.get("name"),"Hollanda");




    }
}
