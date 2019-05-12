import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Flight flight1;

    @Before
    public void before(){
        passenger1 = new Passenger("Jen");
        flight1 = new Flight(8, "Dubai");
    }

    @Test
    public void hasName(){
        assertEquals("Jen", passenger1.getName());
    }

    @Test
    public void startsWithNoTickets(){
        assertEquals(0, passenger1.getTicketCount());
    }

    @Test
    public void canBuyTicket(){
        passenger1.buyTicket(flight1);
        assertEquals(1, passenger1.getTicketCount());
    }
}
