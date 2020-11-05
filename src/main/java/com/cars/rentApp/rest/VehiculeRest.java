package com.cars.rentApp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.rentApp.beans.Vehicule;
import com.cars.rentApp.service.VehiculeService;

@RestController
@CrossOrigin
@RequestMapping("/vehicule")
public class VehiculeRest {
	@Autowired
	private VehiculeService vehiculeService;

	@GetMapping("/")
	public List<Vehicule> findAll() {
		return vehiculeService.findAll();
	}

}
