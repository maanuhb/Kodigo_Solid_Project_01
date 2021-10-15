package Interfaces.iFlight;

import utilities.Flight;

import java.util.Date;

public interface IUpdateFlight {
    void updateFlight(Flight flight, Date departureDateTime, Date arrivalDateTime);
}
