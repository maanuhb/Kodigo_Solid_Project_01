package model;

import lombok.*;
import model.Aircraft;
import model.Location;

import java.util.ArrayList;
@Getter
@Setter
@NoArgsConstructor
public class AirPort extends Location {
    private String AirportName;
    private String AirportCode;
    private ArrayList<Aircraft> catalogOfAircrafts;

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