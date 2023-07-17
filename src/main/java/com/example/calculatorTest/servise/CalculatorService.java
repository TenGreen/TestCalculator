package com.example.calculatorTest.servise;

import com.example.calculatorTest.exeption.DivisionByZeroException;

public interface CalculatorService {
    int plus(int a, int b);

    int minus(int a, int b);

    int multiply(int a, int b);

    int divide(int a, int b) throws DivisionByZeroException;
}

