package com.vehicleapi.bean;

import com.vehicleapi.utils.VehicleApiConstants;

public class Aeroplane extends  Vehicle {
	
	public Aeroplane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aeroplane(Long id, String vehicleType, String vehicleModel, String vechicleName, String manufactureYear,
			Double price, String flyable, String floatable) {
		super(id, VehicleApiConstants.TYPE_AEROPLANE, vehicleModel, vechicleName, manufactureYear, price, VehicleApiConstants.FLYABLE, floatable);
	}


	
	
}
