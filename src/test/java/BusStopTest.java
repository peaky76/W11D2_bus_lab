import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before() {
        busStop = new BusStop("Leith Links");
    }

    @Test
    public void busStopHasName() {
        assertEquals("Leith Links", busStop.getName());
    }

    @Test
    public void busStopHasNoQueueToStartWith() {
        assertEquals(0, busStop.getQueueLength());
    }


}
