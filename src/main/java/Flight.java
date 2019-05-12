public class Flight {

    private Plane plane;
    private int flightNumber;
    private String destination;

    public Flight(int flightNumber, String destination) {
        this.plane = null;
        this.flightNumber = flightNumber;
        this.destination = destination;
    }

    public int getFlightNumber() {
        return this.flightNumber;
    }
}
