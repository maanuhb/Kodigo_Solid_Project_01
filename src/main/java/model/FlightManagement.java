package model;

import Interfaces.iFlight.ICancelable;
import Interfaces.iFlight.IEnterFlight;
import Interfaces.iFlight.IUpdatable;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class FlightManagement implements IEnterFlight, ICancelable, IUpdatable {

   @Override
   public void enterFlight(Flight newFlight) {
      for (Flight flight : FlightList.getFlightList()) {
         if (flight.isTheSameFlight(newFlight)) {
            System.out.println("Flight is already registered");
            break;
         }
      }
      FlightList.setFlightList(newFlight);
      System.out.println("\n---- Flight successfully added -----");
   }

   @Override
   public void updateFlight(String flightNumber, Date departureDateTime, Date arrivalDateTime) {
      changeStatus(flightNumber, "Delayed");
      changeDateTime(flightNumber, departureDateTime, arrivalDateTime);
   }

   @Override
   public String cancelFlight(String flightNumber) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter reason for cancellation: ");
      String reason = scanner.nextLine();
      changeStatus(flightNumber, "Cancelled");
      scanner.close();

      return reason;
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
