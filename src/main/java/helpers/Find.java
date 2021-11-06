package helpers;

import model.Flight;

import java.util.List;

public class Find {

    //Method to find a Flight by index list and returns a found Flight
    public static Flight findFlight(int id, List<Flight> flightList){
        return flightList.get(id);
    }
}