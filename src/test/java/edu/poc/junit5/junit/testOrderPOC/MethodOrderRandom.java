package edu.poc.junit5.junit.testOrderPOC;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Random.class)
public class MethodOrderRandom {

    @Test
    void testA(){
        System.out.println( "Executing method testA");
    }

    @Test
    void testB(){
        System.out.println( "Executing method testB");
    }

    @Test
    void testC(){
        System.out.println( "Executing method testC");
    }

    @Test
    void testD(){
        System.out.println( "Executing method testD");
    }
}
