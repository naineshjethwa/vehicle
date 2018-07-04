package com.vehicleapi.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public abstract class Vehicle implements Serializable {

	@Id
	@GeneratedValue
	private Long id;
	
	
	public Vehicle(){
		
	}
	
	 String vehicleType;
	 String vehicleModel;
	 String vechicleName;
	 String manufactureYear;
	 Double price;
	 String flyable;
	 String floatable;
	 
	 public String getFlyable() {
		return flyable;
	}



	public void setFlyable(String flyable) {
		this.flyable = flyable;
	}



	public String getFloatable() {
		return floatable;
	}



	public void setFloatable(String floatable) {
		this.floatable = floatable;
	}



	public Vehicle(Long id, String vehicleType, String vehicleModel, String vechicleName, String manufactureYear,
			Double price, String flyable, String floatable) {
		super();
		this.id = id;
		this.vehicleType = vehicleType;
		this.vehicleModel = vehicleModel;
		this.vechicleName = vechicleName;
		this.manufactureYear = manufactureYear;
		this.price = price;
		this.flyable = flyable;
		this.floatable = floatable;
	}

	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public String getVechicleName() {
		return vechicleName;
	}
	public void setVechicleName(String vechicleName) {
		this.vechicleName = vechicleName;
	}
	public String getManufactureYear() {
		return manufactureYear;
	}
	public void setManufactureYear(String manufactureYear) {
		this.manufactureYear = manufactureYear;
	}
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}


	
	
}
