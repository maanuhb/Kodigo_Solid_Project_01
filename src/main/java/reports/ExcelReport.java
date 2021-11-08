package reports;

import Interfaces.iReports.IcreateAndSaveExcel;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.Flight;
import model.FlightList;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

@Data
@NoArgsConstructor


public class ExcelReport implements IcreateAndSaveExcel {
    @Override
    public void createAndSaveExcel() {

        File archivo = new File("flighlist.xlsx");
        FileInputStream inputStream;

        try {
            inputStream = new FileInputStream(archivo);
            Workbook workbook = WorkbookFactory.create(inputStream);
            Sheet sheet = workbook.getSheetAt(0);

            int rowCount = sheet.getLastRowNum();

            for (Flight f : FlightList.getFlightList()) {
                Row row = sheet.createRow(rowCount++);
                for(int i=0; i< 1; i++){
                    Cell cell = row.createCell(0);
                    fillCells(cell, row, f);
                }
            }

            inputStream.close();
            FileOutputStream outputStream = new FileOutputStream("flighlist.xlsx");
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();

        } catch (IOException | EncryptedDocumentException ex) {
            ex.printStackTrace();
        }
    }

    private void fillCells(Cell cell, Row row, Flight f){
        cell.setCellValue(f.getSchedule().getFlightNumber());

        cell = row.createCell(  1);
        cell.setCellValue(f.getAircraft().getAirline());

        cell = row.createCell(  2);
        cell.setCellValue(f.getOrigin().getAirportName());

        cell = row.createCell(  3);
        cell.setCellValue(f.getOrigin().getCountryName() + "/" + f.getOrigin().getCityName());

        cell = row.createCell(  4);
        cell.setCellValue(f.getDestination().getAirportName());

        cell = row.createCell(  5);
        cell.setCellValue(f.getDestination().getCountryName() + "/" + f.getDestination().getCityName());

        cell = row.createCell(  6);
        cell.setCellValue(f.getSchedule().getDepartureDateTime().toString());

        cell = row.createCell(  7);
        cell.setCellValue(f.getSchedule().getArrivalDateTime().toString());

        cell = row.createCell(  8);
        cell.setCellValue(f.getStatus());

        cell = row.createCell(  9);
        cell.setCellValue(f.getAircraft().getModel());
    }
}