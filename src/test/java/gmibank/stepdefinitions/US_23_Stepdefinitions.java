package gmibank.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmibank.pojos.US_23_Pojo;
import gmibank.utilities.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_23_Stepdefinitions {

    Response response;
    ObjectMapper obj;
    US_23_Pojo[] us23Pojo;
    List<Map<String, Object>> listofAplicants ;
    JsonPath json;


    @Given("kullanici applicant end pointine gider {string}")
    public void kullaniciApplicantEndPointineGider(String url) {

        response=given().headers("Authorization","Bearer " + ConfigReader.getProperty("token"),
                "Content-Type", ContentType.JSON,
                "Accept",ContentType.JSON)
                .when()
                .get(url);
        response.prettyPrint();
        json= response.jsonPath();
    }


    @And("kullanici butun applicants billigilerini alir")
    public void kullaniciButunApplicantsBilligileriniAlir() throws IOException {

        obj = new ObjectMapper();
        us23Pojo = obj.readValue(response.asString(),US_23_Pojo[].class);

        for (int i=0; i<us23Pojo.length; i++){
            if(us23Pojo[i] !=null){
                System.out.println(us23Pojo[i].getFirstName()+" "+us23Pojo[i].getLastName()+" - "+ us23Pojo[i].getId());
            }
        }
    }


    @Then("status kodunun {int} oldugunu dogrulayin")
    public void statusKodununOldugunuDogrulayin(int str) {
        response.then().assertThat().statusCode(str);
    }

    @Then("applicants sayisini bulun ve dogrulayin")
    public void applicantsSayisiniBulunVeDogrulayin() {

        int expectedAplicantsSize = us23Pojo.length;
        int actualAplicantsSize = json.getList("$").size();
        System.out.println("============");
        System.out.println("applicants sayisi "+actualAplicantsSize);

        Assert.assertTrue(expectedAplicantsSize == actualAplicantsSize);
    }

    @Then("{string} adinda basvuran olup olmadigini kontrol edin")
    public void adindaBasvuranOlupOlmadiginiKontrolEdin(String name) {

        for (US_23_Pojo w: us23Pojo) {
            if (w.getFirstName().equals(name)) {
                Assert.assertTrue(true);
            }
        }
    }


    @Then("kullanici ilk id'nin {int} oldugunu dogrular")
    public void kullaniciIlkIdNinOldugunuDogrular(int id) {

        int expectedGetId = us23Pojo[0].getId();
        Assert.assertEquals(expectedGetId,id);
    }



}
