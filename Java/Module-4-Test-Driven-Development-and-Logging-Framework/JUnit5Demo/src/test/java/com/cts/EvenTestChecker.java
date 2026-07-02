package com.cts;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EvenTestChecker {
@ParameterizedTest
@ValueSource(ints= {2,4,6})
void TestEvennumber(int number)
{
	EvenChecker c = new EvenChecker();
	assertTrue(c.isEven(number));
}
}
