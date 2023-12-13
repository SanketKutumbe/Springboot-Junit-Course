package edu.poc.junit5.junit.testOrderPOC;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class MethodOrderMethodName {

    @Test
    void testA(){
        System.out.println( "Executing method testA");
    }



    @Test
    void testD(){
        System.out.println( "Executing method testD");
    }
    @Test
    void testC(){
        System.out.println( "Executing method testC");
    }

    @Test
    void testB(){
        System.out.println( "Executing method testB");
    }
}
