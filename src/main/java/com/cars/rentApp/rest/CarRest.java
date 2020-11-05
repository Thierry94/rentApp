package com.cars.rentApp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cars.rentApp.beans.Car;
import com.cars.rentApp.service.CarService;

@RestController
@CrossOrigin
@RequestMapping("/cars")
public class CarRest implements CarService{
    @Autowired
    private CarService carService;
    @GetMapping("/")
	public List<Car> findAll() {
		// TODO Auto-generated method stub
		return carService.findAll();
	}
	@PutMapping("/{plateNumber}")
	public void rent(@PathVariable String plateNumber,@RequestParam String louer) {
		// TODO Auto-generated method stub
		carService.rent(plateNumber,louer);
		
	}

}
