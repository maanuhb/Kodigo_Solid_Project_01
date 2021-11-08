package reports;

import model.AirPort;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.IOException;
import java.util.Iterator;

public class SearchExcel {
    public static AirPort searchAirport(String airportCode, String excelPath){
        AirPort airPort = new AirPort();
        Sheet firstSheet ;
        try {
            firstSheet = ReadExcel.configureExcelBook(excelPath);
            Iterator iterator = firstSheet.iterator();
            while (iterator.hasNext()) {
                Row nextRow = (Row) iterator.next();
                iterateRow(nextRow, airportCode, airPort);
            }
            return airPort;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void iterateRow(Row nextRow, String code, AirPort airPort){
        Iterator cellIterator = nextRow.cellIterator();
        DataFormatter formatter = new DataFormatter();

        while(cellIterator.hasNext()) {
            Cell cell = (Cell) cellIterator.next();
            String cellContent = formatter.formatCellValue(cell);
            if(code.equals(cellContent)){
                airPort.setAirportCode(cellContent);
                for(int i=0; i <nextRow.getLastCellNum(); i++){
                    while(cellIterator.hasNext()){
                        Cell cell2 = (Cell) cellIterator.next();
                        String cellContent2 = formatter.formatCellValue(cell2);
                        airPort.setAirportName(cellContent2);
                        airPort.setCountryName(cellIterator.next().toString());
                        airPort.setCountryCode(cellIterator.next().toString());
                        airPort.setCityName(cellIterator.next().toString());
                    }
                }
                break;
            }
        }
    }
}