package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Train;

public interface ViewTrainRepository extends JpaRepository<Train, String>{

}