import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight1;

    @Before
    public void before(){
        flight1 = new Flight(123, "Paris");
    }

    @Test
    public void hasFlightNumber(){
        assertEquals(123, flight1.getFlightNumber());
    }
}
