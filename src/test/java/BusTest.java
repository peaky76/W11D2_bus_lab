import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person passenger;
    private BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("Ocean Terminal", 80);
        passenger = new Person();
        busStop = new BusStop("The Shore");
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

    @Test
    public void doesNotAddPassengerIfBusIsFull() {
        for (int i= 0; i < 80; i ++){
            bus.addPassenger(passenger);
        }
        bus.addPassenger(passenger);
        assertEquals(80, bus.getNumberOfPassengers());
    }

    @Test
    public void canRemovePassenger() {
        bus.addPassenger(passenger);
        bus.removePassenger(passenger);
        assertEquals(0, bus.getNumberOfPassengers());
    }

    @Test
    public void canPickUpPassengerFromBusStop() {
        busStop.addPersonToQueue(passenger);
        bus.pickUp(passenger, busStop);
        assertEquals(1, bus.getNumberOfPassengers());
    }

}
