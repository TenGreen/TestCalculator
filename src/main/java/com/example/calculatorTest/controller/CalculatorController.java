package com.example.calculatorTest.controller;

import com.example.calculatorTest.exeption.DivisionByZeroException;
import com.example.calculatorTest.servise.impl.CalculatorServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

public class CalculatorController {


    @RestController
    @RequestMapping("/calculator")
    public class calculatorController {
        private final CalculatorServiceImpl service;

        public calculatorController(CalculatorServiceImpl service) {
            this.service = service;
        }

        @GetMapping()
        public String greating() {
            return "Добро пожаловать в кальулятор";
        }

        @GetMapping("/plus")
        public String plus(@RequestParam("num1") int a, @RequestParam("num2") int b) {
            int result = service.plus(a, b);
            return String.format("%s + %s = %s", a, b, result);
        }


        @GetMapping("/minus")
        public String minus(@RequestParam("num1") int a, @RequestParam("num2") int b) {
            int result = service.minus(a, b);
            return String.format("%s - %s = %s", a, b, result);
        }

        @GetMapping("/multiply")
        public String multiply(@RequestParam("num1") int a, @RequestParam("num2") int b) {
            int result = service.multiply(a, b);
            return String.format("%s * %s = %s", a, b, result);
        }

        @GetMapping("/divide")
        public String divide(@RequestParam("num1") int a, @RequestParam("num2") int b) {
            int result = service.divide(a, b);
            return String.format("%s / %s = %s", a, b, result);
        }
    }
}
