package com.example.demo.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Booking {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date travelDate;
    // Add other booking details as needed

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date gettravelDate() {
		return travelDate;
	}

	public void settravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public static long getMonthlyBookingCount(Date date) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Booking() {
		super();
	}

    // Getters and setters
}

