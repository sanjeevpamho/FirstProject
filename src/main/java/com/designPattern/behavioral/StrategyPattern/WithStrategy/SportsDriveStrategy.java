package com.designPattern.behavioral.StrategyPattern.WithStrategy;

public class SportsDriveStrategy implements DriveStrategy{

	@Override
	public void drive() {
		System.out.println("Sports Drive Capability");
	}

}
