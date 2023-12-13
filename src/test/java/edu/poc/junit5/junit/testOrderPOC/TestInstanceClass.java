package edu.poc.junit5.junit.testOrderPOC;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

//@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestInstanceClass {

    int a = 1;
    @Test
    void testA(){
        a++;
        System.out.println( "Executing method testA "+a);
    }

    @Test
    void testB(){
        a++;
        System.out.println( "Executing method testB "+a);
    }

    @Test
    void testC(){
        a++;
        System.out.println( "Executing method testC "+a);
    }

    @Test
    void testD(){
        a++;
        System.out.println( "Executing method testD "+a);
    }

}
