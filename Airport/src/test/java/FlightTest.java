import org.junit.Before;
import org.junit.Test;

public class FlightTest {
    Flight flight;
    Plane plane;
    Person person;

    @Before
    public void before() {
        plane = new Plane("EasyJet", Type.BOEING767, 80);
        flight = new Flight("Dubai", 978, plane, 500);
        person = new Person(2000);
    }




}
