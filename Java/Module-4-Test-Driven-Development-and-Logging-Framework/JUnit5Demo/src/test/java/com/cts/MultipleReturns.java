package com.cts;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MultipleReturns {
@Test
void testMultipleReturns()
{
	ExternalApi mockApi = Mockito.mock(ExternalApi.class);
	 when(mockApi.getData())
     .thenReturn("First")
     .thenReturn("Second")
     .thenReturn("Third");

MyService service = new MyService(mockApi);

assertEquals("First", service.fetchData());
assertEquals("Second", service.fetchData());
assertEquals("Third", service.fetchData());
}
}
