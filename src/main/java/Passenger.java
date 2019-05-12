public class Passenger {

    private String name;
    private int tickets;

    public Passenger(String name) {
        this.name = name;
        this.tickets = tickets;
    }

    public String getName() {
        return this.name;
    }

    public int getTicketCount() {
        return this.tickets;
    }

    public int buyTicket(Flight flight) {
        return this.tickets += 1;
    }
}
