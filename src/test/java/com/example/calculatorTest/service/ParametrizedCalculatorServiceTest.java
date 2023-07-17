package com.example.calculatorTest.service;

import com.example.calculatorTest.servise.impl.CalculatorServiceImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

public class ParametrizedCalculatorServiceTest {
    CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
    static Stream<Arguments> dataForPlus() {
        return Stream.of(Arguments.of(3,5,8),
                Arguments.of(201,38,239),
                Arguments.of(-111, 11,-100),
                Arguments.of(-111,-11, -122)
        );
    }

    @ParameterizedTest
    @MethodSource("dataForPlus")
    void testPlus(int n1, int n2, int expected) {
        assertEquals(expected, calculatorService.plus(n1,n2) );
    }
    static Stream<Arguments> dataForMinus() {
        return Stream.of(Arguments.of(3,5,-2),
                Arguments.of(200,30,170),
                Arguments.of(-111, 11,-122),
                Arguments.of(-111,-11, -100)
        );
    }

    @ParameterizedTest
    @MethodSource("dataForMinus")
    void testMinus(int n1, int n2, int expected) {
        assertEquals(expected, calculatorService.minus(n1,n2) );
    }
    static Stream<Arguments> dataForMultiply() {
        return Stream.of(Arguments.of(3,5,15),
                Arguments.of(201,38,7638),
                Arguments.of(-111, 11,-1221),
                Arguments.of(-111,-11, 1221)
        );
    }
    @ParameterizedTest
    @MethodSource("dataForMultiply")
    void testMultiply(int n1, int n2, int expected) {
        assertEquals(expected, calculatorService.multiply(n1,n2) );
    }
    static Stream<Arguments> dataForDivide() {
        return Stream.of(Arguments.of(30,5,6),
                Arguments.of(201,38,5),
                Arguments.of(-111, 11,-10),
                Arguments.of(-111,-11, 10)
        );
    }
    @ParameterizedTest
    @MethodSource("dataForDivide")
    void testDivide(int n1, int n2, int expected) {
        assertEquals(expected, calculatorService.divide(n1,n2) );
    }

}
