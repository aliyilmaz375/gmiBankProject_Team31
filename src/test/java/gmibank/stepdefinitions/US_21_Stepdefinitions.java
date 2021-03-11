package gmibank.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmibank.pojos.Country;
import gmibank.pojos.Customer;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.WriteToTxt;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.List;

import static io.restassured.RestAssured.given;

public class US_21_Stepdefinitions {
 Response response;
Country[] country;
JsonPath jsonPath;

    @Given("Kullanici adresteki end_pointe gider {string}")
    public void kullanici_adresteki_end_pointe_gider(String api_end_point) {
        response=given().headers("Authorization","Bearer " + ConfigReader.getProperty("token"),
                "Content-Type", ContentType.JSON,
                "Accept",ContentType.JSON)
                .when()
                .get(api_end_point)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract().response();
        response.prettyPrint();

    }

    @Given("Read all countries you created and validate them from your data set")
    public void read_all_countries_you_created_and_validate_them_from_your_data_set()throws IOException {
        JsonPath jsonPath=response.jsonPath();
         ObjectMapper objectMapper=new ObjectMapper();

        country=objectMapper.readValue(response.asString(),Country[].class);
       /* System.out.println(country[0].getName());


        for(int i=0;i<country.length;i++){
            id.add(country[i].getId());

        }

        */
        WriteToTxt.saveDataInFileWithid("idCountry",country);



    }

    @Then("Read all countries you created and validate them {int} by {int}")
    public void read_all_countries_you_created_and_validate_them_by(Integer int1, Integer int2) {

        JsonPath jsonPath = response.jsonPath();
        //int id = jsonPath.getInt("id");

        List<Integer> idList=jsonPath.getList("id");
        System.out.println(idList);
        int idvalidateArray[]={22330, 22331, 22332, 22333, 22334, 22335, 22336, 22337, 22338, 22339, 22341, 22342, 22343, 22346, 22347};

        for (int w:idvalidateArray){
            Assert.assertTrue(" id kaydi yok",idList.contains(w));
        }


    }


}
