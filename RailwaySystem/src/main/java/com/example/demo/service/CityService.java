package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.City;
import com.example.demo.repository.CityRepository;

@Service
public class CityService {
    @Autowired
    CityRepository cityRepository;
 
    public Iterable<City> getAllCities() {
    	Iterable<City> cities=cityRepository.findAll();
		return cities;
    }
}
