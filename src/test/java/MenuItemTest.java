import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class MenuItemTest {
    @Test
    public void MenuItem_Constructor(){
        MenuItem testMenuItem = new MenuItem("chicken", "Grilled Chicken Breast", 20);
        assertEquals(20, testMenuItem.getCost());
        assertEquals("chicken", testMenuItem.getId());
        assertEquals("Grilled Chicken Breast", testMenuItem.getName());
    }


}
