package com.designPattern.Creational.abstractFactoryPattern;


public class TestAbstractPattern {
	public static void main(String[] args) {
		Computer computer=ComputerFactory.getComputer(new PCFactory("2GB", "2GHZ", "500GB"));
		
		System.out.println(computer);
	}
}
