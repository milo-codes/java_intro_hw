import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottleTest {

    private Bottle bottle;

    @Before
    public void before() {
        bottle = new Bottle();
    }

    @Test
    public void hasVolume() {
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void canDrink() {
        bottle.drink();
        assertEquals(90, bottle.getVolume());
    }

    @Test
    public void canEmpty() {
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void wontDrinkIfEmpty() {
        bottle.empty();
        bottle.drink();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void canRefill() {
        bottle.empty();
        bottle.refill();
        assertEquals(100, bottle.getVolume());
    }
}
