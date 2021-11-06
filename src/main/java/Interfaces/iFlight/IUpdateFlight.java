package Interfaces.iFlight;

import model.Flight;

import java.util.Date;

public interface IUpdateFlight {
    void updateFlight(Flight flight, Date departureDateTime, Date arrivalDateTime);
}
