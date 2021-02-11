package com.mongo.demo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.demo.entity.Trip;

public interface TripRepository extends MongoRepository<Trip, String > {

	public Trip findByCountryName(String countryName);
	public List<Trip> findByDescription(String description);
}
