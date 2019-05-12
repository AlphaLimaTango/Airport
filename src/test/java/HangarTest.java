import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangarTest {

    Hangar hangar;

    @Before
    public void before(){
        hangar = new Hangar();
    }

    @Test
    public void startsWithNoPlanes(){
        assertEquals(0, hangar.getPlaneCount());
    }

}
