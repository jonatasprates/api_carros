package com.example.carros.domain;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroService {
	
	@Autowired
	private CarroRepository repository;
	
	public Iterable<Carro> getCarros() {
		return repository.findAll();
	}
	
	public Optional<Carro> getCarroById(Long id) {
		return repository.findById(id);
	}

}
