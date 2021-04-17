import org.junit.Test;
import org.junit.Before;
import main.Calculator.Calculator;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void add() {
        assertEquals(9, calculator.add(6, 3));
    }
}
