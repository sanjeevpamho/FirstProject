package com.designPattern.behavioral.StrategyPattern.WithStrategy;

public class GoodsVehicle extends Vehicle {

	public GoodsVehicle() {
		super(new NormalDriveStrategy());
	}

}
