package com.resentek.unittest;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTest {

    Integer value;

    @FastTest
    @DisplayName("Calculator.add(1,1)")
    @EnabledOnOs({OS.LINUX})
    @Order(1)
    void testAdd(TestReporter reporter){
        //GIVEN
        Integer a = 1, b = 1;
        //WHEN
        value = (new Calculator()).add(a, b);
        //THEN
        assertEquals(2, value,"1+1=2");
        reporter.publishEntry("add() completed");
    }

    @FastTest
    @Order(2)
    void testSub() {
        assertEquals(2, value, "2=2");
    }

}
