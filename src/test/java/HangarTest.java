import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangarTest {

    Hangar hangar;
    Plane plane;

    @Before
    public void before(){
        hangar = new Hangar();
        plane = new Plane(Type.BOEING737, Airline.EMIRATES);
    }

    @Test
    public void startsWithNoPlanes(){
        assertEquals(0, hangar.getPlaneCount());
    }

    @Test
    public void canAddPlane(){
        assertEquals(true, hangar.addPlane(plane));
    }


}
