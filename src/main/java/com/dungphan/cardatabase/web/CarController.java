package com.dungphan.cardatabase.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dungphan.cardatabase.domain.Car;
import com.dungphan.cardatabase.domain.CarRepository;

@RestController
public class CarController {
	
	private final CarRepository repository;
	
	public CarController(CarRepository repository) {
		this.repository = repository;
		}
	
	@GetMapping("/cars")
	public Iterable<Car> getCars() {
		return repository.findAll();
	}
}