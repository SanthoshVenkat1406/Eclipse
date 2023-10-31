package com.example.demo.entities;



import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TicketBooking {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fromLocation;
    private String toLocation;
    private Date TravelDate;
    private String travelClass;
    private double ticketPrice;
    private String journeyType;
	
	 public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFromLocation() {
		return fromLocation;
	}
	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}
	public String getToLocation() {
		return toLocation;
	}
	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}
	public Date getTravelDate() {
		return TravelDate;
	}
	public void setTravelDate(Date travelDate) {
		TravelDate = travelDate;
	}
	public String getTravelClass() {
		return travelClass;
	}
	public void setTravelClass(String travelClass) {
		this.travelClass = travelClass;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public String getJourneyType() {
		return journeyType;
	}
	public void setJourneyType(String journeyType) {
		this.journeyType = journeyType;
	}
	public TicketBooking(Long id, String fromLocation, String toLocation, Date travelDate, String travelClass,
			double ticketPrice, String journeyType) {
		super();
		this.id = id;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		TravelDate = travelDate;
		this.travelClass = travelClass;
		this.ticketPrice = ticketPrice;
		this.journeyType = journeyType;
	}
	public TicketBooking() {
		super();
	}
	public TicketBooking(String fromLocation, String toLocation, Date travelDate, String travelClass,
			double ticketPrice, String journeyType) {
		super();
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		TravelDate = travelDate;
		this.travelClass = travelClass;
		this.ticketPrice = ticketPrice;
		this.journeyType = journeyType;
	}
	

}
