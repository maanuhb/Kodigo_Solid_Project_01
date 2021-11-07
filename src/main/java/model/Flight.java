package model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Flight{
    private String Status = "On time";
    @NonNull private Aircraft aircraft;
    @NonNull private Airport destination;
    @NonNull private Airport origin;
    @NonNull private FlightSchedule schedule;

    public boolean isTheSameFlight(Flight flight2) {
        return this.getSchedule().getFlightNumber().equals(flight2.getSchedule().getFlightNumber());
    }

}