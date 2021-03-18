package gmibank.utilities;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import gmibank.pojos.Country;
import gmibank.pojos.Customer;
import gmibank.pojos.US_23_Pojo;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;


public class PDFGenerator {


    public static void pdfGenerator(String header, String fileName){

        Document document = new Document();
        String pdf_path = fileName;
        String pdf_title = header;
        List<String> headers = new ArrayList<String>();
        headers.add("Applicant");
        headers.add("SSN");
        headers.add("Country");
        headers.add("State");
        headers.add("Zip code");

        try{

            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdf_path));

            document.open();

            document.add(new Paragraph(pdf_title));

            PdfPTable table = new PdfPTable(headers.size());

            table.setWidthPercentage(110);
            table.setSpacingBefore(12);
            table.setSpacingAfter(12);
            float [] colWidth = {2,2,2,2,2};
            table.setWidths(colWidth);

            for (int i=0; i<headers.size();i++){
                PdfPCell cellHeader = new PdfPCell(new Paragraph("    "+headers.get(i)));
                table.addCell(cellHeader);

            }



            document.add(table);

            document.close();

            writer.close();

        }

        catch(Exception e){
            e.printStackTrace();
        }


    }


    public static void pdfGeneratorRowsAndCells(String header, String fileName){

        Document document = new Document();
        String pdf_path =  fileName;
        String pdf_title = header;
        //  String logo_path = "/Users/ibrahimkalin/Downloads/Techproed.jpg";
        List<String> headers = new ArrayList<String>();
        headers.add("Applicants");
        headers.add("SSNs");
        headers.add("Countries");
        headers.add("States");
        headers.add("Zip codes");


        List <String> rowData = new ArrayList<String>();
        rowData.add("Ibrahim");
        rowData.add("2020202202");
        rowData.add("USA");
        rowData.add("North Carolina");
        rowData.add("22180");
        rowData.add("final");



        try{

            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdf_path));

            document.open();

            document.add(new Paragraph("                                     "+pdf_title));

            PdfPTable table = new PdfPTable(5);
            table.setWidthPercentage(110);
            table.setSpacingBefore(25);
            table.setSpacingAfter(25);
            float [] colWidth = {3,3,3,3,3};
            table.setWidths(colWidth);




            PdfPCell cell1 = new PdfPCell(new Phrase(headers.get(0)));
            table.addCell(cell1);

            PdfPCell cell2 = new PdfPCell(new Phrase(headers.get(1)));
            table.addCell(cell2);

            PdfPCell cell3 = new PdfPCell(new Phrase(headers.get(2)));
            table.addCell(cell3);


            PdfPCell cell4 = new PdfPCell(new Phrase(headers.get(3)));
            table.addCell(cell4);

            PdfPCell cell5 = new PdfPCell(new Phrase(headers.get(4)));
            table.addCell(cell5);


            table.setHeaderRows(2);

            table.addCell(rowData.get(0));
            table.addCell(rowData.get(1));
            table.addCell(rowData.get(2));
            table.addCell(rowData.get(3));
            table.addCell(rowData.get(4));


            table.addCell("Ahmet");
            table.addCell("4278382734");
            table.addCell("USA");
            table.addCell("Virginia");
            table.addCell("55123");

            document.add(table);

            //    document.add(Image.getInstance(logo_path));
            document.close();

            writer.close();

        }

        catch(Exception e){
            e.printStackTrace();
        }


    }



    public static void pdfGeneratorRowsAndCellsWithList(String header, List <Customer> list, String fileName){

        Document document = new Document();
        String pdf_path = fileName;
        String pdf_title = header;
        //    String logo_path = "/Users/ibrahimkalin/Downloads/Techproed.jpg";
        List<String> headers = new ArrayList<String>();
        headers.add("Applicants");
        headers.add("SSNs");
        headers.add("Countries");
        headers.add("States");
        headers.add("Zip codes");



        try{

            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdf_path));

            document.open();

            document.add(new Paragraph("                                     "+pdf_title));

            PdfPTable table = new PdfPTable(5);
            table.setWidthPercentage(110);
            table.setSpacingBefore(25);
            table.setSpacingAfter(25);
            float [] colWidth = {2,2,2,2,2};
            table.setWidths(colWidth);



            for(int i=0;i<headers.size();i++) {

                PdfPCell cell1 = new PdfPCell(new Phrase(headers.get(i)));
                table.addCell(cell1);

            }

            table.setHeaderRows(list.size());

            for(int i=0;i<list.size();i++ ) {

                table.addCell(list.get(i).getFirstName());
                table.addCell(list.get(i).getSsn());
                table.addCell(list.get(i).getCountry().getName());
                table.addCell(list.get(i).getState());
                table.addCell(list.get(i).getZipCode());

            }
            document.add(table);

            //    document.add(Image.getInstance(logo_path));
            document.close();

            writer.close();

        }

        catch(Exception e){
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        pdfGenerator("kullanici bilgiler","kullanici_bilgileri.pdf");

        List <Customer> list = new ArrayList<>();
        Country country = new Country();
        country.setName("USA");
        Customer customer = new Customer();
        customer.setFirstName("Emine");
        customer.setState("MA");
        customer.setSsn("202020202");
        customer.setZipCode("02120");
        customer.setCountry(country);

        list.add(customer);

        String header = "All Applicants Information";
        String fileName ="applicants.pdf";

        pdfGeneratorRowsAndCellsWithList(header,list,fileName);
    }

    public static void pdfGeneratorRowsAndCellsWithListFirstToFive(String header, List <Customer> list, String fileName){

        Document document = new Document();
        String pdf_path = fileName;
        String pdf_title = header;

        List<String> headers = new ArrayList<String>();
        headers.add("Firstname");
        headers.add("LastName");
        headers.add("Mobile Number");
        headers.add("City");
        headers.add("SSN Number");



        try{

            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdf_path));

            document.open();

            document.add(new Paragraph("                                     "+pdf_title));

            PdfPTable table = new PdfPTable(5);
            table.setWidthPercentage(110);
            table.setSpacingBefore(25);
            table.setSpacingAfter(25);
            float [] colWidth = {2,2,2,2,2};
            table.setWidths(colWidth);



            for(int i=0;i<headers.size();i++) {

                PdfPCell cell1 = new PdfPCell(new Phrase(headers.get(i)));
                table.addCell(cell1);

            }

            table.setHeaderRows(list.size());

            for(int i=0;i<list.size();i++ ) {

                table.addCell(list.get(i).getFirstName());
                table.addCell(list.get(i).getLastName());
                table.addCell(list.get(i).getMobilePhoneNumber());
                table.addCell(list.get(i).getCity());
                table.addCell(list.get(i).getSsn());

            }
            document.add(table);

            document.close();

            writer.close();

        }

        catch(Exception e){
            e.printStackTrace();
        }


    }

    public static void createTableWithPojoApplicants(String filePath, List<US_23_Pojo> allApplicantPojo) {

        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();

            Font baslikFont = new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD);
            Phrase baslik = new Phrase("TEAM-31 PDF DOKUMAN   \n           Tum Applicants Bilgileri            ", baslikFont);
            Paragraph para = new Paragraph(baslik);
            para.setAlignment(Element.ALIGN_CENTER);
            document.add(para);

            document.add(new Paragraph(" ")); // bir satir bos birak

            float[] cellWidthColumnsCount = {0.6f, 0.6f, 1f, 0.7f, 0.7f, 0.7f}; // cell width
            Font boldFont = new Font(Font.FontFamily.HELVETICA, 11, Font.BOLD);
            PdfPTable table1 = new PdfPTable(cellWidthColumnsCount);
            table1.setWidthPercentage(100); // table with percentage
            table1.setHorizontalAlignment(Element.ALIGN_LEFT);// alignment

            Phrase userName = new Phrase("FIRST NAME", boldFont);
            Phrase userLastname = new Phrase("LAST NAME", boldFont);
            Phrase userEmail = new Phrase("EMAIL", boldFont);
            Phrase userMobileNum = new Phrase("MOBILE NUMBER", boldFont);
            Phrase userAdress = new Phrase("ADDRESS", boldFont);
            Phrase userSSN = new Phrase("SSN", boldFont);

            table1.addCell(userName);    // header 1
            table1.addCell(userLastname); // header 2
            table1.addCell(userEmail); // header 3
            table1.addCell(userMobileNum);    // header 4
            table1.addCell(userAdress); // header 5
            table1.addCell(userSSN); // header 6

            for (int i = 0; i < allApplicantPojo.size(); i++) {

                table1.addCell(allApplicantPojo.get(i).getFirstName());
                table1.addCell(allApplicantPojo.get(i).getLastName());
                table1.addCell(allApplicantPojo.get(i).getEmail());
                table1.addCell(allApplicantPojo.get(i).getMobilePhoneNumber());
                table1.addCell(allApplicantPojo.get(i).getAddress());
                table1.addCell(allApplicantPojo.get(i).getSsn());

            }
            document.add(table1);

//            document.add(new Paragraph(" ")); // bir satir bos birak

            document.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        System.out.println("========");
        System.out.println("Pdf dokumani olusturuldu");
    }



}
