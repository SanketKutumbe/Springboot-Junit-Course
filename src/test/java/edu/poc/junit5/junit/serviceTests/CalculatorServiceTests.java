package edu.poc.junit5.junit.serviceTests;

import edu.poc.junit5.junit.service.CalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTests {
    @Test
    public void testSubstraction(){
        CalculatorService calculatorService = new CalculatorService();
        int firstNumber = 1;
        int secondNumber = 2;
        int actualResult = calculatorService.substraction(firstNumber, secondNumber);
        int expectedResult = -1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSubstractionWithErrorMessage(){
        CalculatorService calculatorService = new CalculatorService();
        int firstNumber = 1;
        int secondNumber = 2;
        int actualResult = calculatorService.substraction(firstNumber, secondNumber);
        int expectedResult = 3;
        String errorMessage = "Deducting "+secondNumber+" from "+firstNumber+" is not generating expected result";
        assertEquals(expectedResult, actualResult, ()->errorMessage);
    }
}
