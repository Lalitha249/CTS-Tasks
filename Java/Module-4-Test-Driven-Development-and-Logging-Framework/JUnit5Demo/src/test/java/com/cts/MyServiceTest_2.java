package com.cts;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest_2 {
@Test
void testVerify() {
	ExternalApi mockapi = Mockito.mock(ExternalApi.class);
	MyService service = new MyService(mockapi);
	service.fetchData();
	verify(mockapi).getData();
}
}
