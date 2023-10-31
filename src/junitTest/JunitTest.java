package junitTest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JunitTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(4, 3);
        assertEquals(12, result);
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(10, 2);
        assertEquals(5.0, result, 0.001);
    }

    @Test
    public void Add() {

        // Arrange
        Kalky calc = new Kalky(2,3);
        int expected = 5;

        // Act
        int actual = calc.add();

        // Assert
        assertEquals(expected, actual);
    }


}
