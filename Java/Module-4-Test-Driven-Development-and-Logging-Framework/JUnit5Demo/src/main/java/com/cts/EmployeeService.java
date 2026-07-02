package com.cts;

public class EmployeeService {
private EmployeeAPI api;
public EmployeeService(EmployeeAPI api)
{
	this.api = api;
}
public void fetchEmployee()
{
	api.getEmployee(101);
}
}
