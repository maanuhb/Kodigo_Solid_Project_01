package model;

import lombok.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class Flight{
    private String Status = "On time";
    private int index;
    @NonNull private Aircraft aircraft;
    @NonNull private AirPort destination;
    @NonNull private AirPort origin;
    @NonNull private FlightSchedule schedule;

    public boolean isTheSameFlight(Flight flight2) {
        return this.getSchedule().getFlightNumber().equals(flight2.getSchedule().getFlightNumber());
    }

    public Date getDepartureDateTime() {
        return this.getSchedule().getDepartureDateTime();
    }

    public Date getArrivalDateTime() {
        return this.getSchedule().getArrivalDateTime();
    }

    public boolean hasThisDate(SimpleDateFormat dateFormat, String queryDate, Date date) {
        return dateFormat.format(date).equals(queryDate);
    }

}