package model;

import java.util.ArrayList;
import java.util.List;

public class FlightList {
    private static List<Flight> flightList = new ArrayList<>();

    public static void setFlightList(Flight flight){
        flightList.add(flight);
    }

    public static List<Flight> getFlightList() {
        return flightList;
    }
}