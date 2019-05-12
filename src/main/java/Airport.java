import java.util.ArrayList;

public class Airport {

    private String code;
    private ArrayList<Hangar> hangars;
    private ArrayList<Flight> flights;

    public Airport(String code) {
        this.code = code;
        this.hangars = new ArrayList<>();
        this.flights = new ArrayList<>();
    }

    public String getAirportCode() {
        return this.code;
    }

    public int getHangarCount() {
        return this.hangars.size();
    }

    public int getFlightCount() {
        return this.flights.size();
    }

    public boolean createFlight(int flightNumber, String destination) {
        return this.flights.add(new Flight(flightNumber, destination));
    }

    public void assignPlane(Plane plane, Flight flight) {
        this.hangars.remove(plane);
        flight.setPlane(plane);
    }

    public int getHangerCount() {
        return this.hangars.size();
    }

//    public void addPlane(Hangar hangar, Plane plane) {
//        hangar.addPlane(plane);
//    }

    public void addHangar(Hangar hangar) {
        this.hangars.add(hangar);
    }

}
