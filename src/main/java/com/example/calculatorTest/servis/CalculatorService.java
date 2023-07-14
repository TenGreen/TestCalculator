package com.example.calculatorTest.servis;

package com.sky.calculator.service.impl;

import com.sky.calculator.service.ICalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    @Override
    public int plus(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        return a / b;
    }
}

