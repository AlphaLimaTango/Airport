import java.util.ArrayList;

public class Airport {

    private String code;
    private ArrayList<Hangar> hangars;
    private ArrayList<Flight> flights;
    private int ticketsSold;

    public Airport(String code) {
        this.code = code;
        this.hangars = new ArrayList<>();
        this.flights = new ArrayList<>();
        this.ticketsSold = 0;
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

    public void addHangar(Hangar hangar) {
        this.hangars.add(hangar);
    }

    public int getTicketsSold() {
        return this.ticketsSold;
    }
}
