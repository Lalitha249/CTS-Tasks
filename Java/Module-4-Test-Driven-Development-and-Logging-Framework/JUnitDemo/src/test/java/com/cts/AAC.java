package com.cts;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AAC {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Before Test");
    }

    @Test
    public void addition() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int res = calculator.add(a, b);

        // Assert
        assertEquals(30, res);
    }

    @After
    public void tearDown() {
        System.out.println("After Test");
    }
}