package gmibank.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmibank.pojos.Customer;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.ReadTxt;
import gmibank.utilities.WriteToTxt;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.io.IOException;
import java.util.List;

import static io.restassured.RestAssured.*;

public class US_20_Stepdefinitions {
    Response response;
    Customer[] customer;


    @Given("kullanici adresteki end_pointe gider {string}")
    public void kullanici_adresteki_end_pointe_gider(String end_point) {
    response=given().headers("Authorization","Bearer " + ConfigReader.getProperty("token"),
                "Content-Type", ContentType.JSON,
                "Accept",ContentType.JSON)
                .when()
                .get(end_point)
                .then()
                .contentType(ContentType.JSON)
               .statusCode(200)
                .extract().response();
       response.prettyPrint();

        System.out.println("---------------------------------------");
    }




    @Given("Tum customers okunabilmeli")
    public void tum_customers_okunabilmeli() throws IOException {
       ObjectMapper objectMapper=new ObjectMapper();

         customer=objectMapper.readValue(response.asString(),Customer[].class);
       System.out.println(customer[0].getFirstName());
        System.out.println(customer[2].getAddress());

      /*  for(int i=0; i<customer.length; i++){
            System.out.println(customer[i].getFirstName());
        }
        for(int i=0; i<customer.length;i++) {
            if (customer[i].getUser() != null) {
                System.out.println(customer[i].getUser().getFirstName());
            }
        }
*/
    }

    @Then("Tum customers dogrulanmali")
    public void tum_customers_dogrulanmali() {
       WriteToTxt.saveDataInFileAllCustomersInfo("allCustomersInfo",customer);
        JsonPath jsonPath = response.jsonPath();


        List<String> nameList=jsonPath.getList("firstName");
        System.out.println(nameList);
        String nameListValidate[]={"Jeffrey", "Remona", "Rosella", "Mariana", "Ali", "Francisco", "Demo", "Maria", "Jacqueline", "Wendell", "Alda", "Ariel", "ismail", "Demo", "Everette", "US11" };

        for (String w:nameListValidate){
            Assert.assertTrue(" id kaydi yok",nameList.contains(w));
        }



    }

}
