package com.designPattern.behavioral.StrategyPattern.WithStrategy;

public class OffRoadVehicle extends Vehicle{

	public OffRoadVehicle() {
		super(new SportsDriveStrategy());
	}

}
