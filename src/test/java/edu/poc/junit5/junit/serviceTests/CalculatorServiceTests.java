package edu.poc.junit5.junit.serviceTests;

import edu.poc.junit5.junit.service.CalculatorService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
//        System.out.println("Executing testSubstraction method");

        // Arrange
        int firstNumber = 1;
        int secondNumber = 2;
        int expectedResult = -1;

        // Act
        int actualResult = calculatorService.substraction(firstNumber, secondNumber);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Disabled("TODO: Still need to work on it.")
    @DisplayName("Test 1-2 not equal to 3")
    @Test
    public void testSubstractionWithErrorMessage(){
        // Writing print statement for the sake of lifecycle execution flow
//        System.out.println("Executing testSubstractionWithErrorMessage method");

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
//        System.out.println("Executing testAddition_WhenTwoIntegersAreAdded_ShouldReturnThree method");

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

    @DisplayName("Test 2/0")
    @Test
    public void testDivision_WhenDividendIsDividedByDivisor_ShouldThrowArithmaticException(){

        // Arrange
        int dividend = 2;
        int divisor = 0;
        String expectedResult = "/ by zero";
        // Act and Assert-1
        ArithmeticException actualResult = assertThrows(ArithmeticException.class, () ->
            calculatorService.division(dividend, divisor)
        , () -> "Thrown Arithmatic exception");

        // Assert
        assertEquals(expectedResult, actualResult.getMessage(), ()->"Exception not thrown");

    }

    @DisplayName("Parameterised Test for addition")
    @ParameterizedTest
    //@MethodSource("inputMethod")
    @MethodSource
    public void testAdditionWithParameters_WhenTwoIntegersAreAdded_ShouldReturnThree(int firstNumber, int secondNumber, int expectedResult){
        // Arrange
        String errorMessage = "Adding "+secondNumber+" to "+firstNumber+" is not generating expected result";

        // Act
        int actualResult = calculatorService.addition(firstNumber, secondNumber);

        // Assert
        assertEquals(expectedResult, actualResult, ()->errorMessage);
    }

    private static Stream<Arguments> inputMethod(){
        Stream<Arguments> result = Stream.of(
                Arguments.of(1,2,3),
                Arguments.of(-1,10,9)
        );
        return result;
    }

    private static Stream<Arguments> testAdditionWithParameters_WhenTwoIntegersAreAdded_ShouldReturnThree(){
        Stream<Arguments> result = Stream.of(
                Arguments.of(1,2,13),
                Arguments.of(-1,10,9)
        );
        return result;
    }

    @DisplayName("Parameterized Test for substraction")
    @ParameterizedTest
//    @CsvSource({
//            "1,2,-1",
//            "5,4,0",
//            "10,1,9"
//    })
    @CsvFileSource(resources = "/input.csv")
    public void testSubstraction(int firstNumber, int secondNumber, int expectedResult){
        // Writing print statement for the sake of lifecycle execution flow
//        System.out.println("Executing testSubstraction method");

        // Act
        int actualResult = calculatorService.substraction(firstNumber, secondNumber);

        // Assert
        assertEquals(expectedResult, actualResult);
    }
}
