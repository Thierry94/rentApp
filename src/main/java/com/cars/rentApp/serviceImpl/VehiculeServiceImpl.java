package com.cars.rentApp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cars.rentApp.beans.Vehicule;
import com.cars.rentApp.repository.VehiculeRepository;
import com.cars.rentApp.service.VehiculeService;

@Service
public class VehiculeServiceImpl implements VehiculeService{
@Autowired
private VehiculeRepository vehiculeRepository;

@Override
public List<Vehicule> findAll() {
	// TODO Auto-generated method stub
	return (List<Vehicule>) vehiculeRepository.findAll();
	
}


}
