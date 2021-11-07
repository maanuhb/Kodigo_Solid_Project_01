package model;

import lombok.*;

import java.util.Date;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class FlightSchedule {
   private String flightNumber;
   private Date departureDateTime;
   private Date arrivalDateTime;

}
