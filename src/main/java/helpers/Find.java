package helpers;

import model.Flight;
import model.FlightList;

import java.util.List;

public class Find {

    //Method to find a Flight by index list and returns a found Flight
    public static Flight findFlight(String flightNumber){
        Flight flightSearched = null;
        for(Flight flight : FlightList.getFlightList()) {
            if (flight.getSchedule().getFlightNumber().equals(flightNumber)) {
                flightSearched = flight;
                break;
            }
        }
        return flightSearched;
    }
}