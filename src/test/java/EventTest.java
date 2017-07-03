import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

public class EventTest {

    @Test
    public void Event_getCost_1() {
        Menu menu = new Menu();
        Event event = new Event(100,
                new ArrayList<MenuItem>(Arrays.asList(menu.getFood())),
                new ArrayList<MenuItem>(Arrays.asList(menu.getBeverages())),
                new ArrayList<MenuItem>(Arrays.asList(menu.getDrinks())),
                new ArrayList<MenuItem>(Arrays.asList(menu.getEntertainment())),
                null);
        assertEquals(24500, event.getTotalCost());
    }
}