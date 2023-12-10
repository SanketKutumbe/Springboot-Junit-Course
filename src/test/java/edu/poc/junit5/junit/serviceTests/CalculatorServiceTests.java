package edu.poc.junit5.junit.serviceTests;

import edu.poc.junit5.junit.service.CalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTests {
    @Test
    public void testSubstraction(){
        CalculatorService calculatorService = new CalculatorService();
        int c = calculatorService.substraction(1, 2);
        assertEquals(-1, c);
    }
}
