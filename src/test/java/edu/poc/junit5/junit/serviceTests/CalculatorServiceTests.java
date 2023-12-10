package edu.poc.junit5.junit.serviceTests;

import edu.poc.junit5.junit.service.CalculatorService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Testing Calculator service methods")
public class CalculatorServiceTests {

    @DisplayName("Test 1-2=-1")
    @Test
    public void testSubstraction(){
        CalculatorService calculatorService = new CalculatorService();
        int firstNumber = 1;
        int secondNumber = 2;
        int actualResult = calculatorService.substraction(firstNumber, secondNumber);
        int expectedResult = -1;
        assertEquals(expectedResult, actualResult);
    }

    @DisplayName("Test 1-2 not equal to 3")
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

    @DisplayName("Test 1+2=3")
    @Test
    public void testAddition_WhenTwoIntegersAreAdded_ShouldReturnThree(){
        CalculatorService calculatorService = new CalculatorService();
        int firstNumber = 1;
        int secondNumber = 2;
        int actualResult = calculatorService.addition(firstNumber, secondNumber);
        int expectedResult = 3;
        String errorMessage = "Adding "+secondNumber+" to "+firstNumber+" is not generating expected result";
        assertEquals(expectedResult, actualResult, ()->errorMessage);
    }
}
