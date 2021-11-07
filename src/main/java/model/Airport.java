package model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import model.Aircraft;
import model.Location;

import java.util.ArrayList;
@Getter
@Setter
public class Airport extends Location {
    private String AirportName;
    private String AirportCode;
    private ArrayList<Aircraft> catalogOfAircrafts;

    public Airport(@NonNull String CountryName, @NonNull String CountryCode, @NonNull String AirportName, @NonNull String AirportCode) {
        super(CountryName, CountryCode);
        this.AirportName = AirportName;
        this.AirportCode = AirportCode;
        this.catalogOfAircrafts = new ArrayList<>();
    }

    public void addAircraft(Aircraft aircraft) {
        this.catalogOfAircrafts.add(aircraft);
    }

    public void removeAircraft(Aircraft aircraft) {
        this.catalogOfAircrafts.remove(aircraft);
    }

    public void showCatalogOfAircrafts() {
        for (Aircraft aircraft : catalogOfAircrafts) {
            System.out.println(aircraft.getModel() + " " + aircraft.getType() + " " + aircraft.getAirline());
        }
    }
}