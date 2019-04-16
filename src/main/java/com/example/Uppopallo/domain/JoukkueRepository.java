package com.example.Uppopallo.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface JoukkueRepository extends CrudRepository<Joukkue, Long> {

	List<Joukkue> findByName(String name);
	
}