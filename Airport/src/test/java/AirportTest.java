import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {
    Flight flight;
    Plane plane;
    Person person;
    Airport airport;
    Hangar hangar;

    @Before
    public void before() {
        plane = new Plane("EasyJet", Type.BOEING767);
        hangar = new Hangar();
        hangar.addPlane(plane);
        flight = new Flight("Dubai", 978, plane, 500);
        person = new Person(2000);
        airport = new Airport(AirportCode.LAX);
        airport.addHangar(hangar);


    }

    @Test
    public void canAddPlaneToFlight(){
        airport.createFlight();
        assertEquals(1, airport.countFlights());
    }

    @Test
    public void canSellTicket(){
        airport.sellTicket(flight);
        assertEquals(500, airport.getTill());
    }

    @Test
    public void airportSellPersonBuyTicket(){
        airport.sellTicket(flight);
        person.payForTicket(flight);
        assertEquals(500, airport.getTill());
        assertEquals(1500, person.countMoney());
    }
}
