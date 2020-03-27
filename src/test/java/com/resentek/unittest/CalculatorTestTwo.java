package com.resentek.unittest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CalculatorTestTwo {
    private Logger logger = LoggerFactory.getLogger(CalculatorTestTwo.class);

    @Mock
    Calculator mockedCalculator;

    @FastTest
    void testMockedAdd() {

        //GIVEN
        logger.info("-- given --");
        when(mockedCalculator.add(1,1)).thenReturn(3);

        //WHEN
        Integer result = mockedCalculator.add(1,1);

        //THEN
        verify(mockedCalculator,times(1)).add(1,1);
        assertEquals(3, result, "1+1=3");
    }
}
