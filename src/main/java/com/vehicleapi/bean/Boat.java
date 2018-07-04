package com.vehicleapi.bean;

import com.vehicleapi.utils.VehicleApiConstants;

public class Boat extends  Vehicle {
	
	public Boat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Boat(Long id, String vehicleType, String vehicleModel, String vechicleName, String manufactureYear,
			Double price, String flyable, String floatable) {
		super(id, VehicleApiConstants.TYPE_BOAT, vehicleModel, vechicleName, manufactureYear, price, flyable, VehicleApiConstants.FLOATABLE);
	}


}
