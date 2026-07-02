package com.cts;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class MyServiceTest {
@Test
void  testAPI() {
	ExternalApi api = mock(ExternalApi.class);
	//stub the method
	when(api.getData()).thenReturn("Mock data");
	//injuct the method
	MyService service = new MyService(api);
	 String result = service.fetchData();
	 assertEquals("Mock data",result);
}
}
