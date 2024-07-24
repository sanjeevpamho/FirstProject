package com.designPattern.Creational.abstractFactoryPattern;


public class ComputerFactory {
	public static Computer getComputer(ComputerAbstractFactory computerAbstractFactory){
		
		return computerAbstractFactory.createComputer();
	}
}
