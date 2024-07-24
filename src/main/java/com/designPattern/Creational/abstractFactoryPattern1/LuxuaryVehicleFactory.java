package com.designPattern.Creational.abstractFactoryPattern1;

public class LuxuaryVehicleFactory implements AbstractVehicleFactory {
	String vehicleType;

	public LuxuaryVehicleFactory(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Override
	public Vehicle getVehicle() {
		// TODO Auto-generated method stub
		if (vehicleType.equalsIgnoreCase("MERCEDES"))
			return new LuxuaryVehicleMercedes();
		else if (vehicleType.equalsIgnoreCase("BMW"))
			return new LuxuaryVehicleBMW();
		else
			return null;
	}

}
