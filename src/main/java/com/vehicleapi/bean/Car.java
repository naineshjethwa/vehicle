package com.vehicleapi.bean;

import com.vehicleapi.utils.VehicleApiConstants;

public class Car extends  Vehicle {
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(Long id, String vehicleType, String vehicleModel, String vechicleName, String manufactureYear,
			Double price, String flyable, String floatable) {
		super(id, VehicleApiConstants.TYPE_CAR, vehicleModel, vechicleName, manufactureYear, price, VehicleApiConstants.ROADTRAVEL, floatable);
	}


	
	
}
