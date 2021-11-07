package model;

import Interfaces.iFlight.ICancelable;
import Interfaces.iFlight.IEnterFlight;
import Interfaces.iFlight.IUpdatable;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class FlightManagement implements IEnterFlight, ICancelable, IUpdatable {
   private List<Flight> flights;

   @Override
   public void enterFlight(List<Flight> flights, Flight newFlight) {
      for (Flight flight : flights) {
         if (flight.isTheSameFlight(newFlight)) {
            System.out.println("Flight is already registered");
         } else {
            flights.add(newFlight);
         }
      }
   }

   @Override
   public void updateFlight(List<Flight> flights, String flightNumber, Date departureDateTime, Date arrivalDateTime) {
      changeStatus(flights, flightNumber, "Delayed");
      changeDateTime(flights, flightNumber, departureDateTime, arrivalDateTime);
   }

   @Override
   public String cancelFlight(List<Flight> flights, String flightNumber) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter reason for cancellation: ");
      String reason = scanner.nextLine();
      changeStatus(flights, flightNumber, "Cancelled");
      scanner.close();

      return reason;
   }

   public void changeStatus(List<Flight> flights, String flightNumber, String status) {
      for (Flight flight : flights) {
         if (flight.getSchedule().getFlightNumber().equals(flightNumber)) {
            flight.setStatus(status);
         }
      }
   }

   public void changeDateTime(List<Flight> flights, String flightNumber, Date departureDateTime, Date arrivalDateTime) {
      for (Flight flight : flights) {
         if (flight.getSchedule().getFlightNumber().equals(flightNumber)) {
            flight.getSchedule().setDepartureDateTime(departureDateTime);
            flight.getSchedule().setArrivalDateTime(arrivalDateTime);
         }
      }
   }


}
