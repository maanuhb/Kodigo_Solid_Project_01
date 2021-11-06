package reports;

import Interfaces.iReports.IcreateAndSaveExcel;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

@Data
@NoArgsConstructor


public class ExcelReport implements IcreateAndSaveExcel {
    @Override
    public void createAndSaveExcel() {

        Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet("Report");

        CellStyle style = book.createCellStyle();
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        Font font = book.createFont();
        font.setFontName("Arial");
        font.setBold(true);
        font.setFontHeightInPoints((short) 9);
        style.setFont(font);
        //rtitle= row title
        Row rtitle = sheet.createRow(0);
        //ctitle= column
        Cell ctitle = rtitle.createCell(5);
        ctitle.setCellStyle(style);
        ctitle.setCellValue("Airport Report");


        String header = " Code, Aircraft , Airline , Country/City Origin , Hour/Date Departure ,  Country/City Destination , Hour/Date Arrival , Status , Weather Conditions";
        String[] arrHeader= header.split(",");

        Row rheader = sheet.createRow(2);

        for(int i = 0; i< arrHeader.length; i++){
            Cell cellTitle = rheader.createCell(i);
            cellTitle.setCellStyle(style);
            cellTitle.setCellValue(arrHeader[i]);
        }
        System.out.println("created");
        /*
        //la lista xd
        Flight lista = new Flight();

        int size =.get( arrHeader[0])).size();
        for (int row =3;row<size; row++){

            Row rowValue = sheet.createRow(row+1);
            int cell =0;
            for(int i=0; i<arrHeader.length;i++){
                //la lista
                List<String> report = (List<String>);
                Cell cell0 = rowValue.createCell(cell);
                cell0.setCellValue(report.get(row));
                cell++;
            }
        }*/

        try {
            FileOutputStream fileout = new FileOutputStream("Report.xlsx");
            book.write(fileout);
            fileout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}