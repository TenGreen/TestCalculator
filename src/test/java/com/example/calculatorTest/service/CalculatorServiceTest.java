package com.example.calculatorTest.service;

import com.example.calculatorTest.exeption.DivisionByZeroException;
import com.example.calculatorTest.servise.CalculatorService;
import com.example.calculatorTest.servise.impl.CalculatorServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    void plusPositive() {
        int actual = calculatorService.plus(5, 1);
        assertEquals(6, actual);
    }

    @Test
    void plusNegative() {
        int actual = calculatorService.plus(-5, -1);
        assertEquals(-6, actual);
    }
    @Test
    void minusPositive() {
        int actual = calculatorService.minus(5, 1);
        assertEquals(4, actual);
    }

    @Test
    void minusNegative() {
        int actual = calculatorService.minus(-5, -1);
        assertEquals(-4, actual);
    }
    @Test
    void dividePositive() {
        int actual = calculatorService.divide(5, 1);
        assertEquals(5, actual);
    }

    @Test
    void divideNegative() {
        int actual = calculatorService.divide(-5, -1);
        assertEquals(5, actual);
    }
    @Test
    void multiplyPositive() throws DivisionByZeroException {
        int actual = calculatorService.divide(5, 1);
        assertEquals(5, actual);
    }

    @Test
    void multiplyNegative() {
        int actual = calculatorService.multiply(-5, -1);
        assertEquals(5, actual);
    }

    @Test
    void divisionByZero() {
        assertThrows(DivisionByZeroException.class, () -> calculatorService.divide(5, 0));
    }
}
