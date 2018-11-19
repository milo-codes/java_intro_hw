import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void before() {
        calc = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(12, calc.add(9, 3));
    }

    @Test
    public void canSubtract() {
        assertEquals(6, calc.subtract(9, 3));
    }

    @Test
    public void canMultiply() {
        assertEquals(27, calc.multiply(9, 3));
    }

    @Test
    public void canDivide() {
        assertEquals(3, calc.divide(9, 3));
    }
}
