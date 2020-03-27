package com.resentek.unittest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ExtendWith(MockitoExtension.class)
public class MockTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @BeforeEach
    void initMockPerMethod() {
        logger.info("-- MockitoAnnotations.initMocks --");
        MockitoAnnotations.initMocks(this);
    }
}
