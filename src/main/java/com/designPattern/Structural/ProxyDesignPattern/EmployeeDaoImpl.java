package com.designPattern.Structural.ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDAO{

	@Override
	public void create(String client, EmployeeDo obj) throws Exception {
		// created new row in employee table
		System.out.println("created new row in employee table");
	}

	@Override
	public void delete(String client, int employeeId) throws Exception {
		// deleted row in employee table
		System.out.println("deleted row in employee table : " + employeeId);
		
	}

	@Override
	public EmployeeDo get(String client, int employeeId) throws Exception {
		// fetch row
		System.out.println("fetching data from db");
		return new EmployeeDo();
	}

}
