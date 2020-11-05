package com.cars.rentApp.service;

import java.util.List;

import com.cars.rentApp.beans.Van;

public interface VanService {
 public List<Van> findAll();
 public void rent(String plateNumber,String loue);
}
