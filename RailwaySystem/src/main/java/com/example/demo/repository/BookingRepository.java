package com.example.demo.repository;

import java.sql.Date;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Booking;

public interface BookingRepository extends CrudRepository<Booking, Long> {

	long countBookingsByTravelDateBetween(Date fromDate, Date toDate);

}
