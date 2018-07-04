package com.vechicleapi.exception;

public class VehicleNotFoundException extends Exception {
	public VehicleNotFoundException(String id){
		System.out.println("Vehicle Not Found"+id);
	}
}
