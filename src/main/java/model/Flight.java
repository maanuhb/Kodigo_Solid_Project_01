package model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
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

}