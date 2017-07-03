import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuTest {
    @Test
    public void Menu_Constructor(){
        Menu testMenu = new Menu();
        assertEquals(6, testMenu.getFood().length);
    }
}
