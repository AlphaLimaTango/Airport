import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airport1;
    Hangar hangar1;
    Hangar hangar2;

    @Before
    public void before(){
        airport1 = new Airport("GLA");
        hangar1 = new Hangar();
        hangar2 = new Hangar();
    }

    @Test
    public void hasAirportCode(){
        assertEquals("GLA", airport1.getAirportCode());
    }

    @Test
    public void startsWithNoHangars(){
        assertEquals(0, airport1.getHangarCount());
    }

    @Test
    public void startsWithNoFlights(){
        assertEquals(0, airport1.getFlightCount());
    }
}
