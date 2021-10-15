package utilities;
import Interfaces.IAirport.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import utilities.Aircrafts;
import java.util.ArrayList;
import java.util.Scanner;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirPort implements ICountry, ICity, IAirportName, IWeatherConditions, IAircraftsCatalog {
    private String country = "";
    private String city = "";
    private String airportname = "";
    private String weatherconditions = "";
    private Scanner sc = new Scanner(System.in);
    private Aircrafts model= new Aircrafts();
    private ArrayList<String> aircraftscatalog = new ArrayList<String>();

@Override
    public void country() {
        System.out.println("Type the country: ");
        country = sc.nextLine();
        System.out.println("your country is: " + country);
    }
@Override
    public void city() {
        System.out.println("Type the city: ");
        city = sc.nextLine();
        System.out.println("your city is: " + city);
    }
@Override
    public void airportname() {
        System.out.println("Type the airport name: ");
        airportname = sc.nextLine();
        System.out.println("your airport is: " + airportname);
    }
@Override
    public void weatherconditions() {
        System.out.println("Type the weather conditions: ");
        country = sc.nextLine();
        System.out.println("your weather conditions are: " + weatherconditions);
    }
@Override
    public void aircraftscatalog() {
        aircraftscatalog.add(model.getModel());
        System.out.println("the aircrafts catalog is: " + "\n" + aircraftscatalog);
    }
}
