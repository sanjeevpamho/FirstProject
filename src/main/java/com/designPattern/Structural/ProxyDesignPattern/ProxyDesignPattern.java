package com.designPattern.Structural.ProxyDesignPattern;

public class ProxyDesignPattern {
	public static void main(String[] args) {
      EmployeeDAO empTableObj = new EmployeeDaoProxy();
      try {
	//	empTableObj.create("USER", new EmployeeDo());
		empTableObj.delete("ADMIN", 0);
		System.out.println("Operation Successful");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
