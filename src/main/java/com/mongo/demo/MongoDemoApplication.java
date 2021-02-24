package com.mongo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mongo.demo.entity.Trip;
import com.mongo.demo.repo.TripRepository;

@SpringBootApplication
public class MongoDemoApplication implements CommandLineRunner {

	@Autowired
	private TripRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(MongoDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of trip
		repository.save(new Trip("Nepal", "Mountains"));
		repository.save(new Trip("Spain", "See"));

		// fetch all trip
		System.out.println("Trips found with findAll():");
		System.out.println("-------------------------------");
		for (Trip trip : repository.findAll()) {
			System.out.println(trip);
		}
		System.out.println();

		// fetch an individual trip
		System.out.println("Trip found with findByCountryName('Spain'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByCountryName("Spain"));

		System.out.println("Trip found with findByDescription('See'):");
		System.out.println("--------------------------------");
		for (Trip trip : repository.findByDescription("See")) {
			System.out.println(trip);
		}

	}
}
