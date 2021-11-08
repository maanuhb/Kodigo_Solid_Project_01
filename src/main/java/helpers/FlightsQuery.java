package helpers;

import lombok.Getter;
import lombok.NoArgsConstructor;
import model.Flight;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

@Getter
@NoArgsConstructor
public class FlightsQuery {
   private ArrayList<Flight> flights = new ArrayList<Flight>();

   public ArrayList<Flight> getFlights(ArrayList<Flight> flights, String date) {
      SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
      for (Flight flight : flights) {
         if (flight.hasThisDate(formatter, date, flight.getDepartureDateTime())) {
            this.flights.add(flight);
         } else if (flight.hasThisDate(formatter, date, flight.getArrivalDateTime())) {
            this.flights.add(flight);
         }
      }
      return this.flights;
   }

}