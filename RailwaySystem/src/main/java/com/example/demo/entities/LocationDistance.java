package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LocationDistance {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String fromLocation;
	    private double distanceKilometers;
	    public LocationDistance() {
			super();
		}
		public LocationDistance(String fromLocation, String toLocation, double distanceKilometers) {
			super();
			this.fromLocation = fromLocation;
			this.toLocation = toLocation;
			this.distanceKilometers = distanceKilometers;
		}
		private String toLocation;
	    
		public Long getId() {
			return id;
		}
		public LocationDistance(Long id, String fromLocation, String toLocation, double distanceKilometers) {
			super();
			this.id = id;
			this.fromLocation = fromLocation;
			this.toLocation = toLocation;
			this.distanceKilometers = distanceKilometers;
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
		public double getDistanceKilometers() {
			return distanceKilometers;
		}
		public void setDistanceKilometers(double distanceKilometers) {
			this.distanceKilometers = distanceKilometers;
		}
}	