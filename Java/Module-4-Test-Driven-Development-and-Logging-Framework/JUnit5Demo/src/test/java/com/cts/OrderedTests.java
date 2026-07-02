package com.cts;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {
	@Test
	@Order(1)
	void first()
	{
		System.out.println("fist test");
	}
	@Test
	@Order(3)
	void sample()
	{
		System.out.println("same test");
	}
	@Test
	@Order(1)
	void test()
	{
		System.out.println("predefined first test");
	}
}
