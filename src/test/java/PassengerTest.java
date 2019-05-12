import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;

    @Before
    public void before(){
        passenger1 = new Passenger("Jen");
    }

    @Test
    public void hasName(){
        assertEquals("Jen", passenger1.getName());
    }

    @Test
    public void startsWithNoTickets(){
        assertEquals(0, passenger1.getTicketCount());
    }
}
