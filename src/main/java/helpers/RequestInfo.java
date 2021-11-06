package helpers;

import menus.Menu;
import model.Flight;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class RequestInfo {
    final static Scanner sc= new Scanner(System.in);

    //Method to request the info by console to get a new flight
    public static Flight requestFlight(List<Flight> flightList){
        Flight f = new Flight();
        f.setFlightNumber(flightList.size());
        System.out.println("Type the airline: ");
        f.setAirline(sc.nextLine());
        /*for(int i=0; i< flightList.size(); i++){
            System.out.println(i + ". " + flightList.get(i).getOrigin());
        }*/
        System.out.println("Type the origin country: ");
        f.setOrigin(/*flightList.get(sc.nextInt()).getOrigin()*/sc.nextLine());
        /*
        for(int i=0; i< flightList.size(); i++){
            System.out.println(i + ". " + flightList.get(i).getDestination());
        }*/
        System.out.println("Type the destination country");
        f.setDestination(/*flightList.get(sc.nextInt()).getDestination()*/sc.nextLine());

        f.setStatus("On Time");

        System.out.println("Type the departure date on format dd/mm/yyyy");
        DateFormat hourdateFormat = new SimpleDateFormat("HH:mm dd/MM/yyyy");
        String depDate = sc.next();
        System.out.println("Type the departure time on format hh:mm");
        String depHour = sc.next();

        System.out.println("Type the arrival date on format dd/mm/aaaa");
        String arrivalDate = sc.next();
        System.out.println("Type the arrival time on format hh:mm");
        String arrivalHour = sc.next();
        try {
            f.setDepartureDateTime(hourdateFormat.parse(depHour + " " + depDate));
            f.setArrivalDateTime(hourdateFormat.parse(arrivalHour + " " + arrivalDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return f;
    }

    //Method to request the user by console what flight will be changed her status
    public static void requestChangeState(List<Flight> flightList){
        System.out.println("Check the flight chart to update the status of any flight");
        Menu.printObjectList(flightList);
        System.out.println("Enter the flight code to which you want to update your status");
        Flight f = Find.findFlight(sc.nextInt(), flightList);
        sc.nextLine();
        System.out.println("Enter the new flight status");
        f.setStatus(sc.nextLine());
        if(f.getStatus().equals("Canceled")){
            System.out.println("Enter the reason for canceling the flight");
            f.setReasonToCancel(sc.nextLine());
        }
    }
}