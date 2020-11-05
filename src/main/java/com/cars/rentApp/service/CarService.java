package com.cars.rentApp.service;

import java.util.List;

import com.cars.rentApp.beans.Car;

public interface CarService {
 public List<Car> findAll();
 public void rent(String plateNumber,String loue);
}
