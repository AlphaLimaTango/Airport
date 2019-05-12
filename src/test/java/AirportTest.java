import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airport1;

    @Before
    public void before(){
        airport1 = new Airport("GLA");
    }

    @Test
    public void hasAirportCode(){
        assertEquals("GLA", airport1.getAirportCode());
    }
}
