import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane1;

    @Before
    public void before(){
        plane1 = new Plane(Type.BOEING737, Airline.BA);
    }

    @Test
    public void hasType(){
        assertEquals(Type.BOEING737, plane1.getType());
    }

    @Test
    public void hasAirline(){
        assertEquals(Airline.BA, plane1.getAirline());
    }
}
