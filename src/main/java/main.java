import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        final String ANSI_BLUE = "\u001B[34m";
        final List<Flight> flightList = FlightList.getFlightList();
        final Scanner sc = new Scanner(System.in);

        int op =0;
        do{
            Menu.printMainMenu();
            System.out.println(ANSI_BLUE + "Ingrese un numero para seleccionar una de las opciones del menu");
            op = sc.nextInt();
            switch(op){
                case 1: do{
                    Menu.printFlightMenu();
                    System.out.println("Ingrese una opcion");
                    op = sc.nextInt();
                    MenuFlight.viewFlightLoop(op, flightList);
                }while(op!=0);
                    break;
                case 2:
                    break;
            }
        }while(op != 5);
    }





}