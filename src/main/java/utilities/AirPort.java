package utilities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Scanner;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirPort {
    String country = "";
    String city = "";
    String airportname = "";
    String weatherconditions = "";
    Scanner sc = new Scanner(System.in);
    Aircrafts model= new Aircrafts();
    ArrayList<String> aircraftscatalog = new ArrayList<String>();

}