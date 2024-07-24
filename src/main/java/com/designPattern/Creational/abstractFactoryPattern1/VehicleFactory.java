package com.designPattern.Creational.abstractFactoryPattern1;

public class VehicleFactory {

	public static Vehicle getVehicleFromFactory(AbstractVehicleFactory abstractVehicleFactory) {

		return abstractVehicleFactory.getVehicle();
	}
}
