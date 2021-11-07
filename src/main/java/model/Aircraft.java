package model;
import lombok.*;

@NoArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
public class Aircraft {
    @NonNull
    private String model;
    @NonNull
    private String type;

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