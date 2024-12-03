package com.course.mockito;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.random.RandomGenerator;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;

class NumberRaterTest {

    private RandomGenerator randomGenerator;
    private NumberRater numberRater;

    @BeforeEach
    public void setUp() {
        randomGenerator = Mockito.mock(RandomGenerator.class);
        numberRater  = new NumberRater(randomGenerator);
    }

    @Test
    void shouldReturnSmall() {
        Mockito.when(randomGenerator.nextInt(anyInt(), anyInt())).thenReturn(0);
        String grade = numberRater.rateRandomNumber();
        assertEquals("SMALL", grade);
    }

    @Test
    void shouldReturnMedium() {
        Mockito.when(randomGenerator.nextInt(anyInt(), anyInt())).thenReturn(50);
        String grade = numberRater.rateRandomNumber();
        assertEquals("MEDIUM", grade);
    }

    @Test
    void shouldReturnBig() {
        Mockito.when(randomGenerator.nextInt(anyInt(), anyInt())).thenReturn(90);
        String grade = numberRater.rateRandomNumber();
        assertEquals("BIG", grade);
    }
}