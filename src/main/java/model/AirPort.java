package model;

import lombok.*;

import java.util.ArrayList;
@Getter
@Setter
@NoArgsConstructor
public class AirPort extends Location {
    private String AirportName;
    private String AirportCode;
    private ArrayList<Aircraft> catalogOfAircrafts;

    public AirPort(@NonNull String CountryName, @NonNull String CountryCode, @NonNull String AirportName, @NonNull String AirportCode) {
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