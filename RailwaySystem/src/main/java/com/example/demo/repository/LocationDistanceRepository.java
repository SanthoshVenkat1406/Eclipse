package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.LocationDistance;

public interface LocationDistanceRepository extends CrudRepository<LocationDistance, Long>{


	LocationDistance findByFromLocationAndToLocation(String fromLocation, String toLocation);

}
