package helpers;

import model.Flight;

import java.util.List;

public class Find {

    //Method to find a Flight by index list and returns a found Flight
    public static Flight findFlight(String flightNumber, List<Flight> flightList){
        Flight flightSearched = null;
        for(Flight flight : flightList) {
            if (flight.getSchedule().getFlightNumber().equals(flightNumber)) {
                flightSearched = flight;
                break;
            }
        }
        return flightSearched;
    }
}