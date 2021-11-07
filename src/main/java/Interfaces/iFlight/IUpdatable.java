package Interfaces.iFlight;

import model.Flight;

import java.util.Date;
import java.util.List;

public interface IUpdatable {
    void updateFlight(String flightNumber, Date departureTime, Date arrivalTime);

}
