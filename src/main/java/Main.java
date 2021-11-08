import helpers.Email;
import reports.ReadExcel;
import menus.Menu;
import menus.MenuFlight;
import reports.ExcelReport;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String ANSI_BLUE = "\u001B[34m";
        final Scanner sc = new Scanner(System.in);

        int op =0;
        do{
            Menu.printMainMenu();
            System.out.println(ANSI_BLUE + "Enter a number to select one of the menu options");
            op = sc.nextInt();
            sc.nextLine();
            switch(op){
                case 1: do{
                    Menu.printFlightMenu();
                    System.out.println("Enter an option");
                    op = sc.nextInt();
                    MenuFlight.viewFlightLoop(op);
                }while(op!=0);
                    break;
                case 2:
                    System.out.println("Enter the excel filename .xlsx");
                    ReadExcel.read(sc.nextLine());
                    break;
                case 3:
                    ExcelReport report = new ExcelReport();
                    report.createAndSaveExcel();
                    break;
                case 4:
                    System.out.println("Type your email to send the report: ");
                    String email = sc.nextLine();
                    System.out.println("Type the filename .xlsx");
                    String filename = sc.nextLine();
                    Email.send(email, filename);
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