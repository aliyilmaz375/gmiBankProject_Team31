package gmibank.stepdefinitions;

import gmibank.pojos.States;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.JSonUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_24_Stepdefinitions {

    Response response;
    int createdStateId;

    @And("users can create any state with endPoint {string}")
    public void usersCanCreateAnyStateWithEndPoint(String api_endPoint) {

        String expectedJson = " {\n" +
                "\"name\": \"Florida\", \n" +
                "\"tpcountry\": null\n" +
                "        }";
        Map<String, Object> expectedMap = JSonUtil.convertJsonToJava(expectedJson, Map.class);
        System.out.println(expectedMap);


        response= given().headers("Authorization",
                "Bearer "+ ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .body(expectedMap)
                .post(api_endPoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        response.prettyPrint();

    }

    @Then("validate created state")
    public void validate_created_state() {
        JsonPath jsonPath = response.jsonPath();
        createdStateId = jsonPath.getInt("id");
        System.out.println("createdId: "+ createdStateId);

        response= given().headers("Authorization",
                "Bearer "+ ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get("https://www.gmibank.com/api/tp-states")
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

       String id = jsonPath.getString("id");

        String stringCreatedStateId = String.valueOf(createdStateId);
        Assert.assertTrue(id.contains(stringCreatedStateId));

        /*
       response = given().
                auth()
                .oauth2(ConfigReader.getProperty("token"))
                .contentType(ContentType.JSON)
                .when()
                .get(api_end_point)
                 .then()
        .contentType(ContentType.JSON)
        .extract()
        .response();
        response.prettyPrint();
       */

    }
}
