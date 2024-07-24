package com.designPattern.behavioral.StrategyPattern.WithStrategy;

public class SportsVehicle extends Vehicle{

	public SportsVehicle() {
		super(new SportsDriveStrategy());
	}

}
