package com.premaseem.factorymethod1;

public abstract class VehicleDriver {

	void doCleaning(){
		getVehicle().clean();	
	}
	
	void doSafeDriving(){
		getVehicle().drive();
	}
	
	abstract Vehicle getVehicle();	
}

class CarDriver extends VehicleDriver{

	@Override
    Vehicle getVehicle() {
	    return new Car();
    }
	
}

class BusDriver extends VehicleDriver{

	@Override
    Vehicle getVehicle() {
	    return new Bus();
    }
	
}