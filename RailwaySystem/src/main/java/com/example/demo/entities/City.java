package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class City {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 

	    public City() {
		super();
	}

		public City(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

		public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		@Column(name="city_name")
		private String name;

		@Override
		public String toString() {
			return "City [id=" + id + ", name=" + name + "]";
		}
		
}
