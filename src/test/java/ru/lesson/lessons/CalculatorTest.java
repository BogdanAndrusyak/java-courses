package ru.lesson.lessons;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() throws Exception {
        Calculator calculator = new Calculator();
        calculator.add(1, 1);
        assertEquals(2, calculator.getResult());
    }

    @Test (expected = UserException.class)
    public void testDiv() throws UserException {
        Calculator calculator = new Calculator();
        calculator.div();
        assertEquals(1, calculator.getResult());
    }

    @Test (expected = UserException.class)
    public void divException() throws UserException {
        Calculator calculator = new Calculator();
        calculator.div(1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void divRuntimeException() throws Exception {
        Calculator calculator = new Calculator();
        calculator.div(1, 0);
    }
}