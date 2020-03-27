package com.resentek.unittest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {

    private Logger logger = LoggerFactory.getLogger(Calculator.class);

    public Integer add(Integer a, Integer b){
        logger.info("Calculator.add({},{}) returns {} --", a, b, a + b);
        return a + b;
    }
}
