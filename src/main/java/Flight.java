import java.util.ArrayList;

public class Flight {

    private Plane plane;
    private int flightNumber;
    private String destination;
    private ArrayList<Passenger> passengers;

    public Flight(int flightNumber, String destination) {
        this.plane = null;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.passengers = new ArrayList<>();
    }

    public int getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public Object getPlane() {
        return this.plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }
}
