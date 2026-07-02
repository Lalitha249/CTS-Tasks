package com.cts;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Employee_Test_3 {
@Test
public void  testArgumentMatcher() {
	EmployeeAPI mockApi= Mockito.mock(EmployeeAPI.class);
	EmployeeService  service= new EmployeeService(mockApi);
	//act
	service.fetchEmployee();
	//assert
	verify(mockApi).getEmployee(anyInt());
}
}
