import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;
    Person person;


    @Before
    public void before(){

        plane = new Plane("EasyJet", Type.BOEING767);
        person = new Person(500);
//
    }

    @Test
    public void canGetType(){
        assertEquals(Type.BOEING767, plane.getType());
    }
    @Test
    public void canAddPassenger() {
        plane.addPassenger(person);
        assertEquals(1, plane.countPassengers());
    }
}
