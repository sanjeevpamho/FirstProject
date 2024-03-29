package com.designPattern.builder;


public class TestBuilderPattern {

	public static void main(String[] args) {

		Computer comp=new Computer.ComputerBuilder("4gb","500gb")
				.setBluetoothEnabled(true)
			//	.setGraphicsCardEnabled(true)
				.build();
		
		System.out.println(comp);
		
		
		
	}
	
}
