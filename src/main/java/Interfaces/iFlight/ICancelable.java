package Interfaces.iFlight;

import model.Flight;

import java.util.List;

public interface ICancelable {
    String cancelFlight(List<Flight> flights, String flightNumber);
}
