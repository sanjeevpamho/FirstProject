package com.designPattern.Creational.abstractFactoryPattern1;

public class OrdinaryVehicleFactory implements AbstractVehicleFactory {

	String vehicleType;

	public OrdinaryVehicleFactory(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Override
	public Vehicle getVehicle() {
		// TODO Auto-generated method stub
		if (vehicleType.equalsIgnoreCase("SHIFT"))
			return new OrdinaryVehicleShift();
		else if (vehicleType.equalsIgnoreCase("HYUNDAI"))
			return new OrdinaryVehicleHyundai();
		else
			return null;
	}

}
