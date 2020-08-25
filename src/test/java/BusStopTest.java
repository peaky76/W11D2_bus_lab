import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person1;
    private Person person2;

    @Before
    public void before() {
        busStop = new BusStop("Leith Links");
        person1 = new Person();
        person2 = new Person();
    }

    @Test
    public void busStopHasName() {
        assertEquals("Leith Links", busStop.getName());
    }

    @Test
    public void busStopHasNoInitialQueue() {
        assertEquals(0, busStop.getQueueLength());
    }

    @Test
    public void canAddPersonToQueue() {
        busStop.addPersonToQueue(person1);
        assertEquals(1, busStop.getQueueLength());
    }

    @Test
    public void canRemovePersonFromQueue() {
        busStop.addPersonToQueue(person1);
        busStop.addPersonToQueue(person2);
        busStop.removePersonFromQueue(person1);
        assertEquals( 1, busStop.getQueueLength());
    }

}
