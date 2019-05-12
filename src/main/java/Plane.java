import java.util.ArrayList;

public class Plane {

    private Type type;
    private Airline airline;
    private ArrayList<Passenger> passengers;

    public Plane(Type type, Airline airline) {
        this.type = type;
        this.airline = airline;
        this.passengers = new ArrayList<Passenger>();
    }


    public Type getType() {
        return this.type;
    }

    public Airline getAirline() {
        return this.airline;
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }
}
