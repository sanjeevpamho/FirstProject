package com.designPattern.Creational.abstractFactoryPattern1;

import java.util.ArrayList;
import java.util.List;

public class TestVehicleFactory {
	public static void main(String[] args) {
		List<Vehicle> list = new ArrayList<Vehicle>();

		AbstractVehicleFactory vehicleFactory1 = new LuxuaryVehicleFactory("BMW");
		Vehicle bmw = VehicleFactory.getVehicleFromFactory(vehicleFactory1);
		list.add(bmw);

		AbstractVehicleFactory vehicleFactory2 = new LuxuaryVehicleFactory("mercedes");
		Vehicle mercedes = VehicleFactory.getVehicleFromFactory(vehicleFactory2);
		list.add(mercedes);

		AbstractVehicleFactory vehicleFactory3 = new OrdinaryVehicleFactory("Shift");
		Vehicle shift = VehicleFactory.getVehicleFromFactory(vehicleFactory3);
		list.add(shift);

		AbstractVehicleFactory vehicleFactory4 = new OrdinaryVehicleFactory("Hyundai");
		Vehicle hyundai = VehicleFactory.getVehicleFromFactory(vehicleFactory4);
		list.add(hyundai);

		for (Vehicle vehicle : list) {
			vehicle.average();
		}
	}
}
