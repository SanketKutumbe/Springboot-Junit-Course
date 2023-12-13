package edu.poc.junit5.junit.testOrderPOC;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderIndex {

    @Order(1)
    @Test
    void testA(){
        System.out.println( "Executing method testA");
    }

    @Order(3)

    @Test
    void testB(){
        System.out.println( "Executing method testB");
    }

    @Order(2)

    @Test
    void testC(){
        System.out.println( "Executing method testC");
    }

    @Order(4)

    @Test
    void testD(){
        System.out.println( "Executing method testD");
    }
}
