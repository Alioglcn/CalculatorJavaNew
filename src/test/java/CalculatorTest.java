import static org.junit.Assert.*;

import org.example.Calculator;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd_PositiveNumbers() {
        assertEquals("10 + 20 should equal 30", 30, Calculator.sum(10, 20));
    }

    @Test
    public void testAdd_NegativeNumbers() {
        assertEquals("-10 + -20 should equal -30", -30, Calculator.sum(-10, -20));
    }

    @Test
    public void testAdd_PositiveAndNegativeNumbers() {
        assertEquals("-10 + 20 should equal 10", 10, Calculator.sum(-10, 20));
    }

    @Test
    public void testAdd_ZeroNumbers() {
        assertEquals("0 + 0 should equal 0", 0, Calculator.sum(0, 0));
    }

    @Test
    public void testAdd_LargeNumbers() {
        assertEquals("Max Integer + 1 should overflow and equal to Minimum Integer",
                Integer.MIN_VALUE, Calculator.sum(Integer.MAX_VALUE, 1));
    }

    @Test
    public void testAdd_MinValue() {
        assertEquals("Integer.MIN_VALUE + 1 should be Integer.MIN_VALUE + 1",
                Integer.MIN_VALUE + 1, Calculator.sum(Integer.MIN_VALUE, 1));
    }

    @Test
    public void testAdd_ZeroWithPositiveNumber() {
        assertEquals("0 + 5 should equal 5", 5, Calculator.sum(0, 5));
    }

    @Test
    public void testAdd_ZeroWithNegativeNumber() {
        assertEquals("0 + -5 should equal -5", -5, Calculator.sum(0, -5));
    }

    @Test
    public void testAdd_LargeNegativeNumbers() {
        assertEquals("Integer.MIN_VALUE + Integer.MIN_VALUE should be -2 * Integer.MIN_VALUE",
                -2 * Integer.MIN_VALUE, Calculator.sum(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    // Bu testi daha sıradışı syntax hataları için düşünebiliriz..
    @Test
    public void testSum_MethodNameCorrection() {
        assertEquals("Method name should be sum, not add", 30, Calculator.sum(10, 20));
    }
}