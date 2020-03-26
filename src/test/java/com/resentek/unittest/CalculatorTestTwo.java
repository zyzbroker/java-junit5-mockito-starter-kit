package com.resentek.unittest;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CalculatorTestTwo {

    @Mock
    Calculator mockedCalculator;

    @FastTest
    void testMockedAdd() {
        //GIVEN
        when(mockedCalculator.add(1,1)).thenReturn(2);

        //WHEN
        Integer result = mockedCalculator.add(1,1);

        //THEN
        assertEquals(2, result, "1+1=2");
    }
}
