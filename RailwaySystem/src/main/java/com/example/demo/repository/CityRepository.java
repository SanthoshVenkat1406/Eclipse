package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.City;

public interface CityRepository extends CrudRepository<City, Long> {

}
