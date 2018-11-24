import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    Person person;
    Flight flight;
    Plane plane;

    @Before
    public void before(){
        flight = new Flight("Dubai", 978, plane, 500);
        person = new Person(2000);
    }

    @Test
    public void canPayForTicket(){
        person.payForTicket(flight);
        assertEquals(1500, person.countMoney());
    }
}
