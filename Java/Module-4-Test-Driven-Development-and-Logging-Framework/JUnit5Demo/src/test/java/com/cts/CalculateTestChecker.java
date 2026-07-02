package com.cts;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculateTestChecker {
@Test
public void add() {
	Calculator c = new Calculator();
	 int res=c.add(5, 10);
	 assertEquals(15,res);
}
}
