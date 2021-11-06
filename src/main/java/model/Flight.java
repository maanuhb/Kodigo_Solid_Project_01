package model;

import Interfaces.iFlight.IEnterFlight;
import Interfaces.iFlight.IUpdateFlight;
import Interfaces.iFlight.IUpdateState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flight implements IUpdateFlight, IEnterFlight, IUpdateState {
    private int flightNumber;
    private String airline;
    private String Status;
    private String reasonToCancel;
    private String destination;
    private String origin;
    private Date departureDateTime;
    private Date arrivalDateTime;
    private WeatherConditions weatherConditions;


    @Override
    public void enterFlight(List<Flight> flightList, Flight flight) {
        flightList.add(flight);
    }

    @Override
    public void updateFlight(Flight flight, Date departureDateTime, Date arrivalDateTime) {
        if(flight.getStatus().equals("DELAYED")){
            flight.setDepartureDateTime(departureDateTime);
            flight.setArrivalDateTime(arrivalDateTime);
        }else if(flight.getStatus().equals("CANCELED")){
            //PENDIENTE DE MODIFICAR AQUI CUANDO SE CANCELA UN VUELO
        }
    }

    @Override
    public void updateState(String status) {
        this.setStatus(status);
    }
}