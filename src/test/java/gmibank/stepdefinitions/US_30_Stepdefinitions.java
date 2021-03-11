package gmibank.stepdefinitions;

import gmibank.pojos.Customer;
import gmibank.utilities.PDFGenerator;
import io.cucumber.java.en.Given;

import java.util.ArrayList;
import java.util.List;

import static gmibank.utilities.DatabaseUtility.getQueryResultList;

public class US_30_Stepdefinitions {

    @Given("kullanici query girer {string}")
    public void kullanici_query_girer(String query) {
        List <Customer> listOfCustomers = new ArrayList<>();

        List <List< Object>> list =getQueryResultList(query);
        for (int i=0; i<=5; i++){
            Customer customer = new Customer();

            customer.setFirstName(list.get(i).get(1).toString());
            customer.setLastName(list.get(i).get(2).toString());
            customer.setMobilePhoneNumber(list.get(i).get(5).toString());
            customer.setCity(list.get(i).get(9).toString());
            customer.setSsn(list.get(i).get(10).toString());

            listOfCustomers.add(customer);
        }

        PDFGenerator.pdfGeneratorRowsAndCellsWithListFirstToFive("kullanici bilgileri",listOfCustomers,"kullanici_bilgileri.pdf" );


    }

}

