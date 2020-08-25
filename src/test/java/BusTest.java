import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person passenger;

    @Before
    public void before() {
        bus = new Bus("Ocean Terminal", 80);
        passenger = new Person();
    }

    @Test
    public void busStartsEmpty() {
        assertEquals(0, bus.getNumberOfPassengers());
    }

    @Test
    public void canAddPassengerIfNotFull() {
        bus.addPassenger(passenger);
        assertEquals(1, bus.getNumberOfPassengers());
    }



}
