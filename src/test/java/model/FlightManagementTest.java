package model;

import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class FlightManagementTest {

    Flight f = new Flight();
    FlightSchedule fs = new FlightSchedule();

    @Test
    void enterFlightTest(){
        //airline
        Aircraft aircraft = new Aircraft();
        aircraft.setAirline("Avianca");
        f.setAircraft(aircraft);
        //origin
        AirPort o = new AirPort();
        o.setCountryName("Guatemala");
        f.setOrigin(o);
        //destination
        AirPort d = new AirPort();
        d.setCountryName("Japan");
        f.setDestination(d);
        //status
        f.setStatus("On Time");

        DateFormat hourdateFormat = new SimpleDateFormat("HH:mm dd/MM/yyyy");
        String depDate = "12/10/2021";
        String depHour = "12:09";

        String arrivalDate = "13/10/2021";
        String arrivalHour = "16:45";

        try {
            fs.setDepartureDateTime(hourdateFormat.parse(depHour+ " " + depDate));
            fs.setArrivalDateTime(hourdateFormat.parse(arrivalHour+" "+ arrivalDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        f.setSchedule(fs);

        assertEquals("Avianca",f.getAircraft().getAirline());
        assertEquals("Guatemala",f.getOrigin().getCountryName());
        assertEquals("Japan",f.getDestination().getCountryName());
        assertEquals("On Time",f.getStatus());
        assertEquals("12:09 12/10/2021", hourdateFormat.format(f.getSchedule().getDepartureDateTime()));
        assertEquals("16:45 13/10/2021", hourdateFormat.format(f.getSchedule().getArrivalDateTime()));
    }

    @Test
    public void updateFlightTest(){

        DateFormat hourdateFormat = new SimpleDateFormat("HH:mm dd/MM/yyyy");
        String depDate = "12/10/2021";
        String depHour = "12:09";

        String arrivalDate = "13/10/2021";
        String arrivalHour = "16:45";

        try {
            fs.setDepartureDateTime(hourdateFormat.parse(depHour+ " " + depDate));
            fs.setArrivalDateTime(hourdateFormat.parse(arrivalHour+" "+ arrivalDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        f.setSchedule(fs);
        try {
            fs.setDepartureDateTime(hourdateFormat.parse("12:00"+ " " + "12/10/2021"));
            fs.setArrivalDateTime(hourdateFormat.parse("12:00"+ " " + "12/10/2021"));
            fs.setFlightNumber("212");
            f.setSchedule(fs);
            changeDateTime(f.getSchedule().getFlightNumber(),f.getSchedule().getDepartureDateTime(), f.getSchedule().getArrivalDateTime()) ;
        } catch (ParseException e) {
            e.printStackTrace();
        }

        changeStatus("212", "Delayed");
        assertEquals("12:00 12/10/2021", hourdateFormat.format(f.getSchedule().getDepartureDateTime()));
        assertEquals("12:00 12/10/2021", hourdateFormat.format(f.getSchedule().getArrivalDateTime()));

        }
    public void changeStatus(String flightNumber, String status) {
        for (Flight flight : FlightList.getFlightList()) {
            if (flight.getSchedule().getFlightNumber().equals(flightNumber)) {
                flight.setStatus(status);
            }
        }
    }
    public void changeDateTime(String flightNumber, Date departureDateTime, Date arrivalDateTime) {
        for (Flight flight : FlightList.getFlightList()) {
            if (flight.getSchedule().getFlightNumber().equals(flightNumber)) {
                flight.getSchedule().setDepartureDateTime(departureDateTime);
                flight.getSchedule().setArrivalDateTime(arrivalDateTime);
            }
        }
    }
}
