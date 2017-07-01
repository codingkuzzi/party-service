import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {



    @Test
    public void newEvent_instantiatesCorrectly_1() {
        Event testEvent = new Event();
        assertEquals(true, testEvent instanceof Event);
    }
    @Test
    public void newEvent_getGuestCount_2() {
        Event testEvent = new Event(2);
        assertEquals(2, testEvent.getGuestCount());
    }
    @Test
    public void newEvent_getGuestCount_3() {
        Event testEvent = new Event();
        assertEquals(0, testEvent.getGuestCount());
    }

}