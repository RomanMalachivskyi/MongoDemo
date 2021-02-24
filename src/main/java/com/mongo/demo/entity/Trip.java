package com.mongo.demo.entity;

import org.springframework.data.annotation.Id;

public class Trip {
	@Id
	public String id;

	public String countryName;
	public String description;

	public Trip(final String countryName, final String description) {
		this.countryName = countryName;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Trip{" +
			"id='" + id + '\'' +
			", countryName='" + countryName + '\'' +
			", description='" + description + '\'' +
			'}';
	}
}
