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
}
