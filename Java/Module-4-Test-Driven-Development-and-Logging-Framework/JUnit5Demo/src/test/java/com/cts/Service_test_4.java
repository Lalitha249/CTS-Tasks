package com.cts;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Service_test_4 {
@Test
public void testVoidMethod() {
	ExternalAPi_4 mockapi = Mockito.mock(ExternalAPi_4.class);
	doNothing().when(mockapi).sendData();
	MyService_4 ser= new MyService_4(mockapi);
	ser.procesData();
	//verify
	verify(mockapi).sendData();
}
}
