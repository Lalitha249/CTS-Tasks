package com.cts;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ExceptionThrowerTest {
@Test
void TestException() {
	ExceptionThrower obj = new ExceptionThrower();
	assertThrows(ArithmeticException.class,()->{
	obj.throwException();
	});
}
}
