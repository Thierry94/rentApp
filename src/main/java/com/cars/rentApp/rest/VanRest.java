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

import com.cars.rentApp.beans.Van;
import com.cars.rentApp.service.VanService;

@RestController
@CrossOrigin
@RequestMapping("/vans")
public class VanRest implements VanService {
	@Autowired
	private VanService vanService;

	@GetMapping("/")
	public List<Van> findAll() {
		// TODO Auto-generated method stub
		return vanService.findAll();
	}

	@PutMapping("/{plateNumber}")
	public void rent(@PathVariable String plateNumber, @RequestParam String louer) {
		// TODO Auto-generated method stub
		vanService.rent(plateNumber, louer);

	}

}
