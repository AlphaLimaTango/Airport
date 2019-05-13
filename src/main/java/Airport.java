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
        this.ticketsSold = ticketsSold;
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

    public void sellTicket(Passenger passenger, Flight flight){
        passenger.buyTicket(flight);
        flight.addPassenger(passenger);
        this.ticketsSold += 1;
    }

    public int checkPassengersBookedOnFlights() {
        ArrayList<Integer> array;
        new ArrayList<Integer>() = array;
        for (Flight flight : this.flights){
            return flight.getPassengerCount();
        }
        return
    }

//    public int numberOfPassengersBookedOnFlights() {
////  ArrayList<Integer>() array = new ArrayList<>(); (creating a local arraylist)

//    int counter = 0;
////
////        for (Hangar hangar : this.hangars) {
////            for (Plane plane : hangar.getPlanes()) {
////                counter += plane.getPassengerCount();
////            }
////        }
////        return counter;
////    }



}
