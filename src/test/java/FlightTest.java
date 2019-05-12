import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight1;
    Passenger passenger1;

    @Before
    public void before(){
        flight1 = new Flight(123, "Paris");
        passenger1 = new Passenger("Ron");
    }

    @Test
    public void hasFlightNumber(){
        assertEquals(123, flight1.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("Paris", flight1.getDestination());
    }

    @Test
    public void startsWithNoPlaneAssigned(){
        assertEquals(null, flight1.getPlane());
    }

    @Test
    public void canAddPassenger(){
        flight1.addPassenger(passenger1);
        assertEquals(1, flight1.getPassengerCount());
    }
}
