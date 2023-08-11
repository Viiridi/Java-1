package examples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {

    Calculator calculator;
    String str;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(11, calculator.add(4,7));
    }

    @Test
    public void demoTestMethod() {
        assertTrue(true);
    }

    @Test
    public void testStr() {
        assertNull(str);
    }
}
