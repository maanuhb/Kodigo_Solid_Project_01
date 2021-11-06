package model;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.apache.xpath.operations.String;


@RequiredArgsConstructor
@Setter @Getter
public class Aircraft {
    @NonNull
    private String model;
    @NonNull
    private String type;
    @NonNull
    private String airline;
    private int passengerCapacity;
    private int amountOfFuel;

    public boolean isFull(int numberOfPassengers){
        boolean isFull = false;
        if(numberOfPassengers == passengerCapacity){
            isFull = true;
        }
        return isFull;
    }

    public double rangeOfFlight(int amountOfFuel){
        double range = amountOfFuel/100;
        return range;
    }

}