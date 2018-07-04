package com.vehicleapi.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.vechicleapi.exception.VehicleNotFoundException;
import com.vehicleapi.bean.Aeroplane;
import com.vehicleapi.bean.Car;
import com.vehicleapi.bean.Drone;
import com.vehicleapi.bean.Boat;
import com.vehicleapi.bean.Vehicle;
import com.vehicleapi.repository.VehicleRepository;
import com.vehicleapi.utils.VehicleApiConstants;

@RestController
public class VehicleController{

	@Autowired
	private VehicleRepository vehicleRepository;

	@GetMapping("/vehicles")
	public List<Vehicle> retrieveAllVehicles() {
		return vehicleRepository.findAll();
	}

	@GetMapping("/vehicles/{id}")
	public Vehicle retrieveStudent(@PathVariable long id) throws VehicleNotFoundException {
		Optional<Vehicle> vehicle = vehicleRepository.findById(id);

		if (!vehicle.isPresent())
			throw new VehicleNotFoundException("id-" + id);

		return vehicle.get();
	}

	@DeleteMapping("/vehicles/{id}")
	public void deleteStudent(@PathVariable long id) {
		vehicleRepository.deleteById(id);
	}

	@PostMapping("/vehicles")
	public ResponseEntity<Object> createVehicle(@RequestBody Vehicle vehicle, String type) {
		
		if(type.equals(VehicleApiConstants.TYPE_AEROPLANE)){
			vehicle = new Aeroplane(vehicle.getId(), vehicle.getVehicleType(), vehicle.getVehicleModel(),
					vehicle.getVechicleName(), vehicle.getManufactureYear(), vehicle.getPrice(), vehicle.getFlyable(), vehicle.getFloatable());
		}
		else if(type.equals(VehicleApiConstants.TYPE_CAR)){
			vehicle =  new Car(vehicle.getId(), vehicle.getVehicleType(), vehicle.getVehicleModel(),
					vehicle.getVechicleName(), vehicle.getManufactureYear(), vehicle.getPrice(), vehicle.getFlyable(), vehicle.getFloatable());
		}
		else if(type.equals(VehicleApiConstants.TYPE_BOAT)){
			vehicle = new Boat(vehicle.getId(), vehicle.getVehicleType(), vehicle.getVehicleModel(),
					vehicle.getVechicleName(), vehicle.getManufactureYear(), vehicle.getPrice(), vehicle.getFlyable(), vehicle.getFloatable());
		}
		else if(type.equals(VehicleApiConstants.TYPE_DRONE)){
			vehicle = new Drone(vehicle.getId(), vehicle.getVehicleType(), vehicle.getVehicleModel(),
					vehicle.getVechicleName(), vehicle.getManufactureYear(), vehicle.getPrice(), vehicle.getFlyable(), vehicle.getFloatable());
		}
		Vehicle savedVehicle = vehicleRepository.save(vehicle);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedVehicle.getId()).toUri();

		return ResponseEntity.created(location).build();

	}
	
	@PutMapping("/vehicles/{id}")
	public ResponseEntity<Object> updateVehicle(@RequestBody Vehicle vehicle, @PathVariable long id) {

		Optional<Vehicle> vehicleOptional = vehicleRepository.findById(id);

		if (!vehicleOptional.isPresent())
			return ResponseEntity.notFound().build();

		vehicle.setId(id);
		
		vehicleRepository.save(vehicle);

		return ResponseEntity.noContent().build();
	}
}
