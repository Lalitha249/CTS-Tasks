package com.cts;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BankAccountTest {
	private BankAccount account;
	@BeforeEach
	void Setup() {
		account = new BankAccount();
		System.out.println("Before test");
	}
	@Test
	@Order(1)
	void depositTest()
	{
		int amnt =500;
		account.deposit(amnt);
		assertEquals(1500,account.getBalance());
	}
	@Order(2)
	void withDrawTest()
	{
		account.withdraw(300);
		assertEquals(700,account.getBalance());
	}
	@Test
	@Order(3)
	void voidExceptionTest(){
		assertThrows(IllegalArgumentException.class,()->{account.withdraw(5000);});
	     
		}
	@AfterEach()
	void teardown()
	{
		System.out.println("after test");
		
	}
}
