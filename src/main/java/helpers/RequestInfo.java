package helpers;

import menus.Menu;
import model.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class RequestInfo {
    final static Scanner sc= new Scanner(System.in);

    //Method to request the info by console to get a new flight
    public static Flight requestFlight(){
        Flight f = new Flight();
        f.setIndex(FlightList.getFlightList().size());
        System.out.println("Type the airline: ");
        Aircraft aircraft = new Aircraft();
        aircraft.setAirline(sc.nextLine());
        f.setAircraft(aircraft);

        System.out.println("Type the origin country: ");
        AirPort o = new AirPort();
        o.setCountryName(sc.nextLine());
        f.setOrigin(o);

        System.out.println("Type the destination country");
        AirPort d = new AirPort();
        d.setCountryName(sc.nextLine());
        f.setDestination(d);

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
            FlightSchedule flightSchedule = new FlightSchedule();
            flightSchedule.setDepartureDateTime(hourdateFormat.parse(depHour + " " + depDate));
            flightSchedule.setArrivalDateTime(hourdateFormat.parse(arrivalHour + " " + arrivalDate));
            f.setSchedule(flightSchedule);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return f;
    }

    //Method to request the user by console what flight will be changed her status
    public static void requestChangeState(List<Flight> flightList){
        System.out.println("Check the flight chart to update the status of any flight");
        Menu.printObjectList();
        System.out.println("Enter the Flight Number to which you want to update your status");
        Flight f = Find.findFlight(sc.nextLine(), flightList);
        System.out.println("Enter the new flight status");
        f.setStatus(sc.nextLine());
        if(f.getStatus().equals("Canceled")){
            System.out.println("Enter the reason for canceling the flight");
            //ENTER HERE THE REASON FOR CANCELING THE FLIGHT
        }
    }
}