package com.vehicleapi.bean;

import com.vehicleapi.utils.VehicleApiConstants;

public class Drone extends  Vehicle {
	
	public Drone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Drone(Long id, String vehicleType, String vehicleModel, String vechicleName, String manufactureYear,
			Double price, String flyable, String floatable) {
		super(id, VehicleApiConstants.TYPE_DRONE, vehicleModel, vechicleName, manufactureYear, price, VehicleApiConstants.FLYABLE, floatable);
	}


}
