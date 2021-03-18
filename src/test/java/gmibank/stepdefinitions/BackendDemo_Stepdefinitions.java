package gmibank.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmibank.pojos.US_23_Pojo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import org.codehaus.jackson.type.TypeReference;
import org.junit.Assert;
import gmibank.pojos.Country;
import gmibank.pojos.Customer;

import gmibank.utilities.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static gmibank.jsonModels.CountryJson.createCountry2;
import static gmibank.utilities.DatabaseUtility.getQueryResultList;
import static io.restassured.RestAssured.given;



public class BackendDemo_Stepdefinitions {

    Response response;
    Response responseAll;
    JsonPath jsonPath;
    Country[] country;
    List<Country> dbCountry = new ArrayList<>();
    List<String> listId = new ArrayList<>();
    Country[] countries;


    String queryUser = "SELECT * FROM jhi_user";
    String queryCountry = "SELECT * FROM tp_country";
    String queryState = "SELECT * FROM public.tp_state";

    @Given("kullanici tum ulkeleri okur {string}")
    public void kullaniciTumUlkeleriOkur(String string) {

        response = given().headers(
                "Authorization",
                "Bearer " + ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(string)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();

        response.prettyPrint();


    }

    @And("kullanici tum ulke verilerini dogrular")
    public void kullaniciTumUlkeVerileriniDogrular() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        country = objectMapper.readValue(response.asString(), Country[].class);

        for (int i = 0; i < country.length; i++) {
            listId.add(country[i].getId().toString());
        }


        WriteToTxt.saveDataInFileWithid("allCountriesId1.txt", country);
        List<String> readId = ReadTxt.returnCustomerSNNList("allCountriesId1.txt");

        Assert.assertEquals("not match", listId, readId);
        System.out.println("Dogrulama basarili");

        /*
        JsonPath jsonPath = response.jsonPath();
        String countryId = jsonPath.getString("id");
        Assert.assertTrue("bulunamadi ", countryId.contains("74418"));
         */
    }

    @Given("kullanici end pointindeki {string} id yi siler {string}")
    public void kullaniciEndPointindekiIdYiSiler(String api_endpoint_url, String id) {
        response = given().headers(
                "Authorization",
                "Bearer " + ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .delete(api_endpoint_url + id)
                .then()
                .extract()
                .response();

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
        Assert.assertFalse("silinemedi", kalan_IDler.contains(id));
        System.out.println("Ulke basariyla silindi");


    }


    @And("kullanici customer bilgilerini alir")
    public void kullaniciCustomerBilgileriniAlir() {


        List<Customer> listOfCustomers = new ArrayList<>();


        List<List<Object>> list = getQueryResultList("Select * from tp_customer");
        for (int i = 5; i <= 20; i++) {
            Customer customer = new Customer();

            customer.setFirstName(list.get(i).get(1).toString());
            customer.setLastName(list.get(i).get(2).toString());
            customer.setMobilePhoneNumber(list.get(i).get(5).toString());
            customer.setCity(list.get(i).get(9).toString());
            customer.setSsn(list.get(i).get(10).toString());

            listOfCustomers.add(customer);
        }

        PDFGenerator.pdfGeneratorRowsAndCellsWithListFirstToFive("                  TEAM-31 PDF DOKUMAN  \n                                                      === Customer Bilgileri ===", listOfCustomers, "customer.pdf");
        System.out.println("===========");
        System.out.println("Pdf dokumani olusturuldu");
    }


    @Given("kullanici applicant bilgilerini okur {string}")
    public void kullaniciApplicantBilgileriniOkur(String endpoint) {

        response = given().
                accept(ContentType.JSON).
                auth().oauth2(ConfigReader.getProperty("token")).
                when().
                get(endpoint);
       // response.prettyPrint();

    }


    @Then("kullanici tum applicant bilgilerini pdf formatinda alir")
    public void kullaniciTumApplicantBilgileriniPdfFormatindaAlir() {


        org.codehaus.jackson.map.ObjectMapper objectMapper = new org.codehaus.jackson.map.ObjectMapper();
        List<US_23_Pojo> applicants = null;
        try {
            applicants = objectMapper.readValue(response.asString(), new TypeReference<List<US_23_Pojo>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        PDFGenerator.createTableWithPojoApplicants("applicants.pdf", applicants);
    }



}



