package test;

import org.junit.Test;
import org.junit.Before;
import main.Calculator.StringCalculator;

import static org.junit.Assert.*;

public class StringCalculatorTest {
    private StringCalculator stringCalculator;

    @Before
    public void setup() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void add_null_또는_빈문자() {
        assertEquals(0, stringCalculator.add(null));
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    public void add_숫자하나() throws Exception {
        assertEquals(1, stringCalculator.add("1"));
    }

    @Test
    public void add_쉼표구분자() throws Exception {
        assertEquals(3, stringCalculator.add("1,2"));
    }
}
