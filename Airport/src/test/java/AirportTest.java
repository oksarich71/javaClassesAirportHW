import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {
    Flight flight;
    Plane plane;
    Person person1;
    Person person2;
    Airport airport;
    Hangar hangar;

    @Before
    public void before() {
        plane = new Plane("EasyJet", Type.BOEING767, 80);
        hangar = new Hangar();
        hangar.addPlane(plane);
        flight = new Flight("Dubai", 978, plane, 500);
        person1 = new Person(2000);
        person2 = new Person(3000);
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
        person1.payForTicket(flight);
        assertEquals(500, airport.getTill());
        assertEquals(1500, person1.countMoney());
    }

    @Test
    public void canCountPassengers(){
        plane.addPassenger(person1);
        plane.addPassenger(person2);
        assertEquals(2, plane.countPassengers());
    }

    
}
