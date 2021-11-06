package menus;


import helpers.RequestInfo;
import model.Flight;

import java.util.List;
import java.util.Scanner;

public class MenuFlight {
    private static Scanner sc = new Scanner(System.in);

    //This method it called in case 1 in Main class
    //It will show a sub menu for the manage flights
    public static void viewFlightLoop(int option, List<Flight> flightList){

        switch(option){
            case 1:
                Menu.printObjectList(flightList);
                break;
            case 2:
                Flight flight = RequestInfo.requestFlight(flightList);
                flight.enterFlight(flightList, flight);
                break;
            case 3: RequestInfo.requestChangeState(flightList);
                break;
            case 4:
                System.out.println("Deleated");
                break;
            case 5:
                break;
        }
    }
}