package gmibank.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class US_24_Stepdefinitions {

    Response response;

    @Given("create a country {string}")
    public void create_a_country(String api_url) {
        response = given().
                auth().
                oauth2("").
                body("").
                when().post(api_url);

    }

    @Then("validate created state")
    public void validate_created_state() {

    }
}
