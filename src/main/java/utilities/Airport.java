package airportClass;

import aircraftsClass.Aircrafts;
import java.util.ArrayList;
import java.util.Scanner;
public class Airport {
    String country = "";
    String city = "";
    String airportname = "";
    String weatherconditions = "";
    Scanner sc = new Scanner(System.in);
    Aircrafts model= new Aircrafts();
    ArrayList<String> aircraftscatalog = new ArrayList<String>();

    public void country() {
        System.out.println("Type the country: ");
        country = sc.nextLine();
        System.out.println("your country is: " + country);
    }

    public void city() {
        System.out.println("Type the city: ");
        city = sc.nextLine();
        System.out.println("your city is: " + city);
    }

    public void airportname() {
        System.out.println("Type the airport name: ");
        airportname = sc.nextLine();
        System.out.println("your airport is: " + airportname);
    }

    public void weatherconditions() {
        System.out.println("Type the weather conditions: ");
        country = sc.nextLine();
        System.out.println("your weather conditions are: " + weatherconditions);
    }
    public void aircraftscatalog() {
        aircraftscatalog.add(model.getModel());
        System.out.println("the aircrafts catalog is: " + "\n" + aircraftscatalog);
    }
    public ArrayList<String> getAircraftscatalog() {
        return aircraftscatalog;
    }

    public void setAircraftscatalog(ArrayList<String> aircraftscatalog) {
        this.aircraftscatalog = aircraftscatalog;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAirportname() {
        return airportname;
    }

    public void setAirportname(String airportname) {
        this.airportname = airportname;
    }

    public String getWeatherconditions() {
        return weatherconditions;
    }

    public void setWeatherconditions(String weatherconditions) {
        this.weatherconditions = weatherconditions;
    }

}
