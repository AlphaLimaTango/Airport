import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airport1;
    Hangar hangar1;
    Hangar hangar2;
    Plane plane1;
    Plane plane2;
    Flight flight1;
    Passenger passenger1;

    @Before
    public void before(){
        airport1 = new Airport("GLA");
        hangar1 = new Hangar();
        hangar2 = new Hangar();
        plane1 = new Plane(Type.BOEING737, Airline.DELTA);
        flight1 = new Flight(1, "Madrid");
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

    @Test
    public void canCreateAFlight(){
        airport1.createFlight(456, "Paris");
        assertEquals(1, airport1.getFlightCount());
    }

    @Test
    public void canAddHangar(){
        airport1.addHangar(hangar1);
        airport1.addHangar(hangar2);
        assertEquals(2, airport1.getHangarCount());
    }

    @Test
    public void canAssignPlaneToFlight(){
        airport1.addHangar(hangar1);
        hangar1.addPlane(plane1);
        assertEquals(null, flight1.getPlane());
        airport1.assignPlane(plane1, flight1);
        assertEquals(plane1, flight1.getPlane());
    }

    @Test
    public void startsWithNoTicketsSold(){
        assertEquals(0, airport1.getTicketsSold());
    }

//    @Test
//    public void canSellTicket(){
//        airport1.sellTicket(Passenger passenger1, Flight flight1);
//        assertEquals(1, airport1.getTicketsSold());
//    }
}
