package edu.poc.junit5.junit.serviceTests;

import edu.poc.junit5.junit.service.CalculatorService;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Testing Calculator service methods")
public class CalculatorServiceTests {

    CalculatorService calculatorService;

    @BeforeAll
    static void setup(){
        System.out.println("Executing @BeforeAll setup method");
    }

    @AfterAll
    static void cleanup(){
        System.out.println("Executing @AfterAll cleanup method");
    }

    @BeforeEach
    void executeBeforeEachTest(){
        System.out.println("Executing @BeforeEach setup method");
        calculatorService = new CalculatorService();
    }

    @AfterEach
    void executeAfterEachTest(){
        System.out.println("Executing @AfterEach setup method");
    }


    @DisplayName("Test 1-2=-1")
    @Test
    public void testSubstraction(){
        // Writing print statement for the sake of lifecycle execution flow
        System.out.println("Executing testSubstraction method");

        // Arrange
        int firstNumber = 1;
        int secondNumber = 2;
        int expectedResult = -1;

        // Act
        int actualResult = calculatorService.substraction(firstNumber, secondNumber);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @DisplayName("Test 1-2 not equal to 3")
    @Test
    public void testSubstractionWithErrorMessage(){
        // Writing print statement for the sake of lifecycle execution flow
        System.out.println("Executing testSubstractionWithErrorMessage method");

        // Arrange
        int firstNumber = 1;
        int secondNumber = 2;
        int expectedResult = 3;
        String errorMessage = "Deducting "+secondNumber+" from "+firstNumber+" is not generating expected result";

        // Act
        int actualResult = calculatorService.substraction(firstNumber, secondNumber);

        // Assert
        assertEquals(expectedResult, actualResult, ()->errorMessage);
    }

    @DisplayName("Test 1+2=3")
    @Test
    public void testAddition_WhenTwoIntegersAreAdded_ShouldReturnThree(){
        // Writing print statement for the sake of lifecycle execution flow
        System.out.println("Executing testAddition_WhenTwoIntegersAreAdded_ShouldReturnThree method");

        // Arrange
        int firstNumber = 1;
        int secondNumber = 2;
        int expectedResult = 3;
        String errorMessage = "Adding "+secondNumber+" to "+firstNumber+" is not generating expected result";

        // Act
        int actualResult = calculatorService.addition(firstNumber, secondNumber);

        // Assert
        assertEquals(expectedResult, actualResult, ()->errorMessage);
    }
}
