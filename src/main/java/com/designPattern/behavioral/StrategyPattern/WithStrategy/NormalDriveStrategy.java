package com.designPattern.behavioral.StrategyPattern.WithStrategy;

public class NormalDriveStrategy implements DriveStrategy {

	@Override
	public void drive() {
		System.out.println("Normal Drive Capability");
	}

}
