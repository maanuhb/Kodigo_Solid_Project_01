package model;
import Interfaces.iAirport.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Scanner;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirPort implements IAirportName, IWeatherConditions, IAircraftsCatalog, IDestination, IOrigin {
    private String destination = "";
    private String origin = "";
    private String airportname = "";
    private String weatherconditions = "";
    private Scanner sc = new Scanner(System.in);
    private Aircraft model= new Aircraft();
    private ArrayList<String> aircraftscatalog = new ArrayList<String>();

@Override
    public void destination() {
        System.out.println("Type the destination: ");
        destination = sc.nextLine();
        System.out.println("your destiantion is: " + destination);
    }
@Override
    public void origin() {
        System.out.println("Type the origin: ");
        origin = sc.nextLine();
        System.out.println("your origin is: " + origin);
    }
@Override
    public void airportname() {
        System.out.println("Type the airport name: ");
        airportname = sc.nextLine();
        System.out.println("your airport is: " + airportname);
    }
@Override
    public String weatherconditions() {
        System.out.println("Type the weather conditions: ");
        weatherconditions = sc.nextLine();
        System.out.println("your weather conditions are: " + weatherconditions);
    return null;
}
@Override
    public void aircraftscatalog() {
        aircraftscatalog.add(model.getModel());
        System.out.println("the aircrafts catalog is: " + "\n" + aircraftscatalog);
    }
}
