import menus.Menu;
import menus.MenuFlight;
import reports.ExcelReport;
import model.Flight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String ANSI_BLUE = "\u001B[34m";
        final List<Flight> flightList = new ArrayList<>();
        final Scanner sc = new Scanner(System.in);

        int op =0;
        do{
            ExcelReport excel = new ExcelReport();
            Menu.printMainMenu();
            System.out.println(ANSI_BLUE + "Enter a number to select one of the menu options");
            op = sc.nextInt();
            switch(op){
                case 1: do{
                    Menu.printFlightMenu();
                    System.out.println("Enter an option");
                    op = sc.nextInt();
                    MenuFlight.viewFlightLoop(op, flightList);
                }while(op!=0);
                    break;
                case 2:
                    break;
                case 3:
                    excel.createAndSaveExcel();
                    break;
                case 4:
                    break;
                case 5:

                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Error, please type a valid option...");
                    break;
            }
        }while(op != 5);
    }





}