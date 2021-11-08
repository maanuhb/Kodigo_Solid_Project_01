package reports;

import model.AirPort;
import model.Aircraft;
import model.Flight;
import model.FlightSchedule;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcel {
    private static Flight f = new Flight();
    private static FlightSchedule schedule = new FlightSchedule();
    private static AirPort airPort = new AirPort();
    private static Aircraft aircraft = new Aircraft();

    public static void read(String excelPath){
        try {
            Sheet firstSheet = configureExcelBook(excelPath);
            Iterator iterator = firstSheet.iterator();
            DataFormatter formatter = new DataFormatter();

            while (iterator.hasNext()) {
                Row nextRow = (Row) iterator.next();
                Iterator cellIterator = nextRow.cellIterator();
                iterate(cellIterator, formatter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static Sheet configureExcelBook(String excelPath) throws IOException {
        FileInputStream inputStream = new FileInputStream(excelPath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        return workbook.getSheetAt(0);
    }

    private static void iterate(Iterator cellIterator, DataFormatter formatter){
        while(cellIterator.hasNext()) {
            Cell cell = (Cell) cellIterator.next();
            String cellContent = formatter.formatCellValue(cell);
            printCells(cellContent);
        }
        System.out.println(" ");
    }

    private static void printCells(String cellContent){ //Prints and formats a cell
        int SPACING=35;
        if(cellContent.length() < 20) SPACING = 20;

        for(int y=cellContent.length(); y<SPACING; y++){
            cellContent +=" ";
        }
        System.out.printf(cellContent);
    }


}